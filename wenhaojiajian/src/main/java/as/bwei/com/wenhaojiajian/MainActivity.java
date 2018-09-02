package as.bwei.com.wenhaojiajian;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private View spread_inside;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spread_inside = findViewById(R.id.spread_inside);
        View viewById = findViewById(R.id.all);
        View viewById1 = findViewById(R.id.iv_add);
        View viewById2 = findViewById(R.id.tv_result);
        View viewById3 = findViewById(R.id.packed);
    }
}
