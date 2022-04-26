package CheckGameXO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.io.File;

public class CheckGameWin {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		final int ROW = 3, COLUMN = 3;
        int boards[][] = new int[ROW][COLUMN];
        int datai = 1;
        
		File myObj = new File("D:\\Test\\gamexo1.txt");
		Scanner myReader = new Scanner(myObj);
		
		int x = 1;
		while (myReader.hasNextLine()) {
			String data = myReader.nextLine();
			String newdata = "";
			newdata = data.replace("|","");

//	        System.out.println(newdata);
	        
	        List<Position> _pos = new ArrayList<Position>();
	        for(int i = 0;i<newdata.length();i++) {
	        	Position item = new Position();
	        	String dat = newdata.substring(i, i + 1);
//	        	System.out.println(dat);
//	        	System.out.println("X IS : " + x);
//	        	----------------------------------------------------------------------------
//	        	if (item.isPos1() == true || item.isPos2() == true || item.isPos3() == true ) {
//	        		System.out.println("----------");
//	        		
//	        	} else if (item.isPos2() == false || item.isPos5() == false || item.isPos8() == false) {
//	        		System.out.println("============");
//	        	}
//	        	----------------------------------------------------------------------------
	        	
	        	if (x == 1) {
	        		item.setPos1(dat);
	        		System.out.println("1 : " + item.getPos1());
	        	} else if(x == 2) {
	        		item.setPos2(dat);
	        		System.out.println("2 : " + item.getPos2());
	        	} else if(x == 3) {
	        		item.setPos3(dat);
	        		System.out.println("3 : " + item.getPos3());
	        	} else if(x == 4) {
	        		item.setPos4(dat);
	        		System.out.println("4 : " + item.getPos4());
	        	} else if(x == 5) {
	        		item.setPos5(dat);
	        		System.out.println("5 : " + item.getPos5());
	        	} else if(x == 6) {
	        		item.setPos6(dat);
	        		System.out.println("6 : " + item.getPos6());
	        	} else if(x == 7) {
	        		item.setPos7(dat);
	        		System.out.println("7 : " + item.getPos7());
	        	} else if(x == 8) {
	        		item.setPos8(dat);
	        		System.out.println("8 : " + item.getPos8());
	        	} else if(x == 9) {
	        		item.setPos9(dat);
	        		System.out.println("9 : " + item.getPos9());
	        		x = 1;
	        		_pos.add(item);
	        		String result = checkWinner(_pos);
	        		if (result.equals("XXX")) {
	                	System.out.println("X WIN");
	                } else if (result.equals("OOO")) {
	                	System.out.println("O WIN");
	                } else {
	                	System.out.println("DEAL");
	                }
//	        		System.out.println(result);
	        	}
	        	x+=1;
	        }
		}
	}
	
	public static String checkWinner(List<Position> dat) {
		String result = "";
        for (int a = 0; a < dat.size(); a++) {
        	for (int b = 0; b < 8; b++) {
                String line = null;
                switch (b) {
                    case 0:
                        line = dat.get(a).getPos1() + dat.get(a).getPos2() + dat.get(a).getPos3();
                        break;
                    case 1:
                        line = dat.get(a).getPos4() + dat.get(a).getPos5() + dat.get(a).getPos6();
                        break;
                    case 2:
                        line = dat.get(a).getPos7() + dat.get(a).getPos8() + dat.get(a).getPos9();
                        break;
                    case 3:
                        line = dat.get(a).getPos1() + dat.get(a).getPos4() + dat.get(a).getPos7();
                        break;
                    case 4:
                        line = dat.get(a).getPos2() + dat.get(a).getPos5() + dat.get(a).getPos8();
                        break;
                    case 5:
                        line = dat.get(a).getPos3() + dat.get(a).getPos6() + dat.get(a).getPos9();
                        break;
                    case 6:
                        line = dat.get(a).getPos1() + dat.get(a).getPos5() + dat.get(a).getPos9();
                        break;
                    case 7:
                        line = dat.get(a).getPos3() + dat.get(a).getPos5() + dat.get(a).getPos7();
                        break;
                }
                if (line.equals("XXX")) {
                	result = line;
                } else if (line.equals("OOO")) {
                	result = line;
                }
            }
        }
        return result;
//            String line = null;
//            switch (a) {
//                case 0:
//                    line = board[0] + board[1] + board[2];
//                    break;
//                case 1:
//                    line = board[3] + board[4] + board[5];
//                    break;
//                case 2:
//                    line = board[6] + board[7] + board[8];
//                    break;
//                case 3:
//                    line = board[0] + board[3] + board[6];
//                    break;
//                case 4:
//                    line = board[1] + board[4] + board[7];
//                    break;
//                case 5:
//                    line = board[2] + board[5] + board[8];
//                    break;
//                case 6:
//                    line = board[0] + board[4] + board[8];
//                    break;
//                case 7:
//                    line = board[2] + board[4] + board[6];
//                    break;
//            }
//            if (line.equals("XXX")) {
//                return "X";
//            } else if (line.equals("OOO")) {
//                return "O";
//            }
//        }

//        for (int a = 0; a < 9; a++) {
//            if (Arrays.asList(board).contains(String.valueOf(a + 1))) {
//                break;
//            } else if (a == 8)
//                return "draw";
//        }

//        System.out.println(turn + "'s turn; enter a slot number to place " + turn + " in:");
//        return null;
    }

}
