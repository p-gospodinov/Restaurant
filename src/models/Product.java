package models;

import enums.MeasurementType;

import java.lang.*;

public class Product {

        private String name;
        private MeasurementType measurementType;

        private double quantity;

        private double storeQuantity;


        /*
            public Product(Object... obj) {
                this.name = name;
                this.measurementType = measurementType;
                this.quantity = quantity;
                this.storeq = storeq;
            }
         */

        public Product(String name, MeasurementType measurementType, double quantity, double storeQuantity) {
            this.name = name;
            this.measurementType = measurementType;
            this.quantity = quantity;
            this.storeQuantity = storeQuantity;
        }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public MeasurementType getMeasurementType() {
            return measurementType;
        }

        public void setMeasurementType(MeasurementType measurementType) {
            this.measurementType = measurementType;
        }

        public double getQuantity() {
            return quantity;
           // return quantity;
        }
        

        public void setQuantity(double quantity) {
            this.quantity = quantity;
        }


        public double getStoreQuantity() {
            return storeQuantity;
        }
    
        public void setStoreQuantity(double storeQuantity) {
            this.storeQuantity = storeQuantity;
        }

    @Override
        public String toString() {
            return  name  +
                     " quantity left in the storage is " + String.format("%.2f",storeQuantity) + " " + measurementType;

        }


}

