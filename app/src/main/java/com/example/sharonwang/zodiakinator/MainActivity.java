package com.example.sharonwang.zodiakinator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;
import java.util.*;

public class MainActivity extends AppCompatActivity {

    Button answer1, answer2, answer3, answer4, answer5, answer6, answer7, answer8, answer9, answer10, answer11, answer12;
    TextView question;
    private Questions questions = new Questions();
    private String answer;
    private int questionNum = 0;
    public int[] signCount = new int[12];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        answer1 = (Button) findViewById(R.id.answer1);
        answer2 = (Button) findViewById(R.id.answer2);
        answer3 = (Button) findViewById(R.id.answer3);
        answer4 = (Button) findViewById(R.id.answer4);
        answer5 = (Button) findViewById(R.id.answer5);
        answer6 = (Button) findViewById(R.id.answer6);
        answer7 = (Button) findViewById(R.id.answer7);
        answer8 = (Button) findViewById(R.id.answer8);
        answer9 = (Button) findViewById(R.id.answer9);
        answer10 = (Button) findViewById(R.id.answer10);
        answer11 = (Button) findViewById(R.id.answer11);
        answer12 = (Button) findViewById(R.id.answer12);
        question = (TextView) findViewById(R.id.question);


        question.setText(questions.getQuestion(0));
        answer1.setText(questions.getChoice(0, 0));
        answer2.setText(questions.getChoice(0, 1));
        answer3.setText(questions.getChoice(0, 2));
        answer4.setText(questions.getChoice(0, 3));
        answer5.setText(questions.getChoice(0, 4));
        answer6.setText(questions.getChoice(0, 5));
        answer7.setText(questions.getChoice(0, 6));
        answer8.setText(questions.getChoice(0, 7));
        answer9.setText(questions.getChoice(0, 8));
        answer10.setText(questions.getChoice(0, 9));
        answer11.setText(questions.getChoice(0, 10));
        answer12.setText(questions.getChoice(0, 11));

        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signCount[0]++;
                questionNum++;
                if (questionNum == 10) {
                    //end game
                    question.setText(getZodiacResult());
                    answer1.setVisibility(View.GONE);
                    answer2.setVisibility(View.GONE);
                    answer3.setVisibility(View.GONE);
                    answer4.setVisibility(View.GONE);
                    answer5.setVisibility(View.GONE);
                    answer6.setVisibility(View.GONE);
                    answer7.setVisibility(View.GONE);
                    answer8.setVisibility(View.GONE);
                    answer9.setVisibility(View.GONE);
                    answer10.setVisibility(View.GONE);
                    answer11.setVisibility(View.GONE);
                    answer12.setVisibility(View.GONE);
                } else {
                    updateQuestion(questionNum);
                }
            }
        });

        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signCount[1]++;
                questionNum++;
                if (questionNum == 10) {
                    //end game
                    question.setText(getZodiacResult());
                    answer1.setVisibility(View.GONE);
                    answer2.setVisibility(View.GONE);
                    answer3.setVisibility(View.GONE);
                    answer4.setVisibility(View.GONE);
                    answer5.setVisibility(View.GONE);
                    answer6.setVisibility(View.GONE);
                    answer7.setVisibility(View.GONE);
                    answer8.setVisibility(View.GONE);
                    answer9.setVisibility(View.GONE);
                    answer10.setVisibility(View.GONE);
                    answer11.setVisibility(View.GONE);
                    answer12.setVisibility(View.GONE);
                } else {
                    updateQuestion(questionNum);
                }
            }
        });

        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signCount[2]++;
                questionNum++;
                if (questionNum == 10) {
                    //end game
                    question.setText(getZodiacResult());
                    answer1.setVisibility(View.GONE);
                    answer2.setVisibility(View.GONE);
                    answer3.setVisibility(View.GONE);
                    answer4.setVisibility(View.GONE);
                    answer5.setVisibility(View.GONE);
                    answer6.setVisibility(View.GONE);
                    answer7.setVisibility(View.GONE);
                    answer8.setVisibility(View.GONE);
                    answer9.setVisibility(View.GONE);
                    answer10.setVisibility(View.GONE);
                    answer11.setVisibility(View.GONE);
                    answer12.setVisibility(View.GONE);
                } else {
                    updateQuestion(questionNum);
                }
            }
        });

        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signCount[3]++;
                questionNum++;
                if (questionNum == 10) {
                    //end game
                    question.setText(getZodiacResult());
                    answer1.setVisibility(View.GONE);
                    answer2.setVisibility(View.GONE);
                    answer3.setVisibility(View.GONE);
                    answer4.setVisibility(View.GONE);
                    answer5.setVisibility(View.GONE);
                    answer6.setVisibility(View.GONE);
                    answer7.setVisibility(View.GONE);
                    answer8.setVisibility(View.GONE);
                    answer9.setVisibility(View.GONE);
                    answer10.setVisibility(View.GONE);
                    answer11.setVisibility(View.GONE);
                    answer12.setVisibility(View.GONE);
                } else {
                    updateQuestion(questionNum);
                }
            }
        });

        answer5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signCount[4]++;
                questionNum++;
                if (questionNum == 10) {
                    //end game
                    question.setText(getZodiacResult());
                    answer1.setVisibility(View.GONE);
                    answer2.setVisibility(View.GONE);
                    answer3.setVisibility(View.GONE);
                    answer4.setVisibility(View.GONE);
                    answer5.setVisibility(View.GONE);
                    answer6.setVisibility(View.GONE);
                    answer7.setVisibility(View.GONE);
                    answer8.setVisibility(View.GONE);
                    answer9.setVisibility(View.GONE);
                    answer10.setVisibility(View.GONE);
                    answer11.setVisibility(View.GONE);
                    answer12.setVisibility(View.GONE);
                } else {
                    updateQuestion(questionNum);
                }
            }
        });

        answer6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signCount[5]++;
                questionNum++;
                if (questionNum == 10) {
                    //end game
                    question.setText(getZodiacResult());
                    answer1.setVisibility(View.GONE);
                    answer2.setVisibility(View.GONE);
                    answer3.setVisibility(View.GONE);
                    answer4.setVisibility(View.GONE);
                    answer5.setVisibility(View.GONE);
                    answer6.setVisibility(View.GONE);
                    answer7.setVisibility(View.GONE);
                    answer8.setVisibility(View.GONE);
                    answer9.setVisibility(View.GONE);
                    answer10.setVisibility(View.GONE);
                    answer11.setVisibility(View.GONE);
                    answer12.setVisibility(View.GONE);
                } else {
                    updateQuestion(questionNum);
                }
            }
        });

        answer7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signCount[6]++;
                questionNum++;
                if (questionNum == 10) {
                    //end game
                    question.setText(getZodiacResult());
                    answer1.setVisibility(View.GONE);
                    answer2.setVisibility(View.GONE);
                    answer3.setVisibility(View.GONE);
                    answer4.setVisibility(View.GONE);
                    answer5.setVisibility(View.GONE);
                    answer6.setVisibility(View.GONE);
                    answer7.setVisibility(View.GONE);
                    answer8.setVisibility(View.GONE);
                    answer9.setVisibility(View.GONE);
                    answer10.setVisibility(View.GONE);
                    answer11.setVisibility(View.GONE);
                    answer12.setVisibility(View.GONE);
                } else {
                    updateQuestion(questionNum);
                }
            }
        });

        answer8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signCount[7]++;
                questionNum++;
                if (questionNum == 10) {
                    //end game
                    question.setText(getZodiacResult());
                    answer1.setVisibility(View.GONE);
                    answer2.setVisibility(View.GONE);
                    answer3.setVisibility(View.GONE);
                    answer4.setVisibility(View.GONE);
                    answer5.setVisibility(View.GONE);
                    answer6.setVisibility(View.GONE);
                    answer7.setVisibility(View.GONE);
                    answer8.setVisibility(View.GONE);
                    answer9.setVisibility(View.GONE);
                    answer10.setVisibility(View.GONE);
                    answer11.setVisibility(View.GONE);
                    answer12.setVisibility(View.GONE);
                } else {
                    updateQuestion(questionNum);
                }
            }
        });

        answer9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signCount[8]++;
                questionNum++;
                if (questionNum == 10) {
                    //end game
                    question.setText(getZodiacResult());
                    answer1.setVisibility(View.GONE);
                    answer2.setVisibility(View.GONE);
                    answer3.setVisibility(View.GONE);
                    answer4.setVisibility(View.GONE);
                    answer5.setVisibility(View.GONE);
                    answer6.setVisibility(View.GONE);
                    answer7.setVisibility(View.GONE);
                    answer8.setVisibility(View.GONE);
                    answer9.setVisibility(View.GONE);
                    answer10.setVisibility(View.GONE);
                    answer11.setVisibility(View.GONE);
                    answer12.setVisibility(View.GONE);
                } else {
                    updateQuestion(questionNum);
                }
            }
        });

        answer10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signCount[9]++;
                questionNum++;
                if (questionNum == 10) {
                    //end game
                    question.setText(getZodiacResult());
                    answer1.setVisibility(View.GONE);
                    answer2.setVisibility(View.GONE);
                    answer3.setVisibility(View.GONE);
                    answer4.setVisibility(View.GONE);
                    answer5.setVisibility(View.GONE);
                    answer6.setVisibility(View.GONE);
                    answer7.setVisibility(View.GONE);
                    answer8.setVisibility(View.GONE);
                    answer9.setVisibility(View.GONE);
                    answer10.setVisibility(View.GONE);
                    answer11.setVisibility(View.GONE);
                    answer12.setVisibility(View.GONE);
                } else {
                    updateQuestion(questionNum);
                }
            }
        });

        answer11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signCount[10]++;
                questionNum++;
                if (questionNum == 10) {
                    //end game
                    question.setText(getZodiacResult());
                    answer1.setVisibility(View.GONE);
                    answer2.setVisibility(View.GONE);
                    answer3.setVisibility(View.GONE);
                    answer4.setVisibility(View.GONE);
                    answer5.setVisibility(View.GONE);
                    answer6.setVisibility(View.GONE);
                    answer7.setVisibility(View.GONE);
                    answer8.setVisibility(View.GONE);
                    answer9.setVisibility(View.GONE);
                    answer10.setVisibility(View.GONE);
                    answer11.setVisibility(View.GONE);
                    answer12.setVisibility(View.GONE);
                } else {
                    updateQuestion(questionNum);
                }
            }
        });

        answer12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signCount[11]++;
                questionNum++;
                if (questionNum == 10) {
                    //end
                    question.setText(getZodiacResult());
                    answer1.setVisibility(View.GONE);
                    answer2.setVisibility(View.GONE);
                    answer3.setVisibility(View.GONE);
                    answer4.setVisibility(View.GONE);
                    answer5.setVisibility(View.GONE);
                    answer6.setVisibility(View.GONE);
                    answer7.setVisibility(View.GONE);
                    answer8.setVisibility(View.GONE);
                    answer9.setVisibility(View.GONE);
                    answer10.setVisibility(View.GONE);
                    answer11.setVisibility(View.GONE);
                    answer12.setVisibility(View.GONE);
                } else {
                    updateQuestion(questionNum);
                }
            }
        });
    }

    private void updateQuestion(int num) {
        question.setText(questions.getQuestion(num));

        if (num == 4 || num == 7) {
            answer3.setVisibility(View.GONE);
            answer4.setVisibility(View.GONE);
            answer5.setVisibility(View.GONE);
            answer6.setVisibility(View.GONE);
            answer9.setVisibility(View.GONE);
            answer10.setVisibility(View.GONE);
            answer11.setVisibility(View.GONE);
            answer12.setVisibility(View.GONE);

            answer1.setText(questions.getChoice(num, 0));
            answer2.setText(questions.getChoice(num, 1));
            answer7.setText(questions.getChoice(num, 2));
            answer8.setText(questions.getChoice(num, 3));
        } else {
            answer3.setVisibility(View.VISIBLE);
            answer4.setVisibility(View.VISIBLE);
            answer5.setVisibility(View.VISIBLE);
            answer6.setVisibility(View.VISIBLE);
            answer9.setVisibility(View.VISIBLE);
            answer10.setVisibility(View.VISIBLE);
            answer11.setVisibility(View.VISIBLE);
            answer12.setVisibility(View.VISIBLE);

            answer1.setText(questions.getChoice(num, 0));
            answer2.setText(questions.getChoice(num, 1));
            answer3.setText(questions.getChoice(num, 2));
            answer4.setText(questions.getChoice(num, 3));
            answer5.setText(questions.getChoice(num, 4));
            answer6.setText(questions.getChoice(num, 5));
            answer7.setText(questions.getChoice(num, 6));
            answer8.setText(questions.getChoice(num, 7));
            answer9.setText(questions.getChoice(num, 8));
            answer10.setText(questions.getChoice(num, 9));
            answer11.setText(questions.getChoice(num, 10));
            answer12.setText(questions.getChoice(num, 11));
        }
    }

    public String getZodiacResult() {
        int indexOfMax = 0;
        int max = signCount[0];

        for (int i = 1; i < 12; i++) {
            if (signCount[i] > max) {
                indexOfMax = i;
                max = signCount[i];
            }
        }

        if (indexOfMax == 0) {
            return "Aries";
        } else if (indexOfMax == 1) {
            return "Taurus";
        } else if (indexOfMax == 2) {
            return "Gemini";
        } else if (indexOfMax == 3) {
            return "Cancer";
        } else if (indexOfMax == 4) {
            return "Leo";
        } else if (indexOfMax == 5) {
            return "Virgo";
        } else if (indexOfMax == 6) {
            return "Libra";
        } else if (indexOfMax == 7) {
            return "Scorpio";
        } else if (indexOfMax == 8) {
            return "Saggitarius";
        } else if (indexOfMax == 9) {
            return "Capricorn";
        } else if (indexOfMax == 10) {
            return "Aquarius";
        } else {
            return "Pisces";
        }
    }
}
