package xe.Controller;

import xe.Model.Model;
import xe.SupportedLanguages;
import xe.View.View;
import xe.View.databank.AmountOfMoney;

import java.util.Scanner;

public class Controller {

    private final static String  inputTokens = "1234567890";

    private Model model;
    private View view;
    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
    }

    public void processUser(){
        Scanner scanner = new Scanner(System.in);
        selectLanguage(scanner);
       model.filterOnAmount(selectAmountOfMoney(scanner));

    }

    private void selectLanguage(Scanner sc){
        SupportedLanguages selectedLang;
        for(SupportedLanguages option: SupportedLanguages.values()){
            view.printMessage(option.getLanguage());
        }
        selectedLang = SupportedLanguages.values()[inputFromMenuBar(inputFromScanner(sc, buildRegEx(2)))];
        view.setLocalization(selectedLang);

    }
    private AmountOfMoney selectAmountOfMoney(Scanner sc){
        AmountOfMoney selectedAmount;
        for(AmountOfMoney option: AmountOfMoney.values()){
            view.printMessage(option.toString());
        }
        selectedAmount = AmountOfMoney.values()[inputFromMenuBar(inputFromScanner(sc,buildRegEx(3)))];
        return selectedAmount;


    }



    private String inputFromScanner(Scanner scanner, String regEx){

        String res;
        while(!(scanner.hasNext() && (res = scanner.next()).matches(regEx))){
            view.printMessage(View.WRONG_INPUT);
        }
        return res;
    }



    private String buildRegEx(int numberOfChoice){
        return "[" + inputTokens.substring(0,numberOfChoice)+"]";

    }
    private int inputFromMenuBar(String input){
        return inputTokens.indexOf(input);
    }


}
