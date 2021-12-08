package com.example.notificationactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.notificationactivity.databinding.FragmentFirstBinding;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.buttonNotif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                NotificationCompat.Builder firstNotif = new NotificationCompat.Builder(FirstFragment.this);
                nBuilder.setSmallIcon(R.drawable.ic_announcement);
                nBuilder.setContentTitle("Small Notification Sample.");
                nBuilder.setContentText("This is a small notification text.");

                Intent rIntent = new Intent(FirstFragment.this, F)

            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}