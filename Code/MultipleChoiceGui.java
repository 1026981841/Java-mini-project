import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
*Title      : Q.java--
* Description: This class contains the definition of all actionlisteneres and frames. this project is offered there type level questions , programmers can change this questions and answers in the txt docuement and add some probabilities to the ACtionListener method which is right to recreat the project!!(Remember! To change two places).
* @author      Exuan Zhang
*/ 

public class MultipleChoiceGui implements ActionListener{
    //all easy questions and selections
    String Question_one_easy;
    String selectA_one_easy;
    String selectB_one_easy;
    String selectC_one_easy;
    String selectD_one_easy;
    String Question_two_easy;
    String selectA_two_easy;
    String selectB_two_easy;
    String selectC_two_easy;
    String selectD_two_easy;
    String Question_three_easy;
    String selectA_three_easy;
    String selectB_three_easy;
    String selectC_three_easy;
    String selectD_three_easy;
    String Question_four_easy;
    String selectA_four_easy;
    String selectB_four_easy;
    String selectC_four_easy;
    String selectD_four_easy;

    String Question_one_mediun;
    String selectA_one_mediun;
    String selectB_one_mediun;
    String selectC_one_mediun;
    String selectD_one_mediun;
    String Question_two_mediun;
    String selectA_two_mediun;
    String selectB_two_mediun;
    String selectC_two_mediun;
    String selectD_two_mediun;
    String Question_three_mediun;
    String selectA_three_mediun;
    String selectB_three_mediun;
    String selectC_three_mediun;
    String selectD_three_mediun;
    String Question_four_mediun;
    String selectA_four_mediun;
    String selectB_four_mediun;
    String selectC_four_mediun;
    String selectD_four_mediun;

    String Question_one_difficult;
    String selectA_one_difficult;
    String selectB_one_difficult;
    String selectC_one_difficult;
    String selectD_one_difficult;
    String Question_two_difficult;
    String selectA_two_difficult;
    String selectB_two_difficult;
    String selectC_two_difficult;
    String selectD_two_difficult;
    String Question_three_difficult;
    String selectA_three_difficult;
    String selectB_three_difficult;
    String selectC_three_difficult;
    String selectD_three_difficult;
    String Question_four_difficult;
    String selectA_four_difficult;
    String selectB_four_difficult;
    String selectC_four_difficult;
    String selectD_four_difficult;
    //declaration of frame
    JFrame test = new JFrame();
    //declaration of all panel using a array
    JPanel all[] = new JPanel[6];
    JPanel select = new JPanel();
    //declaration of the score
    int num = 0;
    JLabel num1;
    //declaration the level which is select by user
    int level;
    //declaration of the times of the user answered
    int times = 1;

    int i = 0;

    public void getQuestionFromFild(){
        String file_path = new String ("../Files/questions.txt");
        // String file_path = new String ("Z:\\mini\\question\\questions.txt");
        try{
            FileReader fie  =  new FileReader(file_path);
            BufferedReader br =  new BufferedReader(fie);
            Question_one_easy = br.readLine();
            selectA_one_easy = br.readLine();
            selectB_one_easy = br.readLine();
            selectC_one_easy = br.readLine();
            selectD_one_easy = br.readLine();
            Question_two_easy = br.readLine();
            selectA_two_easy = br.readLine();
            selectB_two_easy = br.readLine();
            selectC_two_easy = br.readLine();
            selectD_two_easy = br.readLine();
            Question_three_easy = br.readLine();
            selectA_three_easy = br.readLine();
            selectB_three_easy = br.readLine();
            selectC_three_easy = br.readLine();
            selectD_three_easy = br.readLine();
            Question_four_easy = br.readLine();
            selectA_four_easy = br.readLine();
            selectB_four_easy = br.readLine();
            selectC_four_easy = br.readLine();
            selectD_four_easy = br.readLine();

            Question_one_mediun = br.readLine();
            selectA_one_mediun = br.readLine();
            selectB_one_mediun = br.readLine();
            selectC_one_mediun = br.readLine();
            selectD_one_mediun = br.readLine();
            Question_two_mediun = br.readLine();
            selectA_two_mediun = br.readLine();
            selectB_two_mediun = br.readLine();
            selectC_two_mediun = br.readLine();
            selectD_two_mediun = br.readLine();
            Question_three_mediun = br.readLine();
            selectA_three_mediun = br.readLine();
            selectB_three_mediun = br.readLine();
            selectC_three_mediun = br.readLine();
            selectD_three_mediun = br.readLine();
            Question_four_mediun = br.readLine();
            selectA_four_mediun = br.readLine();
            selectB_four_mediun = br.readLine();
            selectC_four_mediun = br.readLine();
            selectD_four_mediun = br.readLine();

            Question_one_difficult = br.readLine();
            selectA_one_difficult = br.readLine();
            selectB_one_difficult = br.readLine();
            selectC_one_difficult = br.readLine();
            selectD_one_difficult = br.readLine();
            Question_two_difficult = br.readLine();
            selectA_two_difficult = br.readLine();
            selectB_two_difficult = br.readLine();
            selectC_two_difficult = br.readLine();
            selectD_two_difficult = br.readLine();
            Question_three_difficult = br.readLine();
            selectA_three_difficult = br.readLine();
            selectB_three_difficult = br.readLine();
            selectC_three_difficult = br.readLine();
            selectD_three_difficult = br.readLine();
            Question_four_difficult = br.readLine();
            selectA_four_difficult = br.readLine();
            selectB_four_difficult = br.readLine();
            selectC_four_difficult = br.readLine();
            selectD_four_difficult = br.readLine();
            br.close();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

    /**
     * this is a method to listen all the event, checking the answer is right or not and reseting the sorce
     *  @param e the source of the event
     */
    public void actionPerformed(ActionEvent e){
        all[i].remove(num1);
        //change and change the question
        test.remove(all[i]);
        i++;
        //to judge the answer si right or not
        if(e.getActionCommand().equals("Paris")||e.getActionCommand().equals("English")||e.getActionCommand().equals("H")||e.getActionCommand().equals("1969")){
            //to judge the question has been answered one or two times to judge onr or two points the user should get
            if(level == 1){
                num++;
            }
            if(level == 2){
                if(times == 2){
                    num ++;
                    times = 1;
                }
                else{
                    num += 2;
                }
            }
            if(level == 3){
                num += 3;
            }
        }
        else{
            //to judge the question has been answered one or two times to judge onr or two points the user should get
            i--;
            if(level == 1){
                i++;
            }
            if(level == 2){
                if(times == 2){
                    i++;
                    times = 1;            
                }
                else{
                    times++;
                }
            }
            if(level == 3){
                i++;
            }
        }
        //to reset the MCQ
        if(e.getActionCommand().equals("reset score")){
            i = 1;
            num = 0;
            times = 1;
        }
        num1 = new JLabel("score=" + num);
        if(i<5){
            num1.setBounds(80, 230, 50, 20);
        }
        //to show your final score
        if(i == 5){
            JPanel fin = new JPanel();
            fin.setLayout(null);
            fin.setSize(300,300);
            fin.setBackground(new Color(255,160,122));
            num1 = new JLabel("your final score is " + num);
            num1.setBounds(50, 100 ,200 ,100);
            all[i] = fin;
        }
        //to change to the next question
        all[i].add(num1);
        test.add(all[i]);
        all[i].repaint();
        all[i].setVisible(true);
    }
    /**
     * this is a method to build a frame as to add panel into the frame
     */
    public void getFrame(){
        test = new JFrame("Multiple Choice Questions");
        test.setDefaultCloseOperation(3);
        test.setLayout(null);
        test.setBounds(30, 30, 300, 300);
    }
    /**
     * this is a method to build a panel which is contain all the select on the panel and questiones
     * @param que is the question
     * @param A is the selection A
     * @param B is the selection B
     * @param C is the selection C
     * @param D is the selection D
     * @return ro creat a questuion panel
     * 
     */
    public JPanel getQuestion(String que , String A , String B, String C, String D){
        //to set all the buttons labels and panels, then set size content and layout
        JPanel whole = new JPanel();
        JLabel question; 
        JButton one;
        JButton two;
        JButton three ;
        JButton four;
        JButton reset;
        question = new JLabel(que);
        one = new JButton(A);
        two = new JButton(B);
        three = new JButton(C);
        four = new JButton(D);
        num1 = new JLabel("score=" + num);
        reset = new JButton("reset score");
        whole.setLayout(null);
        whole.setSize(300,300); 
        question.setBounds(10, 10, 280, 30);
        one.setBounds(50, 60, 200, 30);
        two.setBounds(50, 100, 200, 30);
        three.setBounds(50, 140, 200, 30);
        four.setBounds(50, 180, 200, 30);
        num1.setBounds(80, 230, 50, 20);
        reset.setBounds(130, 230, 100, 20);
        whole.add(question);
        whole.add(one);
        whole.add(two);
        whole.add(three);
        whole.add(four);
        whole.add(reset);
        one.addActionListener(this);
        two.addActionListener(this);
        three.addActionListener(this);
        four.addActionListener(this);
        reset.addActionListener(this);
        return whole;
    }
    /**
     * this is a method for user to select the level of the question and if user elect a level ,the user cant change it, you you want to let user can reset the level you can change the code of line 139(if you dont change the code)from "i = 1" to "i = 0"(the second if of the actionPerformed method);
     * @return a panel which is offered to a user to select the level of the questions
     */
    public JPanel selectPanel(){
        JPanel start = new JPanel();
        ButtonGroup allLevel = new ButtonGroup();
        JRadioButton easy = new JRadioButton("easy");
        JRadioButton medium = new JRadioButton("medium");
        JRadioButton difficult = new JRadioButton("difficult");
        start.setBorder(BorderFactory.createTitledBorder("select one level(Non modifiable)!"));
        allLevel.add(easy);
        allLevel.add(medium);
        allLevel.add(difficult);
        start.setSize(300,300);
        start.setLayout(new GridLayout(3,1));
        start.add(easy);
        start.add(medium);
        start.add(difficult);
        easy.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                level = 1;
                test.remove(all[i]);
                i++;
                all[1] = getQuestion(Question_one_easy, selectA_one_easy, selectB_one_easy, selectC_one_easy, selectD_one_easy);
                all[1].add(num1);
                all[2] = getQuestion(Question_two_easy, selectA_two_easy, selectB_two_easy, selectC_two_easy, selectD_two_easy);
                all[3] = getQuestion(Question_three_easy, selectA_three_easy, selectB_three_easy, selectC_three_easy, selectD_three_easy);
                all[4] = getQuestion(Question_four_easy, selectA_four_easy, selectB_four_easy, selectC_four_easy, selectD_four_easy);
                test.add(all[i]);
                all[i].repaint();
                all[i].setVisible(true);
            }
        });
        medium.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                level = 2;
                test.remove(all[i]);
                i++;
                all[1] = getQuestion(Question_one_mediun, selectA_one_mediun, selectB_one_mediun, selectC_one_mediun, selectD_one_mediun);
                all[1].add(num1);
                all[2] = getQuestion(Question_two_mediun, selectA_two_mediun, selectB_two_mediun, selectC_two_mediun, selectD_two_mediun);
                all[3] = getQuestion(Question_three_mediun, selectA_three_mediun, selectB_three_mediun, selectC_three_mediun, selectD_three_mediun);
                all[4] = getQuestion(Question_four_mediun, selectA_four_mediun, selectB_four_mediun, selectC_four_mediun, selectD_four_mediun);
                test.add(all[i]);
                all[i].repaint();
                all[i].setVisible(true);
            }
        });
        difficult.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                level = 3;
                test.remove(all[i]);
                i++;
                all[1] = getQuestion(Question_one_difficult, selectA_one_difficult, selectB_one_difficult, selectC_one_difficult, selectD_one_difficult);
                all[1].add(num1);
                all[2] = getQuestion(Question_two_difficult, selectA_two_difficult, selectB_two_difficult, selectC_two_difficult, selectD_two_difficult);
                all[3] = getQuestion(Question_three_difficult, selectA_three_difficult, selectB_three_difficult, selectC_three_difficult, selectD_three_difficult);
                all[4] = getQuestion(Question_four_difficult, selectA_four_difficult, selectB_four_difficult, selectC_four_difficult, selectD_four_difficult);
                test.add(all[i]);
                all[i].repaint();
                all[i].setVisible(true);
            }
        });
        return start;
    }
    public static void main(String[] args) {
        MultipleChoiceGui question = new MultipleChoiceGui();
        question.getQuestionFromFild();
        question.getFrame();
        question.all[0] = question.selectPanel();
        question.test.add(question.all[0]);
        question.test.setVisible(true);
    }
}