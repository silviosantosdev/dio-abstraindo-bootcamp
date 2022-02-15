import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
    Curso curso1 = new Curso();
    curso1.setTitulo("curso java");
    curso1.setDescricao("descrição curso java");
    curso1.setCargaHoraria(8);


    Curso curso2 = new Curso();
    curso2.setTitulo("curso javascript");
    curso2.setDescricao("descrição curso javascript");
    curso2.setCargaHoraria(4);

    Mentoria mentoria = new Mentoria();
    mentoria.setTitulo("mentoria de java");
    mentoria.setDescricao("descrição mentoria java");
    mentoria.setData(LocalDate.now ());


    /*   System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    */

     Bootcamp bootcamp = new Bootcamp();
     bootcamp.setNome("Bootcamp Java Developer");
     bootcamp.setDescricao("Descrição Bootcamp Java Developer");
     bootcamp.getConteudos().add(curso1);
     bootcamp.getConteudos().add(curso2);
     bootcamp.getConteudos().add(mentoria);

     Dev devSilvio = new Dev();
     devSilvio.setNome("Silvio");
     devSilvio.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos - Sílvio: " + devSilvio.getConteudosInscritos());
        devSilvio.progredir();
        devSilvio.progredir();
        System.out.println("==");
        System.out.println("Conteúdos Inscritos - Sílvio: " + devSilvio.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos - Sílvio: " + devSilvio.getConteudosConcluidos());
        System.out.println("XP: " + devSilvio.calcularTotalXP());

        System.out.println("----------------------------------------------");
     Dev devLuciana = new Dev();
     devLuciana.setNome("Luciana");
        devLuciana.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos - Luciana: " + devLuciana.getConteudosInscritos());
        devLuciana.progredir();
        devLuciana.progredir();
        devLuciana.progredir();
        System.out.println("==");
        System.out.println("Conteúdos Inscritos - Luciana: " + devLuciana.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos - Luciana: " + devLuciana.getConteudosConcluidos());
        System.out.println("XP: " + devLuciana.calcularTotalXP());


    }
}
