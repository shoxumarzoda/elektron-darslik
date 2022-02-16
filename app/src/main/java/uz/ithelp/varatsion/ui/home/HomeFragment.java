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

        modelArrayList.add(new Model("1-ma’ruza. Variatsion hisobning asosiy masalasini qo‘yilishi. Funksionalning kuchli va kuchsiz minimumlari. Joiz egri chiziqlar.",
                "file:///android_asset/m2.htm", R.drawable.ic_baseline_menu_book_24w));

        modelArrayList.add(new Model("2-ma’ruza. Variatsiya usulining mohiyati. Egri chiziqlarning yaqinligi. Egri chiziq va funksional variatsiyalari. Birinchi va ikkinchi variatsiyalar. Variatsiyalarda kuchsiz minimumning zaruriy  sharti.",
                "file:///android_asset/m1.htm", R.drawable.ic_baseline_menu_book_24w));

        modelArrayList.add(new Model("3-mavzu. Lagranj lemmasi. Eyler-Lagranj tenglamasi. Eyler tenglamasining ekstremali, uning integrallanuvchi hollari. Dyu-Bua-Reymon va Eyler tenglamasining qat’iy chiqarilishi",
                "file:///android_asset/m3.htm", R.drawable.ic_baseline_menu_book_24w));

        modelArrayList.add(new Model("4-mavzu. Ikkinchi tartibli zaruriy shartlar. Gilbert sharti. Nomaxsus ekstremal tushunchasi.",
                "file:///android_asset/m4.htm", R.drawable.ic_baseline_menu_book_24w));

        modelArrayList.add(new Model("5-mavzu. Gilbert teoremasi. Bo‘lakli- silliq funksiyalar uchun funksionalning minimumi sharti. Masalaning qo‘yilishi. Veyyershtass-Erdmon sharti. Lejandr sharti. Yakobi sharti. Yakobi differensial tenglamasi. Kuchsiz minimumning Yakobi zaruriy sharti.",
                "file:///android_asset/m5.htm", R.drawable.ic_baseline_menu_book_24w));

        modelArrayList.add(new Model("6-mavzu. n ta funksiyaga bog‘liq bo‘lgan funksionallar uchun kuchsiz minimumning zaruriy sharti. Yuqori tartibli hosilalarga bog‘liq bo‘lgan funksional uchun kuchsiz minimumning zaruriy sharti.",
                "file:///android_asset/m6.htm", R.drawable.ic_baseline_menu_book_24w));

        modelArrayList.add(new Model("7-mavzu. Eyler – Puasson tenglamasi. n ta erkin o‘zgaruvchili funksiyalarga bog‘liq bo‘lgan funksional uchun kuchsiz minimumning zaruriy sharti.",
                "file:///android_asset/m7.htm", R.drawable.ic_baseline_menu_book_24w));

        modelArrayList.add(new Model("8-mavzu. Eyler-Lagranj tenglamasining umumlashmasi. Parametrik ko‘rinishdagi variatsion masalalar. Yakobi tenglamasi. Veyyershtrass funksiyasi. Kuchsiz minimumning Lejandr sharti.",
                "file:///android_asset/m8.htm", R.drawable.ic_baseline_menu_book_24w));

        modelArrayList.add(new Model("9-ma’ruza. Ko‘p o‘zgaruvchili funksiyalarning ekstremumlari.  Zaruriy va yetarli shartlar. Shartli ekstremum masalasi.  Lagranjning aniqmas ko‘paytuvchilar usuli.",
                "file:///android_asset/m9.htm", R.drawable.ic_baseline_menu_book_24w));

        modelArrayList.add(new Model("10 – ma’ruza.  Boshqariluvchi obyektlar. L.S. Pontryagining maksimum prinsipi. Joiz boshqaruvlar. Tezkor masalalar uchun maksimum prinsipi.",
                "file:///android_asset/m10.htm", R.drawable.ic_baseline_menu_book_24w));

        modelArrayList.add(new Model("11– ma’ruza Dinamik dasturlash usuli. Bellman funksiyasi va differensiallanuvchiligi.  Maksimum prinsipi bilan Lagranjning usuli orasidagi bog‘liqlik.",
                "file:///android_asset/m11.htm", R.drawable.ic_baseline_menu_book_24w));

        modelArrayList.add(new Model("12 - ma’ruza. Bellman tenglamasi. Optimal boshqarishning sintezi masalasi. Sodda apiyeriodik va tebranma sistemalar uchun tezkor boshqarishni sintez qilish masalasi.",
                "file:///android_asset/m12.htm", R.drawable.ic_baseline_menu_book_24w));

        modelArrayList.add(new Model("13-ma’ruza Tezkor boshqarishni sintez qilish masalasi uchun Bellman funksiyasini qurish va tekshirish.",
                "file:///android_asset/m13.htm", R.drawable.ic_baseline_menu_book_24w));

        modelArrayList.add(new Model("14-ma’ruza. Optimal boshqarishning chiziqli masalasi va uning qo‘yilishi.",
                "file:///android_asset/m14.htm", R.drawable.ic_baseline_menu_book_24w));

        modelArrayList.add(new Model("15-MA’RUZA Maksimum prinsipining soddalashishi. Erishishlik sferasi va uning qavariqligi. Maksimum prinsipining isboti.",
                "file:///android_asset/m15.htm", R.drawable.ic_baseline_menu_book_24w));

        modelArrayList.add(new Model("16 – ma’ruza Umumiy holatda bo‘lish sharti va maksimum prinsipi yetarli shart sifatida.",
                "file:///android_asset/m16.htm", R.drawable.ic_baseline_menu_book_24w));

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}