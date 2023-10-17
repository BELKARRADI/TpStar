package com.example.starapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.SearchView;

import com.example.starapplication.Services.StarService;
import com.example.starapplication.entities.Star;
import com.example.starapplication.Adapter.starAdapter;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity  {

    private List<Star> stars;
    private SearchView searchView;
    private StarService service;
    private RecyclerView recyclerView;
    private starAdapter starAdapter = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        stars = new ArrayList<>();
        service =  StarService.getInstance();
        init();
        recyclerView = findViewById(R.id.recyclerView);

        starAdapter starAdapter = null;
        starAdapter = new starAdapter(this, service.findAll());
        recyclerView.setAdapter(starAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

    }


    public void init(){

        service.create(new Star("Leo Messi", "https://media.gettyimages.com/id/1339359625/fr/photo/lionel-messi-of-argentina-celebrates-after-scoring-the-opening-goal-during-a-match-between.jpg?s=2048x2048&w=gi&k=20&c=1SxpNp6YKTkjC1qcJAw4ivLM6VpFQ0K-5xQqivXHQzE=", 3));

        service.create(new Star("Cristiano Ronaldo", "https://media.gettyimages.com/id/1339671524/fr/photo/cristiano-ronaldo-of-manchester-united-looks-on-during-the-premier-league-match-between.jpg?s=2048x2048&w=gi&k=20&c=oIR1oz_4AbxklriqlHQ56Lyf8uCiViZzew04UzpMnCw=", 4));
        service.create(new Star("Karim Benzema", "https://media.gettyimages.com/id/1363505322/fr/photo/karim-benzema-of-real-madrid-cf-celebrates-after-scoring-his-teams-fourth-goal-during-the-la.jpg?s=2048x2048&w=gi&k=20&c=wP0NqD3lhGqP0YRIYwZd4zP8aEXd7uNdOgPUfotFqEM=", 3));
        service.create(new Star("Leo Messi", "https://media.gettyimages.com/id/1339359625/fr/photo/lionel-messi-of-argentina-celebrates-after-scoring-the-opening-goal-during-a-match-between.jpg?s=2048x2048&w=gi&k=20&c=1SxpNp6YKTkjC1qcJAw4ivLM6VpFQ0K-5xQqivXHQzE=", 3));

        service.create(new Star("Cristiano Ronaldo", "https://media.gettyimages.com/id/1339671524/fr/photo/cristiano-ronaldo-of-manchester-united-looks-on-during-the-premier-league-match-between.jpg?s=2048x2048&w=gi&k=20&c=oIR1oz_4AbxklriqlHQ56Lyf8uCiViZzew04UzpMnCw=", 4));
        service.create(new Star("Karim Benzema", "https://media.gettyimages.com/id/1363505322/fr/photo/karim-benzema-of-real-madrid-cf-celebrates-after-scoring-his-teams-fourth-goal-during-the-la.jpg?s=2048x2048&w=gi&k=20&c=wP0NqD3lhGqP0YRIYwZd4zP8aEXd7uNdOgPUfotFqEM=", 3));
        service.create(new Star("Leo Messi", "https://media.gettyimages.com/id/1339359625/fr/photo/lionel-messi-of-argentina-celebrates-after-scoring-the-opening-goal-during-a-match-between.jpg?s=2048x2048&w=gi&k=20&c=1SxpNp6YKTkjC1qcJAw4ivLM6VpFQ0K-5xQqivXHQzE=", 3));

        service.create(new Star("Cristiano Ronaldo", "https://media.gettyimages.com/id/1339671524/fr/photo/cristiano-ronaldo-of-manchester-united-looks-on-during-the-premier-league-match-between.jpg?s=2048x2048&w=gi&k=20&c=oIR1oz_4AbxklriqlHQ56Lyf8uCiViZzew04UzpMnCw=", 4));
        service.create(new Star("Karim Benzema", "https://media.gettyimages.com/id/1363505322/fr/photo/karim-benzema-of-real-madrid-cf-celebrates-after-scoring-his-teams-fourth-goal-during-the-la.jpg?s=2048x2048&w=gi&k=20&c=wP0NqD3lhGqP0YRIYwZd4zP8aEXd7uNdOgPUfotFqEM=", 3));





    }

}
