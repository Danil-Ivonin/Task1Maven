package project.repository;

import project.contract.Contract;
import project.contract.internet.Internet_contract;
import project.contract.mobile.Mobile_contract;
import project.contract.tv.TV_contract;

/**
 * The project.repository stores information about contracts
 */
public class Repository {
    private Contract[] arr;
    private int counter;

    /**
     * The constructor creates an empty extensible project.repository
     */
    public Repository() {
        counter = 0;
        arr = new Contract[10];
    }

    /**
     * The function adds a project.contract to the project.repository
     * @param contract Added project.contract
     */
    public void addContract(Contract contract){
        if (counter == arr.length) {
            this.arr = Extend();
        }
        arr[counter] = contract;
        counter++;
    }

    /**
     * The method increases the project.repository capacity by 10 units
     * @return new extended project.repository
     */
    private Contract[] Extend(){
        Contract[] temp = new Contract[this.arr.length + 10];
        for (int i = 0; i < this.arr.length; i++)
            temp[i] = arr[i];
        return temp;
    }

    /**
     * Get information about the project.contract with the specified ID
     * @param id project.contract.Contract ID
     * @return Returns a string with information about the project.contract
     */
    public String getContract(int id) {
        for (int i = 0; i < counter; i++){
            if (arr[i].getID() == id) {
                if (arr[i] instanceof Internet_contract)
                {
                    return ((Internet_contract)arr[i]).toString();
                }
                else if (arr[i] instanceof TV_contract)
                {
                    return ((TV_contract)arr[i]).toString();
                }
                else if (arr[i] instanceof Mobile_contract)
                {
                    return ((Mobile_contract)arr[i]).toString();
                }
                break;
            }
        }
        return "There is no such project.contract!";
    }

    /**
     * Removes the project.contract with the specified ID from the project.repository
     * @param id project.contract.Contract ID
     */
    public void deleteContract(int id) {
        for (int i = 0; i < counter; i++) {
            if (arr[i].getID() == id) {
                for (int j = i; j < counter - 1; j++)
                    arr[j] = arr[j + 1];
                arr[counter - 1] = null;
                counter--;
                break;
            }
        }
    }

    /**
     * Find out the number of contracts in the project.repository
     * @return project.repository.Repository length
     */
    public int getLength(){
        return counter;
    }
}