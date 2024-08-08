public class condition {
    public static void main(String[] args) {
        int score = 60;  //ตัวแปร จำนวนเต็ม ชื่อ score

        // 1. คำสั่ง if เงื่อนไขเดียว กำหนดให้คะแนนตั้งแต่ 50 สอบผ่าน
        if(score >= 50){
            System.out.println("สอบผ่าน");
        }

        //2. คำสั่ง if-else สองเงื่อนไข กำหนดให้คะแนนตั้งแต่ 50 สอบผ่าน ต่ำกว่า 50 สอบตก
        if(score >= 50){
            System.out.println("สอบผ่าน");
        }else{
            System.out.println("สอบตก");
        }


        //3. คำสั่ง if-elseif-else หลายเงื่อนไข กำหนดให้
        //คะแนน 0-50 ต่ำกว่าเกณฑ์
        //คะแนน 51-60 พอใช้
        //คะแนน 61-80 ดี
        //คะแนน 80 ขึ้นไป ยอดเยี่ยม
        if(score <= 50){
            System.out.println("ต่ำกว่าเกณฑ์");
        }else if(score <= 60 ){
            System.out.println("พอใช้");
        }else if(score <=80){
            System.out.println("ดี");
        }else{
            System.out.println("ยอดเยี่ยม");
        }

        //4. คำสั่ง switch...case 
        // เลข 1 : ให้นำ score มาบวก 5 กันแล้วแสดงผล
        // เลข 2 : ให้นำ score มาลบ 5 แล้วแสดงผล
        // เลข 3 : ให้นำ score มาคูณ 5 แล้วแสดงผล
        int sw = 1; //ตัวแปรเงื่อนไข เก็บค่าตัวเลขทางเลือก
        switch (sw) {
            case 1:
                System.out.println(score + 5);
                break;
            case 2:
                System.out.println(score - 5);
                break;
            case 3:
                System.out.println(score * 5);
                break;
            default:
                System.out.println("ไม่ตรงเงื่อนไขใดๆ");
                break;
        }
    }
}
