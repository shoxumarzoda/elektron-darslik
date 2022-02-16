package uz.ithelp.varatsion.ui.dashboard;

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
import uz.ithelp.varatsion.databinding.FragmentDashboardBinding;

public class DashboardFragment extends Fragment {


    private FragmentDashboardBinding binding;
    ArrayList<Model> modelArrayList;
    RecyclerView recyclerView;
    Adapter adapter;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentDashboardBinding.inflate(inflater, container, false);
        View root = binding.getRoot();



        gridListData();

        recyclerView = binding.recyclerViewMy1;
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

        modelArrayList.add(new Model("1-amaliy. Shartsiz ekstremum",
                "file:///android_asset/a1.htm", R.drawable.ic_baseline_laptop_chromebook_24w));

        modelArrayList.add(new Model("2-amaliy. Shartli ekstremum.",
                "file:///android_asset/a2.htm", R.drawable.ic_baseline_laptop_chromebook_24w));

        modelArrayList.add(new Model("3-amaliy. Funksional. Funksional variatsiyasi va uning xossalari.",
                "file:///android_asset/a3.htm", R.drawable.ic_baseline_laptop_chromebook_24w));

        modelArrayList.add(new Model("4-amaliy. Variatsion hisobning eng sodda masalasi. Eyler tenglamasi.",
                "file:///android_asset/a4.htm", R.drawable.ic_baseline_laptop_chromebook_24w));

        modelArrayList.add(new Model("5-amaliy. Variatsion hisob sodda masalasining umumlashmalari",
                "file:///android_asset/a5.htm", R.drawable.ic_baseline_laptop_chromebook_24w));

        modelArrayList.add(new Model("6-amaliy. Eylerning envariant tenglamasi",
                "file:///android_asset/a6.htm", R.drawable.ic_baseline_laptop_chromebook_24w));

        modelArrayList.add(new Model("7-amaliy. Ekstrimallar maydoni.",
                "file:///android_asset/a7.htm", R.drawable.ic_baseline_laptop_chromebook_24w));

        modelArrayList.add(new Model("8-amaliy. Funksional ekstremumining yetarli sharti.",
                "file:///android_asset/a8.htm", R.drawable.ic_baseline_laptop_chromebook_24w));

        modelArrayList.add(new Model("9-amaliy. Shartli ekstremum",
                "file:///android_asset/a9.htm", R.drawable.ic_baseline_laptop_chromebook_24w));

        modelArrayList.add(new Model("10-amaliy. Qo’zg’aluvchan chegarali  variatsion masala",
                "file:///android_asset/a10.htm", R.drawable.ic_baseline_laptop_chromebook_24w));

        modelArrayList.add(new Model("11-amaliy. Uzilishga ega bo`lgan  masalalar. Bir tomonlama  variatsiyalar",
                "file:///android_asset/a11.htm", R.drawable.ic_baseline_laptop_chromebook_24w));

        modelArrayList.add(new Model("12-amaliy. Gamilton―Yakobi nazariyasi.",
                "file:///android_asset/a12.htm", R.drawable.ic_baseline_laptop_chromebook_24w));

        modelArrayList.add(new Model("13-amaliy. Xos qiymat va xos funksiyalarni topishning variatsion usuli.",
                "file:///android_asset/a13.htm", R.drawable.ic_baseline_laptop_chromebook_24w));

        modelArrayList.add(new Model("14-amaliy. Optimal boshqaruv masalasining umumiy qo’yilishi",
                "file:///android_asset/a14.htm", R.drawable.ic_baseline_laptop_chromebook_24w));

        modelArrayList.add(new Model("15-amaliy. Asosiy tushunchalar",
                "file:///android_asset/a15.htm", R.drawable.ic_baseline_laptop_chromebook_24w));

        modelArrayList.add(new Model("16-amaliy. Uzluksiz funksiyalar.",
                "file:///android_asset/a16.htm", R.drawable.ic_baseline_laptop_chromebook_24w));

        modelArrayList.add(new Model("17-amaliy. O’lchovlilik.",
                "file:///android_asset/a17.htm", R.drawable.ic_baseline_laptop_chromebook_24w));

        modelArrayList.add(new Model("18-amaliy. Ko’p qiymatli akslantirishlarning integrallari.",
                "file:///android_asset/a18.htm", R.drawable.ic_baseline_laptop_chromebook_24w));

        modelArrayList.add(new Model("19-amaliy. Chiziqli  tezkorlik  masalasi.",
                "file:///android_asset/a19.htm", R.drawable.ic_baseline_laptop_chromebook_24w));

        modelArrayList.add(new Model("20-amaliy. Optimal  boshqaruvning  mavjudligi.",
                "file:///android_asset/a20.htm", R.drawable.ic_baseline_laptop_chromebook_24w));



    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}