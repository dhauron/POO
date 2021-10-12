package telas.menus;

import app.App;
import classes.Biblioteca;
import classes.Filme;
import classes.Serie;
import classes.exceptions.ClassificacaoForaDoRangeException;
import classes.exceptions.InputException;
import telas.Print;
import mensagens.Mensagens;
import uteis.Categoria;
import uteis.TipoPrograma;

import java.util.ArrayList;
import java.util.Arrays;

import static mensagens.Mensagens.colorGoodMessage;
import static mensagens.Mensagens.colorQueryMessage;

public class TelaEditarPrograma extends Menu{

    private Menu menuAnterior;
    private TipoPrograma tipoPrograma;
    private String nome;
    private Integer pontuacao;
    private Categoria categoria;
    private ArrayList<Integer> epTemporadas = new ArrayList<Integer>();
    private Integer duracao;

    public TelaEditarPrograma(Menu menuAnterior){
        super(
                Mensagens.Cabecalhos.EDITAR_PROGRAMAS,
                Mensagens.Opcoes.ESCOLHER_OPCOES,
                new ArrayList<String>(Arrays.asList(
                        Mensagens.Opcoes.SALVAR,
                        Mensagens.Opcoes.VOLTAR
                )));

        this.menuAnterior = menuAnterior;
    }

    private void editarPrograma(TipoPrograma tipoPrograma){
        System.out.println(colorQueryMessage("\n"+Mensagens.Instrucoes.INFORME_NOME));
        this.nome = super.nomeCadastradoInput(App.getBiblioteca(), "Nome: ", tipoPrograma);
        this.pontuacao = super.lerIntegerInput(App.getBiblioteca(), "Pontuação: ", tipoPrograma);
        this.categoria = escolherCategoria();
    }

    public void editarFilme(Biblioteca biblioteca){
        //super.run(true, true, false, false);
        this.tipoPrograma = TipoPrograma.FILME;
        Print.printProgramas(biblioteca.getProgramas(this.tipoPrograma), this.tipoPrograma);
        this.editarPrograma(TipoPrograma.FILME);
        this.duracao = super.lerOpcao("Duração: ", 999999999);
        this.run(true, true, true, true);
    }

    public void editarSerie(Biblioteca biblioteca){
        //super.run(true, true, false, false);
        this.tipoPrograma = TipoPrograma.SERIE;
        Print.printProgramas(biblioteca.getProgramas(this.tipoPrograma), this.tipoPrograma);
        this.editarPrograma(TipoPrograma.SERIE);
        this.adicionarTemporada();
        this.run(true, true, true, true);
    }

    private void adicionarTemporada(){
        int count = 1;
        while (true){
            System.out.println(colorQueryMessage("\n" + Mensagens.Opcoes.ADICIONAR_TEMPORADA + " " + count++ + "?"));
            Menu menu = new Menu("", Mensagens.Opcoes.ESCOLHER_OPCOES, null);
            menu.setOpcoes(
                new ArrayList<String>(Arrays.asList(
                        Mensagens.Opcoes.SIM,
                        Mensagens.Opcoes.NAO
                )));
            menu.run(false, true, true, true);

            if (menu.opcaoSelecionada == 1) {
                this.epTemporadas.add(super.lerOpcao("\n" + Mensagens.Opcoes.QTD_EPISODIOS, 999999999));
            }
            else{
                menu = null;
                break;
            }
        }
    }

    private Categoria escolherCategoria(){
        System.out.println("\n" + Categoria.getCategorias());
        Integer categoria = super.lerOpcao("Categoria: ", Categoria.values().length);

        return Categoria.values()[categoria-1];
    }

    private void salvarDados(Biblioteca biblioteca) throws InputException.BibliotecaException, ClassificacaoForaDoRangeException {
        switch (this.tipoPrograma){
            case SERIE:
                Serie serie = new Serie(this.nome, this.pontuacao, this.categoria);
                serie.adicionarTemporadas(this.epTemporadas);
                biblioteca.editarPrograma(serie);
                break;

            case FILME:
                Filme filme = new Filme(this.nome, this.pontuacao, this.categoria, this.duracao);
                biblioteca.editarPrograma(filme);
                break;
        }
    }

    @Override
    public void run(Boolean exibirCabecalho, Boolean exibirInstrucao, Boolean exibirOpcoes, Boolean lerOpcoes) {
        super.run(exibirCabecalho, exibirInstrucao, exibirOpcoes, lerOpcoes);

        switch (super.opcaoSelecionada){

            // Salvar
            case 1:

                try{
                    salvarDados(App.getBiblioteca());
                    System.out.println(colorGoodMessage("\n" + Mensagens.Avisos.SALVO_SUCESSO));
                }
                catch (InputException.BibliotecaException | ClassificacaoForaDoRangeException e){
                    System.out.println(Mensagens.Avisos.SALVO_FAIL);
                    System.out.println(e.getMessage());
                }
                this.menuAnterior.run(true, true, true, true);
                break;

            // Voltar
            case 2:
                this.menuAnterior.run(true, true, true, true);
                break;
        }
    }
}
