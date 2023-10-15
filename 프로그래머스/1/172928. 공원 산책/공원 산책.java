import java.util.*;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        int height = park.length;
        int width = park[0].length();
        String[][] parkState = new String[height][width];
        int currentX = 0;
        int currentY = 0;

        //시작위치, 공원의 상태 담기
        for(int i = 0; i<height; i++){
            String[] position = park[i].split("");
            for(int j = 0; j<position.length; j++){
                if(position[j].equals("S")){
                    currentX = i;
                    currentY = j;
                }
                parkState[i][j] = position[j];
            }
        }

        for(int i = 0; i<routes.length; i++){
            String op = routes[i].split(" ")[0];
            int n = Integer.parseInt(routes[i].split(" ")[1]);

            int tempX = 0;
            int tempY = 0;
            boolean flag = true;

            switch(op){
                case"N":
                    for(int j = 1; j<=n; j++){
                        if(currentX-j < 0){
                            flag = false;
                            break;
                        }

                        if(parkState[currentX-j][currentY].equals("X")){
                            flag = false;
                            break;
                        }
                        tempX = currentX-j;
                    }
                    if(flag){
                        currentX = tempX;
                    }
                    break;

                case"S":
                    for(int j = 1; j<=n; j++){
                        if(currentX+j > height-1){
                            flag = false;
                            break;
                        }

                        if(parkState[currentX+j][currentY].equals("X")){
                            flag = false;
                            break;
                        }
                        tempX = currentX+j;
                    }
                    if(flag){
                        currentX = tempX;
                    }
                    break;

                case"W":
                    for(int j = 1; j<=n; j++){
                        if(currentY-j < 0){
                            flag = false;
                            break;
                        }

                        if(parkState[currentX][currentY-j].equals("X")){
                            flag = false;
                            break;
                        }
                        tempY = currentY-j;
                    }
                    if(flag){
                        currentY = tempY;
                    }
                    break;

                case"E":
                    for(int j = 1; j<=n; j++){
                        if(currentY+j > width-1){
                            flag = false;
                            break;
                        }

                        if(parkState[currentX][currentY+j].equals("X")){
                            flag = false;
                            break;
                        }
                        tempY = currentY+j;
                    }
                    if(flag){
                        currentY = tempY;
                    }
                    break;

            }
        }

        return new int[]{currentX, currentY};
    }
}
