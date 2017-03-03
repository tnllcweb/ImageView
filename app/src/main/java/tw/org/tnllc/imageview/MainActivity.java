package tw.org.tnllc.imageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView1, imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView1 = (ImageView) findViewById(R.id.imageView1Id);
        imageView2 = (ImageView) findViewById(R.id.imageView2Id);

        imageView1.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);

        //imageView.setImageResource(R.drawable.rabbit);


    }
}
