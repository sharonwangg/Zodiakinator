package com.example.sharonwang.zodiakinator;

import android.os.AsyncTask;
import android.text.Html;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.io.*;
import org.json.*;

public class FetchData extends AsyncTask<Void, Void, Void> {
    private String data = "";
    private String zodiac;

    public FetchData(String z) {
        zodiac = z;
    }

    @Override
    protected Void doInBackground(Void... voids) {
        try {
            final String urlText = "https://horoscope-api.herokuapp.com/horoscope/today/"+zodiac+"";
            URL url = new URL(urlText);

            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

            String line = "";
            while(line != null) {
                line = bufferedReader.readLine();
                data = data + line;
            }

            try {
                JSONObject horoscope = new JSONObject(data);

                MainActivity.question.append("\n\n");
                String heading = "<b>YOUR DAILY HOROSCOPE:</b>";
                MainActivity.question.append(Html.fromHtml(heading));
                MainActivity.question.append("\n" + horoscope.getString("horoscope"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
    }
}
