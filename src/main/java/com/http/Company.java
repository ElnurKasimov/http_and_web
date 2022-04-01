package com.http;

public class Company {
    String name;
    String catchPhrase;
    String bs;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCatchPhrase() {
        return catchPhrase;
    }

    public void setCatchPhrase(String catchPhrase) {
        this.catchPhrase = catchPhrase;
    }

    public String getBs() {
        return bs;
    }

    public void setBs(String bs) {
        this.bs = bs;
    }

    public static class Builder {
        private final Company newCompany;

        public Builder() {
            newCompany = new Company();
        }

        public Company.Builder  withName(String name) {
            newCompany.name = name;
            return this;
        }

        public Company.Builder  withCatchPhrase(String catchPhrase) {
            newCompany.catchPhrase = catchPhrase;
            return this;
        }

        public Company.Builder  withBS(String bs) {
            newCompany.bs = bs;
            return this;
        }

        public Company build() {
            return newCompany;
        }
    }


    @Override
    public String toString() {
        return "\t\"company\": {\n" +
                "\t\t\"name=\": " + name + "\",\n" +
                "\t\t\"catchPhrase=\": " + catchPhrase + "\",\n" +
                "\t\t\"bs=\": " + bs + "\"\n" +
                "\t}\n";
    }
}
