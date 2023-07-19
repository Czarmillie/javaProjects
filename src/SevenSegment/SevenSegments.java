package SevenSegment;

public class SevenSegments {
    String[][] seven = new String[5][4];
    public  void setA(){
        for (int col = 0; col <= 0; col++){
            for(int row = 0; row <= 3; row++){
                seven[col][row] = "# ";
            }
        }
    }
    public void setB(){
        for(int col = 0; col <= 2; col++){
            for(int row = 3; row <= 3; row++){
                seven[col][row] = "# ";
            }
        }
    }
    public void setC(){
        for(int col = 2; col <=4; col++ ){
            for(int row = 3; row <= 3; row++){
                seven[col][row] = "# ";
            }
        }
    }
    public void setD(){
        for(int col = 4; col <=4; col++){
            for(int row = 0; row <=3; row++){
                seven[col][row] = "# ";
            }
        }
    }
    public void setE(){
        for(int col = 2; col <= 4; col++){
            for(int row = 0; row <=0; row++){
                seven[col][row] = "# ";
            }
        }
    }
    public void setF(){
        for(int col = 0; col <= 2; col++){
            for(int row = 0; row <= 0; row++){
                seven[col][row] = "# ";
            }
        }
    }
    public void setG(){
        for (int col = 2; col <= 2; col++){
            for(int row = 0; row <= 3; row++){
                seven[col][row] = "# ";
            }
        }
    }
    public void setScreen(){
        for(int col = 0; col <= 4; col++){
            for(int row = 0; row <= 3; row++){
                seven[col][row] = "  ";
            }
        }
    }
    public void settingDisplay(String input){
        setScreen();
        if(input.charAt(7) == '1'){
            if(input.charAt(0) == '1'){setA();}
            if(input.charAt(1) == '1'){setB();}
            if(input.charAt(2) == '1'){setC();}
            if(input.charAt(3) == '1'){setD();}
            if(input.charAt(4) == '1'){setE();}
            if(input.charAt(5) == '1'){setF();}
            if(input.charAt(6) == '1'){setG();}
        }
    }
    public void display(){
        for(int col = 0; col <= 4; col++){
            for(int row = 0; row <= 3; row++){
                System.out.print(seven[col][row] + " ");
            }
            System.out.println();
        }
    }
}