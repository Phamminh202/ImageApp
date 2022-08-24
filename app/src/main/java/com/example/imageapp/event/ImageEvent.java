package com.example.imageapp.event;

import com.example.imageapp.model.Pinterest;

public class ImageEvent {
    public static class PinterestEvent {
        private Pinterest pinterest;

        public PinterestEvent(Pinterest pinterest) {
            this.pinterest = pinterest;
        }

        public Pinterest getPinterest() {
            return pinterest;
        }

        public void setPinterest(Pinterest pinterest) {
            this.pinterest = pinterest;
        }
    }

}
