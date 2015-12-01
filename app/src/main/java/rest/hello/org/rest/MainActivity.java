package rest.hello.org.rest;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import org.json.JSONObject;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*if(savedInstanceState == null){
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment()).commit();
        }*/

    }

    @Override
    protected void onStart(){
        super.onStart();
        new HttpRequestTask().execute();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_refresh) {
            new HttpRequestTask().execute();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */

    public static class PlaceholderFragment extends Fragment{
        public PlaceholderFragment(){

        }

        //@Override
        //public View onCreateView(LayoutInflater inflater, ViewGroup container,
            //                     Bundle savedInstanceState){
            //View rootView = inflater.inflate(R.layout.activity_main, container, false);
            //return rootView;
        //}

    }

    //29,41
    //47,05
    //23,52

    private class HttpRequestTask extends AsyncTask<Void, Void, CategoriaList>{

        private ProgressDialog pDialog;
        @Override
        protected void onPreExecute(){
            super.onPreExecute();
            pDialog = new ProgressDialog(MainActivity.this);
            pDialog.setTitle("Por favor aguarde");
            pDialog.setMessage("Buscando categorias...");
            pDialog.setIndeterminate(false);
            pDialog.setCancelable(true);
            pDialog.show();
        }

        @Override
        protected JSONObject

    /*
        @Override
        protected CategoriaList doInBackground(Void... Params){
            try{
                final String url = "http://rest-service.guides.spring.io/greeting";
                RestTemplate restTemplate = new RestTemplate();
                restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
                CategoriaList hashCategoria = restTemplate.getForObject(url, CategoriaList.class);
                while(hashCategoria.)

            }catch(Exception e){
                Log.e("MainActivity", e.getMessage(), e);
            }

            return null;
        }

        @Override
        protected void onPostExecute(Categoria categoria){
            TextView categoriaIdText = (TextView) findViewById(R.id.id_value);
            TextView categoriaNomeText = (TextView) findViewById(R.id.content_value);
            TextView categoriaOrigemText = (TextView) findViewById();

            categoriaIdText.setText(categoria.getId());

            greetingIdText.setText(greeting.getId());

            greetingContentText.setText(greeting.getContent());

            pDialog.dismiss();
        }*/

    }


}
