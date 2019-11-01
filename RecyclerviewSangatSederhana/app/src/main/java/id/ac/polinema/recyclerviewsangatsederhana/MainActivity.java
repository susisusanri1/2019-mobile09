package id.ac.polinema.recyclerviewsangatsederhana;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import id.ac.polinema.recyclerviewsangatsederhana.adapters.SuperHeroAdapter;
import id.ac.polinema.recyclerviewsangatsederhana.models.SuperHero;

public class MainActivity extends AppCompatActivity {
    //instansiasi Recyclerview
    RecyclerView rvSuperHero;
    //instansiasi list superhero
    List<SuperHero> listSuperHero = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //menyambungkan rvSuperHero ke layout
        rvSuperHero = findViewById(R.id.rvSuperHero);
        //Membuat object hero
        SuperHero hero = new SuperHero("Petruk", "https://upload.wikimedia.org/wikipedia/commons/a/a6/COLLECTIE_TROPENMUSEUM_Papieren_wayangpop_voorstellende_Petruk_%28kinderspeelgoed%29_TMnr_809-45b.jpg");
        //        //menambahkan hero ke listSuperHero
        listSuperHero.add(hero);
        //membuat object hero baru
        hero = new SuperHero("Gareng",  "https://upload.wikimedia.org/wikipedia/commons/f/f8/COLLECTIE_TROPENMUSEUM_Papieren_wayangpop_voorstellende_Nala-gareng_%28kinderspeelgoed%29_TMnr_809-45c.jpg");
        //menambahkan hero baru ke listSuperhero
        listSuperHero.add(hero);
        hero = new SuperHero("Semar",  "https://upload.wikimedia.org/wikipedia/commons/3/3c/Wayang_Kulit_of_Semar_crop.jpg");
        //menambahkan hero baru ke listSuperhero
        listSuperHero.add(hero);
        hero = new SuperHero("Bagong",  "https://upload.wikimedia.org/wikipedia/commons/0/00/COLLECTIE_TROPENMUSEUM_Wajangpop_voorstellende_Bagong_TMnr_3582-16.jpg");
        //menambahkan hero baru ke listSuperhero
        listSuperHero.add(hero);
        //Instansiasi Adapter
        SuperHeroAdapter superHeroAdapter = new SuperHeroAdapter(listSuperHero);
        //set adapter dan layoutmanager
        rvSuperHero.setAdapter(superHeroAdapter);
        rvSuperHero.setLayoutManager(new LinearLayoutManager(this));
    }
}
