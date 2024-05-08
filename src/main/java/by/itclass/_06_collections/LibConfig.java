package by.itclass._06_collections;

import org.springframework.context.annotation.Bean;

import java.util.List;

public class LibConfig {
    @Bean
    public List<Book> books() {
        return List.of(
                new Book("Title1"),
                new Book("Title2"),
                new Book("Title3")
                );
    }
    @Bean
    public Libary libary(){
        return new Libary(1);
    }
}
