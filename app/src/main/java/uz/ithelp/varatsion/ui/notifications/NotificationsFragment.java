package uz.ithelp.varatsion.ui.notifications;

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
import uz.ithelp.varatsion.databinding.FragmentNotificationsBinding;

public class NotificationsFragment extends Fragment {


    private FragmentNotificationsBinding binding;
    ArrayList<Model> modelArrayList;
    RecyclerView recyclerView;
    Adapter adapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentNotificationsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        gridListData();

        recyclerView = binding.recyclerViewMy2;
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

        modelArrayList.add(new Model("Основы вариационного исчисления | мотивация понятия функционала",
                "VK0xUte3fEQ", R.drawable.ic_baseline_ondemand_video_24withe));

        modelArrayList.add(new Model("Основы вариационного исчисления | примеры функционалов",
                "iCkEGHezxwQ", R.drawable.ic_baseline_ondemand_video_24withe));

        modelArrayList.add(new Model("Основы вариационного исчисления | мотивируем понятие экстремума для функционала",
                "7XUBd50jPlU", R.drawable.ic_baseline_ondemand_video_24withe));


        modelArrayList.add(new Model("Основы вариационного исчисления | разговоры о вариационной производной | 1",
                "0SD114pXLYg", R.drawable.ic_baseline_ondemand_video_24withe));


        modelArrayList.add(new Model("Основы вариационного исчисления | разговоры о вариационной производной | 2",
                "G65sGQ0J6Oc", R.drawable.ic_baseline_ondemand_video_24withe));



        modelArrayList.add(new Model("Основы вариационного исчисления | разговоры о вариационной производной | 3",
                "b0yrsCD-JDA", R.drawable.ic_baseline_ondemand_video_24withe));


        modelArrayList.add(new Model("Основы вариационного исчисления | уравнение Эйлера Лагранжа | предварительные замечания",
                "MBL3lCKc8RA", R.drawable.ic_baseline_ondemand_video_24withe));


        modelArrayList.add(new Model("Основы вариационного исчисления | уравнение Эйлера Лагранжа | 1",
                "LFqJO4i1yng", R.drawable.ic_baseline_ondemand_video_24withe));


        modelArrayList.add(new Model("Основы вариационного исчисления | уравнение Эйлера Лагранжа | 2",
                "O9gpjKPo-1I", R.drawable.ic_baseline_ondemand_video_24withe));


        modelArrayList.add(new Model("Основы вариационного исчисления | уравнение Эйлера Лагранжа | 3",
                "XQl-5Ac0GVY", R.drawable.ic_baseline_ondemand_video_24withe));


        modelArrayList.add(new Model("Основы вариационного исчисления | уравнение Эйлера Лагранжа | 4",
                "EvFpwjsK7Rs", R.drawable.ic_baseline_ondemand_video_24withe));



        modelArrayList.add(new Model("Основы вариационного исчисления | уравнение Эйлера Лагранжа | 5",
                "ODIaElYlYZE", R.drawable.ic_baseline_ondemand_video_24withe));



        modelArrayList.add(new Model("Основы вариационного исчисления | уравнение Эйлера Лагранжа | 6",
                "AhduGAnM0Lw", R.drawable.ic_baseline_ondemand_video_24withe));



        modelArrayList.add(new Model("Основы вариационного исчисления | конкретные Лагранжианы | 1 | свободная нерелятивистская частица",
                "OX1HHVD7zIU", R.drawable.ic_baseline_ondemand_video_24withe));


        modelArrayList.add(new Model("Основы вариационного исчисления | конкретные Лагранжианы | 2 | классический одномерный осцилятор",
                "o3KyPs5McT0", R.drawable.ic_baseline_ondemand_video_24withe));


        modelArrayList.add(new Model("Основы вариационного исчисления | терминология и особенности обозначений для физики",
                "dJQk-m0LXMU", R.drawable.ic_baseline_ondemand_video_24withe));


        modelArrayList.add(new Model("Основы вариационного исчисления | энергия",
                "wXpu8KEnDTM", R.drawable.ic_baseline_ondemand_video_24withe));


        modelArrayList.add(new Model("Основы вариационного исчисления | импульс",
                "CeUFTPlpfoE", R.drawable.ic_baseline_ondemand_video_24withe));


        modelArrayList.add(new Model("Основы вариационного исчисления | сила",
                "CDhhW2MP3lk", R.drawable.ic_baseline_ondemand_video_24withe));


        modelArrayList.add(new Model("Основы вариационного исчисления | закон сохранения импулься",
                "5FOVBedmesw", R.drawable.ic_baseline_ondemand_video_24withe));


        modelArrayList.add(new Model("Основы вариационного исчисления | закон сохранения энергии",
                "YbVBCwde5EA", R.drawable.ic_baseline_ondemand_video_24withe));


        modelArrayList.add(new Model("Основы вариационного исчисления | уравнение Эйлера Лагранжа | конкретные примеры | 1",
                "SDL5_Lptpyk", R.drawable.ic_baseline_ondemand_video_24withe));


        modelArrayList.add(new Model("Основы вариационного исчисления | уравнение Эйлера Лагранжа | конкретные примеры | 2",
                "_wr2S0wncbs", R.drawable.ic_baseline_ondemand_video_24withe));



        modelArrayList.add(new Model("Основы вариационного исчисления | уравнение Эйлера Лагранжа | конкретные примеры | 3",
                "RT5CmAu0bcY", R.drawable.ic_baseline_ondemand_video_24withe));



        modelArrayList.add(new Model("Основы вариационного исчисления | уравнение Эйлера Лагранжа | конкретные примеры | 4",
                "h4aWate7_As", R.drawable.ic_baseline_ondemand_video_24withe));


        modelArrayList.add(new Model("Основы вариационного исчисления | многомерные вариационные задачи | уравнение Эйлера Лагранжа",
                "rx8Ef0oTIuM", R.drawable.ic_baseline_ondemand_video_24withe));


        modelArrayList.add(new Model("Основы вариационного исчисления | многомерные вариационные задачи | тензор энергии - импульса",
                "qpMUrjIy1Mc", R.drawable.ic_baseline_ondemand_video_24withe));


        modelArrayList.add(new Model("Основы вариационного исчисления | многомерные вариационные задачи | скалярное массивное поле | 1",
                "1FDRMTL4Y34", R.drawable.ic_baseline_ondemand_video_24withe));


        modelArrayList.add(new Model("Основы вариационного исчисления | многомерные вариационные задачи | скалярное массивное поле | 2",
                "o9BRknqJvmA", R.drawable.ic_baseline_ondemand_video_24withe));


        modelArrayList.add(new Model("основы вариационного исчисления | диффеоморфизмы и законы сохранения | 1",
                "Vq9VkDYoiYQ", R.drawable.ic_baseline_ondemand_video_24withe));


        modelArrayList.add(new Model("основы вариационного исчисления | диффеоморфизмы и законы сохранения | 2",
                "dbymcV7kPbc", R.drawable.ic_baseline_ondemand_video_24withe));


        modelArrayList.add(new Model("основы вариационного исчисления | диффеоморфизмы и законы сохранения | 3",
                "ff4a-tLMoaU", R.drawable.ic_baseline_ondemand_video_24withe));


        modelArrayList.add(new Model("основы вариационного исчисления | диффеоморфизмы и законы сохранения | 4",
                "ZTYKoWLY63Q", R.drawable.ic_baseline_ondemand_video_24withe));


        modelArrayList.add(new Model("основы вариационного исчисления | диффеоморфизмы и законы сохранения | 5",
                "WwciA3RG01E", R.drawable.ic_baseline_ondemand_video_24withe));


    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}