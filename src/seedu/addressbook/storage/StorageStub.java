package seedu.addressbook.storage;

import seedu.addressbook.data.AddressBook;
import seedu.addressbook.storage.Storage.StorageOperationException;

public class StorageStub extends Storage {
	
	private String path;
	
	public StorageStub(String path) {
		this.path = path;
	}
	
	public void save(AddressBook addressbook) {
	}
	
	public AddressBook load() throws StorageOperationException {
		return null;
	}
	
	public String getPath() {
		return path;
	}
	
}
