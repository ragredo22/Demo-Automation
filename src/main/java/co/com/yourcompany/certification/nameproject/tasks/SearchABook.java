package co.com.yourcompany.certification.nameproject.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchABook implements Task {



    private SearchABook(){}


    @Override
    public <T extends Actor> void performAs(T actor) {

    }


    public static SearchABook withTheFollowinData(List<String> eBook){

        String a = eBook.get(0);
        return instrumented(SearchABook.class, eBook);
    }

}
