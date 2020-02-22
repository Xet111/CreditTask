package xe.Controller;

import xe.Model.Model;
import xe.Model.creditfactory.Credit;
import xe.SupportedLanguages;
import xe.View.View;
import xe.View.databank.AmountOfMoney;
import xe.View.databank.CreditInput;
import xe.View.databank.Term;

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
        model.generateArray(60);
        view.printArray(model.getActiveCredit());
        selectLanguage(scanner);
        model.filterOnAmount(selectAmountOfMoney(scanner));
        model.filterOnTerm(selectTermOfCredit(scanner));
        model.filterOnCredit(selectCredit(scanner));
        view.printArray(model.getChosenCredit());


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
    private Term selectTermOfCredit(Scanner sc){
        Term selectedTerm;
        for(Term option: Term.values()){
            view.printMessage(option.toString());
        }
         selectedTerm = Term.values()[inputFromMenuBar(inputFromScanner(sc,buildRegEx(3)))];
        return selectedTerm;
    }
    private CreditInput selectCredit(Scanner sc){
        CreditInput selectedCredit;
        for(CreditInput option: CreditInput.values()){
            view.printMessage(option.toString());
        }
        selectedCredit = CreditInput.values()[inputFromMenuBar(inputFromScanner(sc,buildRegEx(3)))];
        return selectedCredit;
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
