package br.gov.sp.fatec.hello.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.sp.fatec.hello.entities.Student;

@RestController
@RequestMapping("students")

public class StudentController {

    @GetMapping
//criando um metodo chamada getStudents, cujo retorno é uma lista
    public List<Student> getStudents()
     {
//criando um objeto List de estudantes do tipo arraylist chamado list 
        List<Student> list = new ArrayList<Student>();

//criando um objeto studant chamado s1
        Student s1 = new Student();
            s1.setCourse("ads");
            s1.setId(1);
            s1.setName("Glauco Todesco");

//criando um objeto studant chamado s2
        Student s2 = new Student();
            s2.setCourse("não ads");
            s2.setId(2);
            s2.setName("Nome de aluno generico");

//colocando na lista os objs s1 e s2
            list.add(s1);
            list.add(s2);
            return list;
    
    }
}
