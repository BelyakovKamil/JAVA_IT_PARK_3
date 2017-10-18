package ru.itpark;

public class Document {
    String lines[]= new String[3];
    int count = 0;

    boolean antibugForNumberOfElements(int numberLine) {
        boolean error = false;
        if (numberLine < 0 || numberLine > lines.length || numberLine == 0) {
            if (numberLine < 1 || numberLine > lines.length)
                System.err.println("Error!!! Output abroad array!!!");
            error = true;
        }
        return error;
    }

    boolean antibugForElementsOfArray (int numberOfElement){
        boolean error = false;
        if (lines[numberOfElement]==null){
            System.err.println("Error!!! This element dosen't exist!!!");
            error=true;
        }
        return error;
    }

     void showDocument(){
        for (int i =0; i<lines.length;i++){
            String lineToOut = lines[i] == null ? "_ _ _ _ _ _ _" : lines[i];
            System.out.println( i + " : " + lineToOut);
        }
    }

    void addLineToBegin (String newLine){
        for (int i = count; i>0; i--){
            lines[i]=lines[i-1];
        }
        lines[0]=newLine;
        count++;
    }

    void addLineToEnd(String newLine){
        lines[count]=newLine;
        count++;
    }

    void deleteLine (int deleteNumber){
        for (int i= deleteNumber; i<lines.length; i++){
            lines[i-1]=lines[i];
        }
        lines[lines.length-1]=null;
        count--;
    }

    void changeLine (int changeNumber, String newLine ){
        lines[changeNumber-1] = newLine;
    }

//    void clearLine(int clearLine){
//        lines[clearLine-1]="_ _ _ _ _ _ _";
//        count--;
//    }

}
