package com.tuportal.example.tuportal.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.tuportal.example.tuportal.R;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback{

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng patan = new LatLng(27.679887, 85.320896);
        mMap.addMarker(new MarkerOptions().position(patan).title("Patan Multiple Campus"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(patan));

        LatLng Mahendra = new LatLng(27.703563, 85.300303);
        mMap.addMarker(new MarkerOptions().position(Mahendra).title("Mahendra Ratna Campus,Tahachal"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Mahendra));


        LatLng sanothimi = new LatLng(27.684389, 85.377399);
        mMap.addMarker(new MarkerOptions().position(sanothimi).title("Sano Thimi Campus"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sanothimi));


//        Marker m1 = googleMap.addMarker(new MarkerOptions()
//                .position(new LatLng(27.703563, 85.300303))
//                .anchor(0.5f, 0.5f)
//                .title("Mahendra Ratna Campus,Tahachal")
//                .snippet("Snippet1")
//                .icon(BitmapDescriptorFactory.fromResource(R.drawable.circle)));


//        Marker m2 = googleMap.addMarker(new MarkerOptions()
//                .position(new LatLng(27.671420, 85.319947))
//                .anchor(0.5f, 0.5f)
//                .title("Nirvana College,Patan")
//                .snippet("Snippet2")
//                .icon(BitmapDescriptorFactory.fromResource(R.drawable.circle)));


//        Marker m3 = googleMap.addMarker(new MarkerOptions()
//                .position(new LatLng(27.706028, 85.320806))
//                .anchor(0.5f, 0.5f)
//                .title("PadnaKanya Multiple Campus,Bagbazzar")
//                .snippet("Snippet3")
//                .icon(BitmapDescriptorFactory.fromResource(R.drawable.circle)));


        LatLng Pkc = new LatLng(27.671420, 85.319947);
        mMap.addMarker(new MarkerOptions().position(Pkc).title("Padma kanya Campus,Baghbazar"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Pkc));
    }
}
