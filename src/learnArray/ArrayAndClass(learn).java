package learnArray;

//数组和类(结构体)的结合
class Student {
    //这里写的是分装，的使用
    //要使用分装的东西
    //1。要new
    //2。用new后的东西,去.方法里面的东西
    //eg:learnArray.FuncStudentTest funcStudentTest = new learnArray.FuncStudentTest();
    //  funcStudentTest.BubbleSort(students);
    //上面的funcStudentTest就是new出来的
    //funcStudentTest.BubbleSort(students);----->这个就是.的东西
    public static void main(String[] args) {
        //(int) (Math.random() * (99 - 10) + 10);
        //*这一步，给 StudentTest一个20内存
        StudentTest[] students = new StudentTest[20];
        for (int i = 0; i < students.length; i++) {
            //*因为 StudentTest有很多东西，要给他一个新的空间
            students[i] = new StudentTest();
            students[i].number = i + 1;
            students[i].state = (int) (Math.random() * (6 - 1 + 1) + 1);//[1,6]
            students[i].score = (int) (Math.random() * (100 - 0 + 1) + 0);//[0,100]
        }
        //new的
        FuncStudentTest funcStudentTest = new FuncStudentTest();
        //便利
        funcStudentTest.convenient(students);


        System.out.println("******************");
        //寻找
        funcStudentTest.search(students, 3);
        System.out.println("******************");
        //冒泡比较成绩
        funcStudentTest.BubbleSort(students);

        //便利
        funcStudentTest.convenient(students);


        //匿名对象/有名对象
        //匿名只能被调用一次
        //1。有名对象
        anonymous a = new anonymous();
        a.palyGame();
        //接下来是：匿名对象
        new anonymous().palyGame();
        new  anonymous().palyTV();


    }
}

class StudentTest {
    int number;
    int state;
    int score;

    //写一个方法，因为上面的操作，这时候的
    // int number;
    //    int state;
    //    int score;已经被赋值了
    public String info() {
        return "学号" + number + "年级" + state + "成绩" + score;
    }

}

class FuncStudentTest {

    //便利
    public void convenient(StudentTest[] students) {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].info());
        }
    }

    //寻找
    public void search(StudentTest[] students, int state) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].state == 3) {

                System.out.println(students[i].info());
            }
        }
    }

    //冒泡比较成绩
    public void BubbleSort(StudentTest[] students) {
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - 1 - i; j++) {
                if (students[j].score > students[j + 1].score) {
                    StudentTest temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }
}

class anonymous {
    public void palyGame() {
        System.out.println("玩游戏");
    }

    public void palyTV() {
        System.out.println("看电视");
    }
}




