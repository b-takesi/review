public class IF{
   public static void main(String[] args){
       int height =140;
       if(height<=100){//100cm以下
          System.out.println("90cmより大きい");
         } else if (height <= 130){//130cm以下
          System.out.println("100cmより大きい");
         } else if (height <= 150){//150cm以下
          System.out.println("130cmより大きい");
         }else{//それ以上(150cmより大きい)
         	System.out.println("150cmより大きい");
         }
        }
      }