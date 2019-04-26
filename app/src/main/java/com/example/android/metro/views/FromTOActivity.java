package com.example.android.metro.views;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.android.metro.R;
import com.example.android.metro.Utilities.LinesUtilities;

/**
 * Created by HP on 10/1/2018.
 */

public class FromTOActivity extends AppCompatActivity {
    Spinner spinnerFrom;
    Spinner spinnerTo;
    TextView textViewStations;
    TextView textViewStationsNumber;
    TextView textViewCost;

    String[] allNamesOfStations;
    Button buttonOk;
    private int start = 0;
    private int end = 0;
    int numberOfStations = 0;
    int cost=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_from_to);
        spinnerFrom = findViewById(R.id.spinnerFrom);
        spinnerTo = findViewById(R.id.spinnerTo);
        textViewStations = findViewById(R.id.textViewstations);
        textViewStationsNumber = findViewById(R.id.textViewStationsNumber);
        textViewCost = findViewById(R.id.textViewCost);

        allNamesOfStations = LinesUtilities.getAllnamesOfStations();


        ArrayAdapter spinnerAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, allNamesOfStations);
        buttonOk = findViewById(R.id.buttonOk);
        spinnerFrom.setAdapter(spinnerAdapter);
        spinnerTo.setAdapter(spinnerAdapter);
        spinnerFrom.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                start = i;

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        spinnerTo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                end = i;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        buttonOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewStations.setText("");
                numberOfStations = 0;

                if (start < end && end <= 35) {

                    for (int i = start; i <= end; i++) {
                        textViewStations.append("\n\n" + allNamesOfStations[i]);
                        numberOfStations++;

                    }
                } else if (start > end && start <= 35) {

                    for (int i = start; i >= end; i--) {
                        textViewStations.append("\n\n" + allNamesOfStations[i]);
                        numberOfStations++;

                    }

                } else if (start < end && start > 35 && end <= 53) {

                    for (int i = start; i <= end; i++) {
                        textViewStations.append("\n\n" + allNamesOfStations[i]);
                        numberOfStations++;

                    }

                } else if (start > end && end > 35 && start <= 53) {

                    for (int i = start; i >= end; i--) {

                        textViewStations.append("\n\n" + allNamesOfStations[i]);
                        numberOfStations++;

                    }

                } else if (start < end && start > 53) {

                    for (int i = start; i <= end; i++) {
                        textViewStations.append("\n\n" + allNamesOfStations[i]);
                        numberOfStations++;

                    }

                } else if (start > end && end > 53) {

                    for (int i = start; i >= end; i--) {

                        textViewStations.append("\n\n" + allNamesOfStations[i]);
                        numberOfStations++;

                    }


                }
                // //////////////////////////////////////////////////////////////////////////
                // start to handle transformation between lines

                // from line 1 to line 2
                else if (start <= 35 && end > 35 && end <= 53) {

                    // case 1 transform from sadat
                    if (start < 18) {
                        for (int i = start; i <= 18; i++) {
                            textViewStations.append("\n\n" + allNamesOfStations[i]);
                            numberOfStations++;

                        }
                        //for shobra  diraction
                        if (end > 43) {
                            for (int i = 44; i <= end; i++) {
                                textViewStations.append("\n\n" + allNamesOfStations[i]);
                                numberOfStations++;

                            }


                        }
                        //  for giza diraction
                        else if (end < 43) {
                            for (int i = 42; i >= end; i--) {
                                textViewStations.append("\n\n" + allNamesOfStations[i]);
                                numberOfStations++;

                            }
                        }
                    }

                    // case 2 transform from shohada
                    else if (start > 21) {
                        for (int i = start; i >= 21; i--) {
                            textViewStations.append("\n\n" + allNamesOfStations[i]);
                            numberOfStations++;

                        }
                        //for shobra  diraction
                        if (end > 46) {
                            for (int i = 47; i <= end; i++) {
                                textViewStations.append("\n\n" + allNamesOfStations[i]);
                                numberOfStations++;

                            }


                        }
                        //  for giza diraction
                        else if (end < 46) {
                            for (int i = 45; i >= end; i--) {
                                textViewStations.append("\n\n" + allNamesOfStations[i]);
                                numberOfStations++;

                            }
                        }
                    }
                    // spascial case gamal station num 19
                    else if (start == 19) {
                        if (end > 46) {
                            for (int i = start; i <= 21; i++) {
                                textViewStations.append("\n\n" + allNamesOfStations[i]);
                                numberOfStations++;


                            }
                            for (int i = 47; i <= end; i++) {

                                textViewStations.append("\n\n" + allNamesOfStations[i]);
                                numberOfStations++;


                            }


                        } else if (end < 46) {

                            for (int i = start; i >= 18; i--) {
                                textViewStations.append("\n\n" + allNamesOfStations[i]);
                                numberOfStations++;


                            }
                            if (end < 43) {
                                for (int i = 42; i >= end; i--) {

                                    textViewStations.append("\n\n" + allNamesOfStations[i]);
                                    numberOfStations++;


                                }

                            } else {
                                for (int i = 44; i <= end; i++) {
                                    textViewStations.append("\n\n" + allNamesOfStations[i]);
                                    numberOfStations++;


                                }
                            }
                        }
                    }
                    // optinal case oaby station 20
                    else if (start == 20) {
                        // case  shobra diraction end >46 after shohada
                        if (end > 43) {
                            for (int i = 20; i <= 21; i++) {
                                textViewStations.append("\n\n" + allNamesOfStations[i]);
                                numberOfStations++;


                            }
                            if (end > 46) {
                                for (int i = 47; i <= end; i++) {
                                    textViewStations.append("\n\n" + allNamesOfStations[i]);
                                    numberOfStations++;


                                }

                            } else {
                                for (int i = 45; i >= end; i--) {
                                    textViewStations.append("\n\n" + allNamesOfStations[i]);
                                    numberOfStations++;


                                }
                            }


                        }
                        // case want to go to giza
                        if (end < 43) {
                            for (int i = 20; i >= 18; i--) {
                                textViewStations.append("\n\n" + allNamesOfStations[i]);
                                numberOfStations++;


                            }
                            for (int i = 42; i >= end; i--) {
                                textViewStations.append("\n\n" + allNamesOfStations[i]);
                                numberOfStations++;


                            }


                        }


                    }


                }

                /////////////////////////////////////////////////////////////////////////////
                // transferfrom line 2 to 1

                else if (start >= 35 && start < 54 && end < 35) {
                    // from station in giza to hellwan
                    if (start < 43 && end < 18) {
                        for (int i = start; i <= 43; i++) {
                            textViewStations.append("\n\n" + allNamesOfStations[i]);
                            numberOfStations++;
                        }
                        for (int i = 17; i >= end; i--) {
                            textViewStations.append("\n\n" + allNamesOfStations[i]);
                            numberOfStations++;
                        }
                    }
                    // from shobra to marg
                    else if (start > 46 && end > 21) {
                        for (int i = start; i >= 46; i--) {
                            textViewStations.append("\n\n" + allNamesOfStations[i]);
                            numberOfStations++;
                        }
                        for (int i = 22; i <= end; i++) {
                            textViewStations.append("\n\n" + allNamesOfStations[i]);
                            numberOfStations++;
                        }
                    }
                    // spacial case nagib statin num=44
                    else if (start == 44) {
                        // go to heloan diracyion
                        if (end < 18) {
                            for (int i = start; i >= 43; i--) {
                                textViewStations.append("\n\n" + allNamesOfStations[i]);
                                numberOfStations++;

                            }
                            for (int i = 17; i >= end; i--) {
                                textViewStations.append("\n\n" + allNamesOfStations[i]);
                                numberOfStations++;
                            }
                        }
                        // go to marg
                        else if (end > 21) {
                            for (int i = 44; i <= 46; i++) {
                                textViewStations.append("\n\n" + allNamesOfStations[i]);
                                numberOfStations++;

                            }
                            for (int i = 22; i <= end; i++) {
                                textViewStations.append("\n\n" + allNamesOfStations[i]);
                                numberOfStations++;
                            }
                        }
                        // between sadat and shohada
                        else {
                            for (int i = 44; i >= 43; i--) {
                                textViewStations.append("\n\n" + allNamesOfStations[i]);
                                numberOfStations++;

                            }
                            for (int i = 19; i <= end; i++) {
                                textViewStations.append("\n\n" + allNamesOfStations[i]);
                                numberOfStations++;
                            }

                        }
                    }
                    // case attaba
                    else if (start == 45) {
                        // go to heloan diraction
                        if (end < 18) {
                            for (int i = start; i >= 43; i--) {
                                textViewStations.append("\n\n" + allNamesOfStations[i]);
                                numberOfStations++;

                            }
                            for (int i = 17; i >= end; i--) {
                                textViewStations.append("\n\n" + allNamesOfStations[i]);
                                numberOfStations++;
                            }
                        }
                        // go to marg
                        else if (end > 21) {
                            for (int i = start; i <= 46; i++) {
                                textViewStations.append("\n\n" + allNamesOfStations[i]);
                                numberOfStations++;

                            }
                            for (int i = 22; i <= end; i++) {
                                textViewStations.append("\n\n" + allNamesOfStations[i]);
                                numberOfStations++;
                            }
                        } else {
                            for (int i = start; i <= 46; i++) {
                                textViewStations.append("\n\n" + allNamesOfStations[i]);
                                numberOfStations++;

                            }
                            for (int i = 20; i >= end; i--) {
                                textViewStations.append("\n\n" + allNamesOfStations[i]);
                                numberOfStations++;
                            }

                        }
                    }


                }
                //////////////////////////////////////////////////////////////////////////////
                //// from  line 2 to line 3
                else if (start > 35 && start < 54 && end >= 54) {
                    // case come from shobra diraction
                    if (start >= 45) {
                        for (int i = start; i >= 45; i--) {
                            textViewStations.append("\n\n" + allNamesOfStations[i]);
                            numberOfStations++;
                        }
                    }
                    // case come from giza
                    else {
                        for (int i = start; i <= 45; i++) {
                            textViewStations.append("\n\n" + allNamesOfStations[i]);
                            numberOfStations++;
                        }

                    }
                    for (int i = 61; i >= end; i--) {
                        textViewStations.append("\n\n" + allNamesOfStations[i]);
                        numberOfStations++;
                    }

                }

                //////////////////////////////////////////////////
                // from line 3 to line 2
                if (start >= 54 && end >= 35 && end < 54) {
                    for (int i = start; i <= 62; i++) {
                        textViewStations.append("\n\n" + allNamesOfStations[i]);
                        numberOfStations++;
                    }
                    // go to giza
                    if (end < 45) {
                        for (int i = 44; i >= end; i--) {
                            textViewStations.append("\n\n" + allNamesOfStations[i]);
                            numberOfStations++;
                        }


                    } else {

                        for (int i = 46; i <= end; i++) {
                            textViewStations.append("\n\n" + allNamesOfStations[i]);
                            numberOfStations++;
                        }
                    }
                }
                // from line 1 to line 3
                else if (start < 35 && end >= 54) {
                    // come from helwan
                    if (start <= 18) {
                        for (int i = start; i <= 18; i++) {
                            textViewStations.append("\n\n" + allNamesOfStations[i]);
                            numberOfStations++;
                        }
                        for (int i = 44; i <= 45; i++) {
                            textViewStations.append("\n\n" + allNamesOfStations[i]);
                            numberOfStations++;
                        }
                        for (int i = 61; i >= end; i--) {
                            textViewStations.append("\n\n" + allNamesOfStations[i]);
                            numberOfStations++;
                        }

                    }
                    // orabi and gamal
                    else if (start == 19 || start == 20) {
                        for (int i = start; i <= 21; i++) {
                            textViewStations.append("\n\n" + allNamesOfStations[i]);
                            numberOfStations++;
                        }
                        textViewStations.append("\n\n" + allNamesOfStations[45]);
                        numberOfStations++;
                        for (int i = 61; i >= end; i--) {
                            textViewStations.append("\n\n" + allNamesOfStations[i]);
                            numberOfStations++;
                        }
                    }
                    // from marg
                    else if (start >= 21) {
                        for (int i = start; i >= 21; i--) {
                            textViewStations.append("\n\n" + allNamesOfStations[i]);
                            numberOfStations++;
                        }
                        textViewStations.append("\n\n" + allNamesOfStations[45]);
                        numberOfStations++;
                        for (int i = 61; i >= end; i--) {
                            textViewStations.append("\n\n" + allNamesOfStations[i]);
                            numberOfStations++;
                        }
                    }
                }
                //////////////////////////////////////////////
                // from line 3 to line 1
                else if (start >= 54 && end < 35) {
                    // go to helwan diraction
                    if (end <= 18) {
                        for (int i = start; i <= 62; i++) {
                            textViewStations.append("\n\n" + allNamesOfStations[i]);
                            numberOfStations++;
                        }
                        textViewStations.append("\n\n" + allNamesOfStations[44]);
                        numberOfStations++;
                        for (int i = 18; i >= end; i--) {
                            textViewStations.append("\n\n" + allNamesOfStations[i]);
                            numberOfStations++;
                        }
                    }
                    // go to marg
                    if (end >= 21) {

                        for (int i = start; i <= 62; i++) {
                            textViewStations.append("\n\n" + allNamesOfStations[i]);
                            numberOfStations++;
                        }
                        for(int i=21;i<=end;i++){
                            textViewStations.append("\n\n" + allNamesOfStations[i]);
                            numberOfStations++;

                        }

                    }
                    // go to oraby or gamal
                    else if(end==20||end ==19){
                        for (int i = start; i <= 62; i++) {
                            textViewStations.append("\n\n" + allNamesOfStations[i]);
                            numberOfStations++;
                        }


                        for(int i=21;i>=end;i--){
                            textViewStations.append("\n\n" + allNamesOfStations[i]);
                            numberOfStations++;

                        }
                    }



                }

                cost=calculateCost(numberOfStations);
                textViewStationsNumber.setText(numberOfStations + " stations");
                textViewCost.setText(cost+"LE");
            }
        });
    }


    private int calculateCost(int numOfStations){
        int cost;
        if(numOfStations<=9){
            cost=3;
        }
        else if(numOfStations<=16)
            cost=5;
        else
            cost=7;

        return cost;

    }

}
