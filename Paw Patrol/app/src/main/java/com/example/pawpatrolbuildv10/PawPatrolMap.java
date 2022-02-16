package com.example.pawpatrolbuildv10;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Bundle;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;

public class PawPatrolMap extends AppCompatActivity {

    // Initialize Variables
    SupportMapFragment supportMapFragment;
    FusedLocationProviderClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paw_patrol_map);

        // Assign Variable
        supportMapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.google_map);

        // Initialize Fused Location
        client = LocationServices.getFusedLocationProviderClient(this);

        // Check Permission
        if (ActivityCompat.checkSelfPermission(PawPatrolMap.this,
                Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {

            // When Permission is Granted by the User
            // Call method
            getCurrentLocation();
        } else {

            // When Permission Denied
            // Request Permission
            ActivityCompat.requestPermissions(PawPatrolMap.this,
                    new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, 44);

        }

    }

    private void getCurrentLocation() {

        // Initialize Task Location
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        Task<Location> task = client.getLastLocation();
        task.addOnSuccessListener(new OnSuccessListener<Location>() {
            @Override
            public void onSuccess(Location location) {

                // When Success
                if (location != null) {

                    // Sync Map
                    supportMapFragment.getMapAsync(new OnMapReadyCallback() {
                        @Override
                        public void onMapReady(@NonNull GoogleMap googleMap) {


                            // Veterinary Clinics Alternative Program
                            LatLng PreciousFur = new LatLng(14.470832407272493, 121.05781303786132);
                            LatLng JRHPetcare = new LatLng(14.490094384252764, 121.06109652571415);
                            LatLng BlueFin = new LatLng(14.503636324510786, 121.0649369392101);
                            LatLng SouthSide = new LatLng(14.505087298970093, 121.05751760541256);
                            LatLng PinedaPet = new LatLng(14.508935674097371, 121.05937866641797);
                            LatLng CenSigVet = new LatLng(14.510547672589533, 121.05689188068011);
                            LatLng GoldenSpoon = new LatLng(14.515162063916177, 121.05221269703478);
                            LatLng PinkFarm = new LatLng(14.515229924954044, 121.05218318187806);
                            LatLng PinkFarmBranch = new LatLng(14.515589469056057, 121.05200978033035);
                            LatLng SignalAnimalClinic = new LatLng(14.517566494469902, 121.05819650414345);



                            // Titles
                            googleMap.addMarker(new MarkerOptions().position(PreciousFur).title("Precious Fur Animal Clinic").visible(true));
                            googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(PreciousFur, 10));

                            googleMap.addMarker(new MarkerOptions().position(JRHPetcare).title("JRH Pet Care Animal Clinic").visible(true));
                            googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(JRHPetcare, 10));

                            googleMap.addMarker(new MarkerOptions().position(BlueFin).title("Blue Fin Pet Grooming and Veterinary Clinic").visible(true));
                            googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(BlueFin, 10));

                            googleMap.addMarker(new MarkerOptions().position(SouthSide).title("South Side Grooming and Animal Clinic").visible(true));
                            googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(SouthSide, 10));

                            googleMap.addMarker(new MarkerOptions().position(PinedaPet).title("Pineda Pet Grooming and Veterinary Clinic").visible(true));
                            googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(PinedaPet, 10));

                            googleMap.addMarker(new MarkerOptions().position(CenSigVet).title("CenSigVet Pet Grooming and Veterinary Clinic").visible(true));
                            googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(CenSigVet, 10));

                            googleMap.addMarker(new MarkerOptions().position(GoldenSpoon).title("Golden Spoon Pet Grooming and Veterinary Clinic").visible(true));
                            googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(GoldenSpoon, 10));

                            googleMap.addMarker(new MarkerOptions().position(PinkFarm).title("Pink Farm Pet Grooming and Veterinary Clinic").visible(true));
                            googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(PinkFarm, 10));

                            googleMap.addMarker(new MarkerOptions().position(PinkFarmBranch).title("Pink Farm Pet Grooming and Veterinary Clinic").visible(true));
                            googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(PinkFarmBranch, 10));

                            googleMap.addMarker(new MarkerOptions().position(SignalAnimalClinic).title("Signal Village Animal Clinic").visible(true));
                            googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(SignalAnimalClinic, 10));


                            // Initialize Lat Lng
                            LatLng latLng = new LatLng(location.getLatitude(),
                                    location.getLongitude());

                            // Create Marker Options
                            MarkerOptions options = new MarkerOptions().position(latLng)
                                    .title("Current Location");

                            // Zoom Map
                            googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng, 14));

                            // Add Marker
                            googleMap.addMarker(options);

                            // Good thing I found an Alternative solution, lmao xD

                        }
                    });

                }

            }
        });

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        if (requestCode == 44) {

            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {

                // When Permission granted
                // Call Method
                getCurrentLocation();

            }

        }

    }
}