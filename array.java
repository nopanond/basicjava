public class array {
    public static void main(String[] args) {
        // 1. การประกาศและสร้าง array ของจำนวนชื่อตนเอง
        char[] fname = new char[8];
        
        // 2. กำหนดค่าให้ตัวแปร
        fname[0] = 'n';
        fname[1] = 'o';
        fname[2] = 'p';
        fname[3] = 'a';
        fname[4] = 'n';
        fname[5] = 'o';
        fname[6] = 'n';
        fname[7] = 'd';

        // 3. แสดงชื่อตนเองทั้งหมด
        System.out.println(fname);

        // 4. แสดงตัวอักษรตัวที่ 3 ของชื่อตนเอง
        System.out.println(fname[2]);

        // 5. การประกาศและสร้าง array ของนามสกุลตนเอง พร้อมกำหนดค่าให้ตัวแปร
        char[] lname = {'c','h','a','k','o','r','n'};

        // 6. แสดงนามสกุลของตนเองทั้งหมด
        System.out.println(lname);
        
        // 7. แสดงตัวอักษรนามสกุลของตนเองตัวสุดท้าย
        System.out.println(lname[6]);

        // 8. แสดงชื่อและนามสกุลตนเอง
        System.out.print(fname);
        System.out.println(lname);

        // 9. แสดงชื่อ โดยแสดงตำแหน่งอักษรของชื่อแต่ละตัวทั้งหมด ตามผลลัพธ์ตัวอย่าง [ใช้คำสั่งการวนลูปช่วย]
        for(int i = 0 ; i <= 7 ; i++){
            System.out.println("อักษรที่ " + i + ": " + fname[i]);
        }

    }
}

