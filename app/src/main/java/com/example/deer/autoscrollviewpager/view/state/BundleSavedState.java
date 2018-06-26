package com.example.deer.autoscrollviewpager.view.state;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View.BaseSavedState;

public class BundleSavedState extends BaseSavedState {

    private Bundle mBundle = new Bundle();

    public BundleSavedState(Parcel source) {
        super(source);
        mBundle = source.readBundle();
    }

    public BundleSavedState(Parcelable superState) {
        super(superState);
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {
        super.writeToParcel(out, flags);
        out.writeBundle(mBundle);
    }

    public Bundle getBundle() {
        return mBundle;
    }

    public static final Creator CREATOR = new Creator() {
        @Override
        public Object createFromParcel(Parcel source) {
            return new BundleSavedState(source);
        }

        @Override
        public Object[] newArray(int size) {
            return new BundleSavedState[size];
        }
    };
}
