package Controller;

import java.util.ArrayList;
import java.util.List;

import Model.Aluno;
import Model.Professor;

public class Curso {
    //atributos
    private String nomeCurso;
    private Professor professor;
    private List<Aluno> Alunos;
    //construtor
    public Curso(String nomeCurso, Professor professor) {
        this.nomeCurso = nomeCurso;
        this.professor = professor;
        Alunos = new ArrayList<>();
    }
    //metodos
    //adicionarAluno
    public void adicionarAluno(Aluno aluno){
        Alunos.add(aluno);
    }
    //exibirInformaçoesCurso
    public void exibirInformacoesCurso(){
        System.out.println("Nome do Curso: "+nomeCurso);
        System.out.println("Nome Professo: "+professor.getNome());
        //foreach
        int contador = 0;
        System.out.println("========================");
        for (Aluno aluno : Alunos) {
            contador++;
            System.out.println(contador+". "+aluno.getNome());
            
        }
    }
}
