import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class PhoneBook {
    String key = "";
    String namePlusPh = "";
    Map<String, String> phoneBook = new TreeMap<>();

    public void addContact(String phone, String name) {
        if (phone.matches("[\\d]{11}") && name.matches("[А-Яа-я]+")) {
            if (phoneBook.containsKey(phone)) {
                phoneBook.replace(phone, phoneBook.get(phone), name);
            } else {
                phoneBook.put(phone, name);
            }
        }

        // проверьте корректность формата имени и телефона
        // (рекомедуется написать отдельные методы для проверки является строка именем/телефоном)
        // если такой номер уже есть в списке, то перезаписать имя абонента
    }

    public String getContactByPhone(String phone) {
        if (phoneBook.containsKey(phone)) {
            return phoneBook.get(phone) + " - " + phone;
        } else {
            return "";
        }

        // формат одного контакта "Имя - Телефон"
        // если контакт не найдены - вернуть пустую строку
    }

    public Set<String> getContactByName(String name) {
        Set<String> setPhoneBook = new TreeSet<>();
        if (phoneBook.containsValue(name)) {
            namePlusPh = namePlusPh.concat(name) + " - ";
            for (String ph : phoneBook.keySet()) {
                if (phoneBook.get(ph).equals(name)) {
                    namePlusPh = namePlusPh.concat(ph) + ", ";
                }
            }
            setPhoneBook.add(namePlusPh.substring(0, namePlusPh.length() - 2));
            return setPhoneBook;
        } else {
            return new TreeSet<>();
        }
        // формат одного контакта "Имя - Телефон"
        // если контакт не найден - вернуть пустой TreeSet
    }

    public Set<String> getContact2Numbers(String phone, String name) {
        TreeSet<String> setPhoneBook = new TreeSet<>();
        if (phoneBook.containsValue(name)){
            for(String ph : phoneBook.keySet())
            {
                if (phoneBook.get(ph).equals(name)){
                    key = ph;
                    setPhoneBook.add(name + " - " + key + ", " + phone);
                    namePlusPh = key + ", " + phone;
                    break;
                }
            }
        }
        phoneBook.remove(key);
        phoneBook.put(namePlusPh, name);
        return setPhoneBook;
    }

    public Set<String> getAllContacts() {
        Set<String> setPhoneBook = new TreeSet<>();
        for (String key : phoneBook.keySet()) {
            setPhoneBook.add(phoneBook.get(key) + " - " + key);
        }
        return setPhoneBook;
    }
        // формат одного контакта "Имя - Телефон"
        // если контактов нет в телефонной книге - вернуть пустой TreeSet
    }

    // для обхода Map используйте получение пары ключ->значение Map.Entry<String,String>
    // это поможет вам найти все ключи (key) по значению (value)
    /*
        for (Map.Entry<String, String> entry : map.entrySet()){
            String key = entry.getKey(); // получения ключа
            String value = entry.getValue(); // получения ключа
        }
    */