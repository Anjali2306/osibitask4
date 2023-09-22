package LinkedList;
import java.util.*;
public class EXAMclassroom {
    HashMap<String,Integer>info=new HashMap<String,Integer>();
    Scanner sc =new Scanner(System.in);
    public void login(){
        info.put("A",200);
        info.put("B",210);
        info.put("C",215);
        info.put("D",220);
        System.out.println("Enter USER ID:");
        String uid= sc.nextLine();
        System.out.println("Enter PASSWORD");
        int pw=sc.nextInt();
        if(info.containsKey(uid)&&info.get(uid)==pw){
            System.out.println("Successfully logged.in!");
        }
        else{
            System.out.println("try again!");
            login();

        }
    }
    public void menu(){
        System.out.println("\n select any one");
        System.out.println("1 Update profile and password\n2. Start the exam\n3.logout");
        System.out.println("\n enter your option:");
        int op=sc.nextInt();
        switch(op)

        {
            case 1:
                info = update();
                menu();
                break;
            case 2:
                writeExam();
                menu();
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("INVALID OPTION");
        }
    }
    public HashMap<String,Integer>update(){
        System.out.println("Update Profile");
        System.out.println("Enter Username :");
        Scanner sc=new Scanner(System.in);
        String newuid = sc.nextLine();
        if(info.containsKey(newuid)){
            System.out.println("Enter new password");
            int newpw =sc.nextInt();
            info.replace(newuid,newpw);
        }
        else{
            System.out.println("user does not exist");
        }
        System.out.println("profile updated successfully !|");
        return info ;
    }
    public void writeExam(){
        long start = System.currentTimeMillis();
        long end1=start+15*1000;
        long end2=start+30*1000;
        int score1=0,score2=0;
        int cnt1=0,cnt2=0;
        char ans;
        System.out.println("Start the exam");
        System.out.println("You have just 15 second to answer each question in section 1.");
        System.out.println("You habe just 30 second to answer each question in section 2.");
        System.out.println("In section 1: 5 marks for correct and -1 for incorret");
        System.out.println("In section 2:10 marks for correct and -2 for incorrect");
        System.out.println("All the best!");
        while(System.currentTimeMillis()<end1){
            System.out.println("SECTION 1");
            System.out.println("1. who developed java ?");
            System.out.println("a.JAMES GOSLING\nb.DENNINS RITHCE\nc.guidovanrossum\nd.0jarne stroastrup");
            System.out.println("Enter your answer");
            ans=sc.next().charAt(0);
            if(ans=='a'){
                cnt1+=1;
            }
            System.out.println("2.At present,Java is owned by which organization ?");
            System.out.println("a.Sum Micrisystem\nb.google\nc.oracle\nd.Microsoft");
            ans=sc.next().charAt(0);
            if(ans=='b'){
                cnt1+=1;
            }
            System.out.println("3.how many primitive detatypes are there in java?");
            System.out.println("a. 4\nb.8\nc.6\nd.7");
            System.out.println("Enter your answer");
            ans=sc.next().charAt(0);
            if(ans=='b'){
                cnt1+=1;
            }
            System.out.println("a.which operator is this:'a'?");
            System.out.println("a.ternary operator\nb.relational operator\nc.logical\nd.assignment operator");
            System.out.println("Enter your answer");
            ans=sc.next().charAt(0);
            if(ans=='d'){
                cnt1+=1;
            }
            break;

        }
        while(System.currentTimeMillis()<end2){
            System.out.println("SECTION 2");
            System.out.println("5.Guess the output");
            System.out.println("public static vpoid main(String args[]{\n\tint x=5;\n\tint y=x++ + ++x;\n\tSystem.out.println(y)");
            System.out.println("a.\10nb.11\nc.12\nd13");
            System.out.println("Enter your number");
            ans=sc.next().charAt(0);
            if (ans=='c'){
                score2+=10;
                cnt2+=1;
            }
            else score2-=2;
            break;
        }
        System.out.println("You have completed the exam|");
        score1=cnt1*5-((4-cnt1)*1);
        System.out.println("correct question in section 1:"+cnt1);
        System.out.println("correct question in section 2:"+cnt2);
        System.out.println("Total score is:"+(score1+score2)+"out of 30");
    }
    //public classonlineExamination{
    public static void main(String[]args){
        EXAMclassroom can=new EXAMclassroom();
        can.login();
        can.menu();
    }
}

