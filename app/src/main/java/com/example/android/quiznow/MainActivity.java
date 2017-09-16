package com.example.android.quiznow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.checked;
import static android.os.Build.VERSION_CODES.BASE;
import static com.example.android.quiznow.R.id.que2_edit_text;
import static com.example.android.quiznow.R.id.que4_ans3_radiobutton;
import static com.example.android.quiznow.R.string.que1_ans_text;

public class MainActivity extends AppCompatActivity {
    String queOne = "";
    String queTwo = "";
    String queEight = "";
    int a;
    boolean ques3Option1, ques3Option2, ques3Option3, ques3Option4;
    CheckBox ques3Option1CheckBox, ques3Option2CheckBox, ques3Option3CheckBox, ques3Option4CheckBox;

    boolean ques6Option1, ques6Option2, ques6Option3, ques6Option4;
    CheckBox ques6Option1CheckBox, ques6Option2CheckBox, ques6Option3CheckBox, ques6Option4CheckBox;

    private RadioGroup queFourradioGroup;
    private RadioButton queFourradioButton;


    private RadioGroup queFiveradioGroup;
    private RadioButton queFiveradioButton;


    boolean ques7Option1, ques7Option2, ques7Option3, ques7Option4;
    CheckBox ques7Option1CheckBox, ques7Option2CheckBox, ques7Option3CheckBox, ques7Option4CheckBox;

    private RadioGroup queNineradioGroup;
    private RadioButton queNineradioButton;

    boolean ques10Option1, ques10Option2, ques10Option3, ques10Option4;
    CheckBox ques10Option1CheckBox, ques10Option2CheckBox, ques10Option3CheckBox, ques10Option4CheckBox;
    String studentName;
    String queOneAnswer;
    String queTwoAnswer;
    String queThreeAnswer;

    String queFiveAnswer;
    String queFourAnswer;


    String queSevenAnswer;
    String queSixAnswer;
    String queEightAnswer;
    String queNineAnswer;
    String queTenAnswer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //addListenerOnButton();


    }


    public void submitQuestion(View view) {

        /**
         * Username
         */


        EditText studentNameEditText = (EditText) findViewById(R.id.full_edit_text);
        studentName = studentNameEditText.getText().toString();
        if (studentNameEditText.getText().toString().isEmpty()) {
            studentName = getString(R.string.answer_empty_name);
        }

        /**
         * Question 1
         */
        EditText queOneEditText = (EditText) findViewById(R.id.que1_edit_text);
        queOne = queOneEditText.getText().toString();
        queOneAnswer = queOneCheck();


        /**
         * Question 2
         */
        EditText queTwoEditText = (EditText) findViewById(R.id.que2_edit_text);
        queTwo = queTwoEditText.getText().toString();
        queTwoAnswer = queTwoCheck();


        /**
         * Question 3
         */
        ques3Option1CheckBox = (CheckBox) findViewById(R.id.que3_ans1_checkbox);
        ques3Option1 = ques3Option1CheckBox.isChecked();

        ques3Option2CheckBox = (CheckBox) findViewById(R.id.que3_ans2_checkbox);
        ques3Option2 = ques3Option2CheckBox.isChecked();

        ques3Option3CheckBox = (CheckBox) findViewById(R.id.que3_ans3_checkbox);
        ques3Option3 = ques3Option3CheckBox.isChecked();

        ques3Option4CheckBox = (CheckBox) findViewById(R.id.que3_ans4_checkbox);
        ques3Option4 = ques3Option4CheckBox.isChecked();
        queThreeAnswer = queThreeCheck();


        /**
         * Question 4
         */
        // Is the button now checked?   view
        //String queCorrectt ="";
        //boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        queFourradioGroup = (RadioGroup) findViewById(R.id.que4_group_radiobutton);
        int selectedId = queFourradioGroup.getCheckedRadioButtonId();
        if (selectedId == -1) {
            queFourradioButton = (RadioButton) findViewById(R.id.que4_ans3_radiobutton);

        } else {
            queFourradioButton = (RadioButton) findViewById(selectedId);
        }

        queFourradioButton.getText().toString();

        queFourAnswer = radioFour();


        queFiveradioGroup = (RadioGroup) findViewById(R.id.que5_group_radiobutton);
        int selectedIdFive = queFiveradioGroup.getCheckedRadioButtonId();
        if (selectedIdFive == -1) {
            queFiveradioButton = (RadioButton) findViewById(R.id.que5_ans2_radiobutton);

        } else {
            queFiveradioButton = (RadioButton) findViewById(selectedIdFive);
        }


        queFiveradioButton.getText().toString();
        queFiveAnswer = radioFive();


        /**
         * Question 6
         */
        ques6Option1CheckBox = (CheckBox) findViewById(R.id.que6_ans1_checkbox);
        ques6Option1 = ques6Option1CheckBox.isChecked();

        ques6Option2CheckBox = (CheckBox) findViewById(R.id.que6_ans2_checkbox);
        ques6Option2 = ques6Option2CheckBox.isChecked();

        ques6Option3CheckBox = (CheckBox) findViewById(R.id.que6_ans3_checkbox);
        ques6Option3 = ques6Option3CheckBox.isChecked();

        ques6Option4CheckBox = (CheckBox) findViewById(R.id.que6_ans4_checkbox);
        ques6Option4 = ques6Option4CheckBox.isChecked();
        queSixAnswer = queSixCheck();


        /**
         * Question 7
         */
        ques7Option1CheckBox = (CheckBox) findViewById(R.id.que7_ans1_checkbox);
        ques7Option1 = ques7Option1CheckBox.isChecked();

        ques7Option2CheckBox = (CheckBox) findViewById(R.id.que7_ans2_checkbox);
        ques7Option2 = ques7Option2CheckBox.isChecked();

        ques7Option3CheckBox = (CheckBox) findViewById(R.id.que7_ans3_checkbox);
        ques7Option3 = ques7Option3CheckBox.isChecked();

        ques7Option4CheckBox = (CheckBox) findViewById(R.id.que7_ans4_checkbox);
        ques7Option4 = ques7Option4CheckBox.isChecked();
        queSevenAnswer = queSevenCheck();


        /**
         * Question 8
         */
        EditText queEightEditText = (EditText) findViewById(R.id.que8_edit_text);
        queEight = queEightEditText.getText().toString();
        queEightAnswer = queEightCheck();


        /**
         * Question 9
         */

        // Check which radio button was clicked
        queNineradioGroup = (RadioGroup) findViewById(R.id.que9_group_radiobutton);
        int selectedIdNine = queNineradioGroup.getCheckedRadioButtonId();

        if (selectedIdNine == -1) {
            queNineradioButton = (RadioButton) findViewById(R.id.que9_ans3_radiobutton);

        } else {
            queNineradioButton = (RadioButton) findViewById(selectedIdNine);
        }

        queNineAnswer = radioNine();


        /**
         * Question 10
         */
        ques10Option1CheckBox = (CheckBox) findViewById(R.id.que10_ans1_checkbox);
        ques10Option1 = ques10Option1CheckBox.isChecked();

        ques10Option2CheckBox = (CheckBox) findViewById(R.id.que10_ans2_checkbox);
        ques10Option2 = ques10Option2CheckBox.isChecked();

        ques10Option3CheckBox = (CheckBox) findViewById(R.id.que10_ans3_checkbox);
        ques10Option3 = ques10Option3CheckBox.isChecked();

        ques10Option4CheckBox = (CheckBox) findViewById(R.id.que10_ans4_checkbox);
        ques10Option4 = ques10Option4CheckBox.isChecked();
        queTenAnswer = queTenCheck();


        //String priceMessage = answerSummary(studentName, queOneAnswer, queTwoAnswer, queThreeAnswer, queFourAnswer,
        // queFiveAnswer, queSixAnswer, queSevenAnswer, queEightAnswer, queNineAnswer, queTenAnswer);

        //String priceMessage = answerSummary(studentName);


        //if(priceMessage !=null){
        //displayQuantity(priceMessage);
        // displayQuantity(priceMessage);
        //}
        String score_comment = getString(R.string.answer_comment_text);
        String username = "Your name is " + studentName;
        String totalScore = "Total score is: 10";
        a = submitAns();
        if (a <= 3) {

            Toast.makeText(this, getString(R.string.answer_bad_toast_comment), Toast.LENGTH_SHORT).show();


        }
        if (a >= 4 && a <= 7) {

            Toast.makeText(this, getString(R.string.answer_average_toast_comment), Toast.LENGTH_SHORT).show();

        }

        if (a >= 8) {

            Toast.makeText(this, getString(R.string.answer_good_toast_comment), Toast.LENGTH_SHORT).show();
        }


        displayQuantity("\n" + username + "\n" + score_comment + " " + a + "\n" + totalScore);
        if (a > 1) {
            a = 0;
        }

        if (ques3Option1CheckBox.isChecked()) {

            ques3Option1CheckBox.toggle();

        }
        if (ques3Option2CheckBox.isChecked()) {
            ques3Option2CheckBox.toggle();
        }

        if (ques3Option3CheckBox.isChecked()) {

            ques3Option3CheckBox.toggle();

        }
        if (ques3Option4CheckBox.isChecked()) {
            ques3Option4CheckBox.toggle();
        }

        //
        if (ques6Option1CheckBox.isChecked()) {

            ques6Option1CheckBox.toggle();

        }
        if (ques6Option2CheckBox.isChecked()) {
            ques6Option2CheckBox.toggle();
        }

        if (ques6Option3CheckBox.isChecked()) {

            ques6Option3CheckBox.toggle();

        }
        if (ques6Option4CheckBox.isChecked()) {
            ques6Option4CheckBox.toggle();
        }

        //
        if (ques7Option1CheckBox.isChecked()) {

            ques7Option1CheckBox.toggle();

        }
        if (ques7Option2CheckBox.isChecked()) {
            ques7Option2CheckBox.toggle();
        }

        if (ques7Option3CheckBox.isChecked()) {

            ques7Option3CheckBox.toggle();

        }
        if (ques7Option4CheckBox.isChecked()) {
            ques7Option4CheckBox.toggle();
        }

        //
        if (ques10Option1CheckBox.isChecked()) {

            ques10Option1CheckBox.toggle();

        }
        if (ques10Option2CheckBox.isChecked()) {
            ques10Option2CheckBox.toggle();
        }

        if (ques10Option3CheckBox.isChecked()) {

            ques10Option3CheckBox.toggle();

        }
        if (ques10Option4CheckBox.isChecked()) {
            ques10Option4CheckBox.toggle();
        }


        queFourradioGroup.clearCheck();
        queFiveradioGroup.clearCheck();
        queNineradioGroup.clearCheck();

        //studentName="WRONG";
        //      queOneAnswer="WRONG";
        //queTwoAnswer="WRONG"; queThreeAnswer="WRONG";
        //queFourAnswer="WRONG";
        //queFiveAnswer="WRONG"; queSixAnswer="WRONG"; queSevenAnswer="WRONG"; queEightAnswer="WRONG";
        //queNineAnswer="WRONG"; queTenAnswer="WRONG";


    }


    private String queOneCheck() {
        String queCorrect;

        if (queOne.equalsIgnoreCase(getString(R.string.que1_ans_text))) {
            queCorrect = getString(R.string.que_correct);
            return queCorrect;

        } else {
            queCorrect = getString(R.string.que_wrong);
            return queCorrect;
        }

    }

    private String queTwoCheck() {
        String queCorrect;

        if (queTwo.equalsIgnoreCase(getString(R.string.que2_ans_text))) {
            queCorrect = getString(R.string.que_correct);
            return queCorrect;

        } else {
            queCorrect = getString(R.string.que_wrong);
            return queCorrect;
        }

    }


    private String queThreeCheck() {
        String queCorrect;

        if (ques3Option1 && ques3Option2) {
            queCorrect = getString(R.string.que_correct);
            return queCorrect;

        } else {
            queCorrect = getString(R.string.que_wrong);
            return queCorrect;
        }

    }

    private String radioFour() {
        if (queFourradioButton.getText().toString().equalsIgnoreCase(getString(R.string.que4_ans2_text))) {
            String queCorrect = getString(R.string.que_correct);
            return queCorrect;
        } else {
            String queCorrect = getString(R.string.que_wrong);
            return queCorrect;
        }
    }


    private String radioFive() {
        if (queFiveradioButton.getText().toString().equalsIgnoreCase(getString(R.string.que5_ans1_text))) {
            String queCorrect = getString(R.string.que_correct);
            return queCorrect;
        } else {
            String queCorrect = getString(R.string.que_wrong);
            return queCorrect;
        }
    }

    private String queSixCheck() {
        String queCorrect;

        if (ques6Option2 && ques6Option3) {
            queCorrect = getString(R.string.que_correct);
            return queCorrect;

        } else {
            queCorrect = getString(R.string.que_wrong);
            return queCorrect;
        }

    }

    private String queSevenCheck() {
        String queCorrect;

        if (ques7Option3) {
            queCorrect = getString(R.string.que_correct);
            return queCorrect;

        } else {
            queCorrect = getString(R.string.que_wrong);
            return queCorrect;
        }

    }

    private String queEightCheck() {
        String queCorrect;

        if (queEight.equalsIgnoreCase(getString(R.string.que8_ans1_text))) {
            queCorrect = getString(R.string.que_correct);
            return queCorrect;

        } else {
            queCorrect = getString(R.string.que_wrong);
            return queCorrect;
        }

    }

    private String radioNine() {
        if (queNineradioButton.getText().toString().equalsIgnoreCase(getString(R.string.que9_ans2_text))) {
            String queCorrect = getString(R.string.que_correct);
            return queCorrect;
        } else {
            String queCorrect = getString(R.string.que_wrong);
            return queCorrect;
        }
    }

    private String queTenCheck() {
        String queCorrect;

        if (ques10Option4) {
            queCorrect = getString(R.string.que_correct);
            return queCorrect;

        } else {
            queCorrect = getString(R.string.que_wrong);
            return queCorrect;
        }

    }


    /**
     * public void addListenerOnButton() {
     * <p>
     * <p>
     * queFourradioGroup = (RadioGroup) findViewById(R.id.que4_group_radiobutton);
     * fourbtnDisplay = (Button) findViewById(R.id.submit_que_button);
     * <p>
     * fourbtnDisplay.setOnClickListener(new View.OnClickListener() {
     *
     * @Override public void onClick(View v) {
     * <p>
     * // get selected radio button from radioGroup
     * int selectedId = queFourradioGroup.getCheckedRadioButtonId();
     * <p>
     * // find the radiobutton by returned id
     * queFourradioButton = (RadioButton) findViewById(selectedId);
     * <p>
     * String ans =queFourradioButton.getText().toString();
     * //Toast.makeText(MainActivity.this,
     * // queFourradioButton.getText(), Toast.LENGTH_SHORT).show();
     * <p>
     * //display(ans);
     * <p>
     * <p>
     * }
     * <p>
     * });
     * <p>
     * }
     **/


    private String answerSummary(String studentNamee, String queOnee, String queTwoo, String queThreee, String queFour,
                                 String queFive, String queSix, String queSeven,
                                 String queEight, String queNine, String queTen) {

        String answerMessage = "Your name is " + studentNamee;
        answerMessage += "\n Question 1 " + queOnee;
        answerMessage += "\n Question 2 " + queTwoo;
        answerMessage += "\n Question 3 " + queThreee;
        answerMessage += "\n Question 4 " + queFour;
        answerMessage += "\n Question 5 " + queFive;
        answerMessage += "\n Question 6 " + queSix;
        answerMessage += "\n Question 7 " + queSeven;
        answerMessage += "\n Question 8 " + queEight;
        answerMessage += "\n Question 9 " + queNine;
        answerMessage += "\n Question 10 " + queTen;
        return answerMessage;
    }


    private void displayQuantity(String numberOfQuantity) {
        TextView quantityTextView = (TextView) findViewById(R.id.answer_subject_text_view);
        quantityTextView.setText(" " + numberOfQuantity);
    }

    /**
     * private void displayQuantityInt(int numberOfQuantityInt) {
     * TextView quantityTextView = (TextView) findViewById(R.id.answer_subject_text_view);
     * quantityTextView.setText(" " + numberOfQuantityInt);
     * }
     **/

    public void restQuestion(View view) {
        studentName = "";
        queOneAnswer = "";
        queTwoAnswer = "";
        queEightAnswer = "";

        if (ques3Option1CheckBox.isChecked()) {

            ques3Option1CheckBox.toggle();

        }
        if (ques3Option2CheckBox.isChecked()) {
            ques3Option2CheckBox.toggle();
        }

        if (ques3Option3CheckBox.isChecked()) {

            ques3Option3CheckBox.toggle();

        }


        setEditTextStudentName(studentName);
        setEditTextOne(queOneAnswer);
        setEditTextTwo(queTwoAnswer);
        setEditTextEight(queEightAnswer);
        //String priceMessage =createOrderSummary(price, quantity, hasWhippedCream, addname, haschocolate);
        //Log.v("MainActivity", priceMessage);

        displayQuantity(getString(R.string.reset_comment));


    }

    private void setEditTextStudentName(String StudentName) {
        EditText EditTextStudentName = (EditText) findViewById(R.id.full_edit_text);
        EditTextStudentName.setText(" " + StudentName);
    }


    private void setEditTextOne(String queOneAnswer) {
        EditText EditTextOne = (EditText) findViewById(R.id.que1_edit_text);
        EditTextOne.setText(" " + queOneAnswer);
    }

    private void setEditTextTwo(String queTwoAnswer) {
        EditText EditTextTwo = (EditText) findViewById(R.id.que2_edit_text);
        EditTextTwo.setText(" " + queTwoAnswer);
    }


    private void setEditTextEight(String queEightAnswer) {
        EditText EditTextEight = (EditText) findViewById(R.id.que8_edit_text);
        EditTextEight.setText(" " + queEightAnswer);
    }


    private int submitAns() {

        int baseScore = 0;
        if (queOne.equalsIgnoreCase(getString(R.string.que1_ans_text))) {
            baseScore += 1;


        }
        if (queTwo.equalsIgnoreCase(getString(R.string.que2_ans_text))) {
            baseScore += 1;
        }
        if (ques3Option1 && ques3Option2) {
            baseScore += 1;

        }

        if (queFourradioButton.getText().toString().equalsIgnoreCase(getString(R.string.que4_ans2_text))) {
            baseScore += 1;
        }

        if (queFiveradioButton.getText().toString().equalsIgnoreCase(getString(R.string.que5_ans1_text))) {
            baseScore += 1;
        }

        if (ques6Option2 && ques6Option3) {
            baseScore += 1;

        }

        if (ques7Option3) {
            baseScore += 1;

        }

        if (queEight.equalsIgnoreCase(getString(R.string.que8_ans1_text))) {
            baseScore += 1;

        }

        if (queNineradioButton.getText().toString().equalsIgnoreCase(getString(R.string.que9_ans2_text))) {
            baseScore += 1;
        }

        if (ques10Option4) {
            baseScore += 1;

        }

        return baseScore;
    }
}


