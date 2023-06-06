class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();

        int rightHand = 10;
        int leftHand = 12;

        for(int number: numbers){
            if(number == 1 || number == 4 || number == 7){
                leftHand = number;
                sb.append("L");
            }else if(number == 3 || number == 6 || number == 9){
                rightHand = number;
                sb.append("R");
            }else{
                int leftDistance = numberDistance(leftHand, number);
                int rightDistance = numberDistance(rightHand, number);

                if(leftDistance < rightDistance){
                    sb.append("L");
                    leftHand = number;
                }else if(leftDistance > rightDistance){
                    sb.append("R");
                    rightHand = number;
                }else{
                    if(hand.equals("left")){
                        sb.append("L");
                        leftHand = number;
                    }else if(hand.equals("right")){
                        sb.append("R");
                        rightHand = number;
                    }
                }
            }


        }

        return sb.toString();
    }
    
    int numberDistance(int handPosition, int number){
if (number == 0) {
            number = 11;
        }
        if(handPosition == 0){
            handPosition = 11;
        }

        int handXPosition = (handPosition-1) / 3;
        int handYPosition = (handPosition-1) % 3;

        int numberXPosition = number / 3;
        int numberYPosition = 1;

        return Math.abs(handXPosition-numberXPosition) + Math.abs(handYPosition - numberYPosition);

    }
}