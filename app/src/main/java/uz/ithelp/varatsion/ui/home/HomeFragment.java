package uz.ithelp.varatsion.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import uz.ithelp.varatsion.Adapter;
import uz.ithelp.varatsion.Model;
import uz.ithelp.varatsion.R;
import uz.ithelp.varatsion.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {


    private FragmentHomeBinding binding;

    ArrayList<Model> modelArrayList;
    RecyclerView recyclerView;
    Adapter adapter;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        gridListData();

        recyclerView = binding.recyclerViewMy;
        recyclerView.setHasFixedSize(true);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 1);
        gridLayoutManager.setOrientation(RecyclerView.VERTICAL);

        recyclerView.setLayoutManager(gridLayoutManager);

        adapter = new Adapter(getContext(), modelArrayList);

        recyclerView.setAdapter(adapter);


        return root;
    }

    private void gridListData() {
        modelArrayList = new ArrayList<Model>();

        modelArrayList.add(new Model("1-ma’ruza. Variatsion hisobning predmeti, funksionalning ekstremumi.",
                "file:///android_asset/m2.htm", R.drawable.ic_baseline_menu_book_24w));

        modelArrayList.add(new Model("2-ma’ruza. Variatsion hisobning asosiy masalasi (birinchi variatsiyani tekshirish)",
                "file:///android_asset/m1.htm", R.drawable.ic_baseline_menu_book_24w));

        modelArrayList.add(new Model("3-mavzu. Variatsion hisobning asosiy masalasi (ikkinchi variatsiyani tekshirish, ekstremumning yetarli shartlari).",
                "file:///android_asset/m3.htm", R.drawable.ic_baseline_menu_book_24w));

        modelArrayList.add(new Model("4-mavzu. Variatsion hisob asosiy masalasining ba’zi umumlashmalari",
                "file:///android_asset/m4.htm", R.drawable.ic_baseline_menu_book_24w));

        modelArrayList.add(new Model("5-mavzu. Shartli ekstrеmumga qo`yilgan variatsion masalalar",
                "file:///android_asset/m5.htm", R.drawable.ic_baseline_menu_book_24w));

        modelArrayList.add(new Model("6-mavzu. Izoperimetrik masalalar",
                "file:///android_asset/m6.htm", R.drawable.ic_baseline_menu_book_24w));

        modelArrayList.add(new Model("7-mavzu. Optimal boshqaruv masalasining qo’yilishi. Pontryaginning maksimum prinsipi.",
                "file:///android_asset/m7.htm", R.drawable.ic_baseline_menu_book_24w));

        modelArrayList.add(new Model("8-mavzu. Terminal boshqarish masalasi uchun maksimum prinsipi.",
                "file:///android_asset/m8.htm", R.drawable.ic_baseline_menu_book_24w));

        modelArrayList.add(new Model("9-mavzu. Chiziqli boshqarish sistemalari. Tez harakat masalalari.",
                "file:///android_asset/m9.htm", R.drawable.ic_baseline_menu_book_24w));

        modelArrayList.add(new Model("10-ma’ruza. Chekli o’lchovli ekstremal masalalarning umumiy qo’yilishi, xossalari va sinflari. Ekstremal masala yechimining mavjudligi.",
                "file:///android_asset/m10.htm", R.drawable.ic_baseline_menu_book_24w));

        modelArrayList.add(new Model("11 – ma’ruza Qavariq  to’plamlar  va ular ustida amallar.Qavariq to’plamlarning ajralishi. ",
                "file:///android_asset/m11.htm", R.drawable.ic_baseline_menu_book_24w));

        modelArrayList.add(new Model("12 – ma’ruza Qavariq funksiyalar va ularning xossalari. Funksiyalarning qavariqlik kriteriyalari. Qavariq funksiyalarning ekstremumlari.",
                "file:///android_asset/m12.htm", R.drawable.ic_baseline_menu_book_24w));

        modelArrayList.add(new Model("13 - ma’ruza Umumiy minimallashtirish masalasi uchun optimallik shartlari",
                "file:///android_asset/m13.htm", R.drawable.ic_baseline_menu_book_24w));

        modelArrayList.add(new Model("14-ma’ruza. Shartsiz va shartli ekstremum masalalari.",
                "file:///android_asset/m14.htm", R.drawable.ic_baseline_menu_book_24w));

        modelArrayList.add(new Model("15-ma’ruza. Chiziqli bo”lmagan programmalashtirishning umumiy masalasi",
                "file:///android_asset/m15.htm", R.drawable.ic_baseline_menu_book_24w));

        modelArrayList.add(new Model("16-MA’RUZA Qavariq programmalashtirish masalasi",
                "file:///android_asset/m16.htm", R.drawable.ic_baseline_menu_book_24w));

        modelArrayList.add(new Model("17 – ma’ruza Matematik programmalashtirishning hisoblash usullari",
                "file:///android_asset/m17.htm", R.drawable.ic_baseline_menu_book_24w));

        modelArrayList.add(new Model("18 ma’ruza Chiziqli programmalashtirish masalasi",
                "file:///android_asset/m18.htm", R.drawable.ic_baseline_menu_book_24w));


    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}