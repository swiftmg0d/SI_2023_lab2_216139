package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    @Test
    void exceptionTest() {
        RuntimeException exception = assertThrows(RuntimeException.class, () -> {
            SILab2.function(null, new ArrayList<>());
        });
        assertEquals("Mandatory information missing!", exception.getMessage());

    }

    @Test
    void loopTest() {
        assertFalse(SILab2.function(new User("kalu", "kalu123", "kalugmailcom"), new ArrayList<>()));
        assertFalse(SILab2.function(new User("kalu", "kafanskapjevacica", "kalu.dragoliev@gmail.com"), List.of(new User("kalu", "kafanskajevacica", "kalu.dragoliev@gmail.com"))));
        assertFalse(SILab2.function(new User("kalu", "kafanska pjevacica@", "kalu.dragoliev@gmail.com"), List.of(new User("Predrag", "desambiosinoc", "predrag.petkov@gmail.com"))));
    }

    @Test
    void  multipleConcitionTestV1(){
        RuntimeException exception=assertThrows(RuntimeException.class, ()->{
            SILab2.function(null,new ArrayList<>());
        });
        assertEquals("Mandatory information missing!", exception.getMessage());

    }
    @Test
    void  multipleConcitionTestV2(){
        assertDoesNotThrow(()->{
            SILab2.function(new User("Predrag","Mitkov12345","predrag_mitkov@gmail.com"),new ArrayList<>());
        });
    }
}