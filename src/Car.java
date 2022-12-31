public class Car {

        private final String  brand;
        private final String  model;
        private double engineVolume;
        private String color;
        private final int year;
        private final String  country;
        private String transmission;
        private final String bodyType;
        private String registrationNumber;
        private final int seatsCount;
        private boolean summerTyres;
        private Key key;





        private static final String DEFAULT_VALUE = "default";
        private static final double DEFAULT_ENGINE_VOLUME = 1.5;
        private static final String DEFAULT_COLOR = "белый";
        private static final int DEFAULT_YEAR = 2000;
    private static final int DEFAULT_SEATS = 5;

    public Car(String brand, String model, double engineVolume, String color, int year, String country,
               String transmission, String bodyType, String registrationNumber, int seatsCount, boolean summerTyres, boolean remoteStartEngine) {

        if (brand == null || brand.isBlank()) {
            this.brand = DEFAULT_VALUE;
        } else {
            this.brand = brand;
        }

        if (model == null || model.isBlank()) {
            this.model = DEFAULT_VALUE;
        } else {
            this.model = model;
        }

        if (year <= 0) {
            this.year = DEFAULT_YEAR;
        } else {
            this.year = year;
        }

        if (country == null || country.isBlank()) {
            this.country = DEFAULT_VALUE;
        } else {
            this.country = country;
        }
        if (bodyType == null || bodyType.isBlank()) {
            this.bodyType = DEFAULT_VALUE;
        } else {
            this.bodyType = bodyType;
        }
        if (year <= 0) {
            this.seatsCount = DEFAULT_SEATS;
        } else {
            this.seatsCount = seatsCount;
        }

        setEngineVolume(engineVolume);
        setColor(color);
        setTransmission(transmission);
        setRegistrationNumber(registrationNumber);
        setSummerTyres(summerTyres);
        setKey(key);
    }

    class Key {
        private final boolean remoteStartEngine;
        private final boolean keyLessEntry;

        public Key(boolean remoteStartEngine, boolean keyLessEntry) {
            this.remoteStartEngine = remoteStartEngine;
            this.keyLessEntry = keyLessEntry;
        }

        public boolean isRemoteStartEngine() {
            return remoteStartEngine;
        }

        public boolean isKeyLessEntry() {
            return keyLessEntry;
        }

        @Override
        public String toString() {
            return "Key{" +
                    "remoteStartEngine=" + remoteStartEngine +
                    ", keyLessEntry=" + keyLessEntry +
                    '}';
        }
    }


    public String getBrand() {
            return brand;
        }
        public String getModel () {
                return model;
            }


                public double getEngineVolume() {
                    return engineVolume;
                }

                public void setEngineVolume(double engineVolume) {
                    if (engineVolume <= 0) {
                        this.engineVolume = DEFAULT_ENGINE_VOLUME;
                    } else {
                        this.engineVolume = engineVolume;
                    }
                }

                    public String getColor() {
                        return color;
                    }

                    public void setColor(String color) {
                        if (color == null || color.isBlank()) {
                            this.color = DEFAULT_COLOR;
                        } else {
                            this.color = color;
                        }
                    }

                        public int getYear() {
                            return year;
                        }


                            public String getCountry() {
                                return country;
                            }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isBlank()) {
            this.transmission = DEFAULT_VALUE;
        } else {
            this.transmission = transmission;
        }
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null || registrationNumber.isBlank()) {
            this.registrationNumber = DEFAULT_VALUE;
        } else {
            this.registrationNumber = bodyType;
        }
    }

    public int getSeatsCount() {
        return seatsCount;
    }

    public boolean isSummerTyres() {
        return summerTyres;
    }

    public void setSummerTyres(boolean summerTyres) {
        this.summerTyres = summerTyres;
    }

    public void changTyres(int month) {
        if (month >= 4 && month <= 10) {
            setSummerTyres(true);
        } else {
            setSummerTyres(false);
        }
    }

    public void setKey(Key key) {
        if (key == null) {
            this.key = new Key(false, false);
        } else {
            this.key = key;
        }
    }

    @Override
                                public String toString() {
                                    return "Car{" +
                                            "brand='" + brand + '\'' +
                                            ", model='" + model + '\'' +
                                            ", engineVolume=" + engineVolume +
                                            ", color='" + color + '\'' +
                                            ", year=" + year +
                                            ", country='" + country + '\'' +
                                            '}';
                                }}
