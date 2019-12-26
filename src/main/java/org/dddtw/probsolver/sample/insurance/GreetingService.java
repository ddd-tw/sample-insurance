package org.dddtw.probsolver.sample.insurance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    final PersonRepository repository;

    @Autowired
    public GreetingService(PersonRepository repository) {
        this.repository = repository;
    }

    public void sayHello() {

        System.out.println("Current count : " + repository.count());
        System.out.println("you are running a Spring boot @service annotated class.");

    }
}
