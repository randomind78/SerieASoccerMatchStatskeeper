package com.marconota.serieasoccerscorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import org.apache.commons.lang3.StringUtils;
import java.lang.String;


public class MainActivity extends AppCompatActivity {
    String scorerNames = "Scorers: ";
    String lastScorer = "";
    int goalsForTeamA = 0;
    int goalsForTeamB = 0;
    int shotsForTeamA = 0;
    int shotsForTeamB = 0;
    int foulsForTeamA = 0;
    int foulsForTeamB = 0;
    int cornersForTeamA = 0;
    int cornersForTeamB = 0;
    int yellowCardsForTeamA = 0;
    int yellowCardsForTeamB = 0;
    int redCardsForTeamA = 0;
    int redCardsForTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // Saves variables in Bundle savedInstanceState
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt("GoalsForTeamA", goalsForTeamA);
        savedInstanceState.putInt("GoalsForTeamB", goalsForTeamB);
        savedInstanceState.putInt("ShotsForTeamA", shotsForTeamA);
        savedInstanceState.putInt("ShotsForTeamB", shotsForTeamB);
        savedInstanceState.putInt("CornersForTeamA", cornersForTeamA);
        savedInstanceState.putInt("CornersForTeamB", cornersForTeamB);
        savedInstanceState.putInt("FoulsForTeamA", foulsForTeamA);
        savedInstanceState.putInt("FoulsForTeamB", foulsForTeamB);
        savedInstanceState.putInt("YellowCardsForTeamA", yellowCardsForTeamA);
        savedInstanceState.putInt("YellowCardsForTeamB", yellowCardsForTeamB);
        savedInstanceState.putInt("RedCardsForTeamA", redCardsForTeamA);
        savedInstanceState.putInt("RedCardsForTeamB", redCardsForTeamB);
        savedInstanceState.putString("ScorerNames",scorerNames );
        savedInstanceState.putString("LastScorer", lastScorer );
    }
// Gets variables from Bundle savedInstanceState and displays them again.
    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        goalsForTeamA = savedInstanceState.getInt("GoalsForTeamA");
        goalsForTeamB = savedInstanceState.getInt("GoalsForTeamB");
        shotsForTeamA = savedInstanceState.getInt("ShotsForTeamA");
        shotsForTeamB = savedInstanceState.getInt("ShotsForTeamB");
        foulsForTeamA = savedInstanceState.getInt("FoulsForTeamA");
        foulsForTeamB = savedInstanceState.getInt("FoulsForTeamB");
        cornersForTeamA = savedInstanceState.getInt("CornersForTeamA");
        cornersForTeamB = savedInstanceState.getInt("CornersForTeamB");
        yellowCardsForTeamA = savedInstanceState.getInt("YellowCardsForTeamA");
        yellowCardsForTeamB = savedInstanceState.getInt("YellowCardsForTeamB");
        redCardsForTeamA = savedInstanceState.getInt("RedCardsForTeamA");
        redCardsForTeamB = savedInstanceState.getInt("RedCardsForTeamB");
        scorerNames = savedInstanceState.getString("ScorerNames");
        lastScorer = savedInstanceState.getString("LastScorer");
        displayGoalsForTeamA(goalsForTeamA);
        displayGoalsForTeamB(goalsForTeamB);
        displayShotsForTeamA(shotsForTeamA);
        displayShotsForTeamB(shotsForTeamB);
        displayFoulsForTeamA(foulsForTeamA);
        displayFoulsForTeamB(foulsForTeamB);
        displayCornersForTeamA(cornersForTeamA);
        displayCornersForTeamB(cornersForTeamB);
        displayYellowCardsForTeamA(yellowCardsForTeamA);
        displayYellowCardsForTeamB(yellowCardsForTeamB);
        displayRedCardsForTeamA(redCardsForTeamA);
        displayRedCardsForTeamB(redCardsForTeamB);
        displayScorers(scorerNames);
    }

    // Displays scorers list
    public void displayScorers(String score) {
        TextView scoreView = (TextView) findViewById(R.id.scorersList);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Displays score for Team A.
     */
    public void displayGoalsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.showGoalsForTeamA);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays score for Team B.
     */
    public void displayGoalsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.showGoalsForTeamB);
        scoreView.setText(String.valueOf(score));

    }

    /**
     * Displays shots for Team A.
     */
    public void displayShotsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.showShotsForTeamA);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays shots for Team B.
     */
    public void displayShotsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.showShotsForTeamB);
        scoreView.setText(String.valueOf(score));

    }

    /**
     * Displays corners for Team A.
     */
    public void displayCornersForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.showCornersForTeamA);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays corners for Team B.
     */
    public void displayCornersForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.showCornersForTeamB);
        scoreView.setText(String.valueOf(score));

    }

    /**
     * Displays fouls for Team A.
     */
    public void displayFoulsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.showFoulsForTeamA);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays fouls for Team B.
     */
    public void displayFoulsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.showFoulsForTeamB);
        scoreView.setText(String.valueOf(score));

    }

    /**
     * Displays yellow cards for Team A.
     */
    public void displayYellowCardsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.showYellowCardsForTeamA);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays yellow cards for Team B.
     */
    public void displayYellowCardsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.showYellowCardsForTeamB);
        scoreView.setText(String.valueOf(score));

    }

    /**
     * Displays red cards for Team A.
     */
    public void displayRedCardsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.showRedCardsForTeamA);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays red cards for Team B.
     */
    public void displayRedCardsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.showRedCardsForTeamB);
        scoreView.setText(String.valueOf(score));

    }

    // Adds goal for team A
    public void addOneGoalForTeamA(View view) {

        goalsForTeamA = goalsForTeamA + 1;
        displayGoalsForTeamA(goalsForTeamA);

    }


    // Adds goal for team B
    public void addOneGoalForTeamB(View view) {

        goalsForTeamB = goalsForTeamB + 1;
        displayGoalsForTeamB(goalsForTeamB);
    }

    // Subtracts goal for team A and prevents stat provides negative number
    public void subtractOneGoalForTeamA(View view) {

        if (goalsForTeamA>0)

        {goalsForTeamA = goalsForTeamA - 1;
            displayGoalsForTeamA(goalsForTeamA);
        }
        else
        {goalsForTeamA = 0;
            displayGoalsForTeamA(goalsForTeamA);
        }
    }

    // Subtracts goal for team B and prevents stat provides negative number
    public void subtractOneGoalForTeamB(View view) {

        if (goalsForTeamB>0)

        {goalsForTeamB = goalsForTeamB - 1;
            displayGoalsForTeamB(goalsForTeamB);
        }
        else
        {goalsForTeamB = 0;
            displayGoalsForTeamB(goalsForTeamB);
        }
    }

    // Adds shot for team A
    public void addOneShotForTeamA(View view) {

        shotsForTeamA = shotsForTeamA + 1;
        displayShotsForTeamA(shotsForTeamA);
    }

    // Adds shot for team B
    public void addOneShotForTeamB(View view) {

        shotsForTeamB = shotsForTeamB + 1;
        displayShotsForTeamB(shotsForTeamB);
    }

    // Subtracts shot for team A and prevents stat provides negative number
    public void subtractOneShotForTeamA(View view) {

        if (shotsForTeamA>0)

        {shotsForTeamA = shotsForTeamA - 1;
        displayShotsForTeamA(shotsForTeamA);
        }
        else
        {shotsForTeamA = 0;
            displayShotsForTeamA(shotsForTeamA);
        }
    }

    // Subtracts shot for team B and prevents stat provides negative number
    public void subtractOneShotForTeamB(View view) {

        if (shotsForTeamB>0)

        {shotsForTeamB = shotsForTeamB - 1;
            displayShotsForTeamB(shotsForTeamB);
        }
        else
        {shotsForTeamB = 0;
            displayShotsForTeamB(shotsForTeamB);
        }
    }


    // Adds corner for team A
    public void addOneCornerForTeamA(View view) {

        cornersForTeamA = cornersForTeamA + 1;
        displayCornersForTeamA(cornersForTeamA);
    }

    // Adds corner for team B
    public void addOneCornerForTeamB(View view) {

        cornersForTeamB = cornersForTeamB + 1;
        displayCornersForTeamB(cornersForTeamB);
    }

    // Subtracts corner for team A and prevents stat provides negative number
    public void subtractOneCornerForTeamA(View view) {

        if (cornersForTeamA>0)

        {cornersForTeamA = cornersForTeamA - 1;
            displayCornersForTeamA(cornersForTeamA);
        }
        else
        {cornersForTeamA = 0;
            displayCornersForTeamA(cornersForTeamA);
        }
    }

    // Subtracts corner for team B and prevents stat provides negative number
    public void subtractOneCornerForTeamB(View view)  {

        if (cornersForTeamB>0)

        {cornersForTeamB = cornersForTeamB - 1;
            displayCornersForTeamB(cornersForTeamB);
        }
        else
        {cornersForTeamB = 0;
            displayCornersForTeamB(cornersForTeamB);
        }
    }


    // Adds foul for team A
    public void addOneFoulForTeamA(View view) {

        foulsForTeamA = foulsForTeamA + 1;
        displayFoulsForTeamA(foulsForTeamA);
    }

    // Adds foul for team B
    public void addOneFoulForTeamB(View view) {

        foulsForTeamB = foulsForTeamB + 1;
        displayFoulsForTeamB(foulsForTeamB);
    }

    // Subtracts foul for team A and prevents stat provides negative number
    public void subtractOneFoulForTeamA(View view)  {

        if (foulsForTeamA>0)

        {foulsForTeamA = foulsForTeamA - 1;
            displayFoulsForTeamA(foulsForTeamA);
        }
        else
        {foulsForTeamA = 0;
            displayFoulsForTeamA(foulsForTeamA);
        }
    }

    // Subtracts foul for team B and prevents stat provides negative number
    public void subtractOneFoulForTeamB(View view) {

        if (foulsForTeamB>0)

        {foulsForTeamB = foulsForTeamB - 1;
            displayFoulsForTeamB(foulsForTeamB);
        }
        else
        {foulsForTeamB = 0;
            displayFoulsForTeamB(foulsForTeamB);
        }
    }


    // Adds yellow card for team A
    public void addOneYellowCardForTeamA(View view) {

        yellowCardsForTeamA = yellowCardsForTeamA + 1;
        displayYellowCardsForTeamA(yellowCardsForTeamA);
    }

    // Adds yellow card for team B
    public void addOneYellowCardForTeamB(View view) {

        yellowCardsForTeamB = yellowCardsForTeamB + 1;
        displayYellowCardsForTeamB(yellowCardsForTeamB);
    }

    // Subtracts yellow card for team A and prevents stat provides negative number
    public void subtractOneYellowCardForTeamA(View view) {

        if (yellowCardsForTeamA>0)

        {yellowCardsForTeamA = yellowCardsForTeamA - 1;
            displayYellowCardsForTeamA(yellowCardsForTeamA);
        }
        else
        {yellowCardsForTeamA = 0;
            displayYellowCardsForTeamA(yellowCardsForTeamA);
        }
    }

    // Subtracts yellow card for team B and prevents stat provides negative number
    public void subtractOneYellowCardForTeamB(View view) {

        if (yellowCardsForTeamB>0)

        {yellowCardsForTeamB = yellowCardsForTeamB - 1;
            displayYellowCardsForTeamB(yellowCardsForTeamB);
        }
        else
        {yellowCardsForTeamB = 0;
            displayYellowCardsForTeamB(yellowCardsForTeamB);
        }
    }


    // Adds red card for team A
    public void addOneRedCardForTeamA(View view) {

        redCardsForTeamA = redCardsForTeamA + 1;
        displayRedCardsForTeamA(redCardsForTeamA);
    }

    // Adds red card for team B
    public void addOneRedCardForTeamB(View view) {

        redCardsForTeamB = redCardsForTeamB + 1;
        displayRedCardsForTeamB(redCardsForTeamB);
    }

    // Subtracts red card for team A and prevents stat provides negative number
    public void subtractOneRedCardForTeamA(View view) {

        if (redCardsForTeamA>0)

        {redCardsForTeamA = redCardsForTeamA - 1;
            displayRedCardsForTeamA(redCardsForTeamA);
        }
        else
        {redCardsForTeamA = 0;
            displayRedCardsForTeamA(redCardsForTeamA);
        }
    }

    // Subtracts red card for team B and prevents stat provides negative number
    public void subtractOneRedCardForTeamB(View view) {

        if (redCardsForTeamB>0)

        {redCardsForTeamB = redCardsForTeamB - 1;
            displayRedCardsForTeamB(redCardsForTeamB);
        }
        else
        {redCardsForTeamB = 0;
            displayRedCardsForTeamB(redCardsForTeamB);
        }
    }

// Resets match stats

    public void resetMatchStats(View view) {
        scorerNames = "Scorers: ";
        displayScorers(scorerNames);
        lastScorer = "";
        goalsForTeamA = 0;
        displayGoalsForTeamA(goalsForTeamA);
        goalsForTeamB = 0;
        displayGoalsForTeamB(goalsForTeamB);
        shotsForTeamA = 0;
        displayShotsForTeamA(shotsForTeamA);
        shotsForTeamB = 0;
        displayShotsForTeamB(shotsForTeamB);
        foulsForTeamA = 0;
        displayFoulsForTeamA(foulsForTeamA);
        foulsForTeamB = 0;
        displayFoulsForTeamB(foulsForTeamB);
        cornersForTeamA = 0;
        displayCornersForTeamA(cornersForTeamA);
        cornersForTeamB = 0;
        displayCornersForTeamB(cornersForTeamB);
        yellowCardsForTeamA = 0;
        displayYellowCardsForTeamA(yellowCardsForTeamA);
        yellowCardsForTeamB = 0;
        displayYellowCardsForTeamB(yellowCardsForTeamB);
        redCardsForTeamA = 0;
        displayRedCardsForTeamA(redCardsForTeamA);
        redCardsForTeamB = 0;
        displayRedCardsForTeamB(redCardsForTeamB);
    }



    //Adds last scorer in editText to scorers list and displays the updated scorers list

    //If the add scorer field is empty, it doesn't update variable lastScorer.

    public void addScorer(View view) {
        EditText addScorer = (EditText) findViewById(R.id.addScorerField);
        String lastScorerPrep = addScorer.getText().toString();
        if (StringUtils.isEmpty(lastScorerPrep))
        {

        }
        //Else it takes the value from add scorer field, assign it to variable lastScorer, then it  displays updated scorers
        // and reset add scorer field
        else {
            lastScorer = lastScorerPrep;
            scorerNames = scorerNames + lastScorer + ", ";
            displayScorers(scorerNames);
            addScorer.setText(null);
        }
    }

    //Deletes last scorer from scorers list
    public void deleteLastScorer(View view) {

        scorerNames = scorerNames.replaceFirst((lastScorer + ", "), "");
        displayScorers(scorerNames);
    }
}

