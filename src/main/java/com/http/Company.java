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

    @Override
    public String toString() {
        return "\t\"company\": {\n" +
                "\t\t\"name=\": " + name + "\",\n" +
                "\t\t\"catchPhrase=\": " + catchPhrase + "\",\n" +
                "\t\t\"bs=\": " + bs + "\"\n" +
                "\t}\n";
    }
}
