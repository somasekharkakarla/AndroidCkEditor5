# AndroidCkEditor5
CkEditor5 is made compact with Android
or Looking for ReactNative [https://github.com/somasekharkakarla/ReactNativeCkEditor5]

### Step1:
copy CkEditor folder and import as new module

### Step2:
Go to project structure in Android studio > select dependencies > select app and add it.

Good Job 👏. you are done with the setup.

### How to use in code?

in layout

```sh
<com.somasekharkakarla.ckeditor5.CkEditor5
        android:id="@+id/ckeditot"
        android:layout_width="match_parent"
        android:layout_height="match_parent"/> 
```

#### To set Data to CKEditor
use method ```sendDataToCKEditor5``` it takes two parameters one is string for sending html data and boolean to make readonly

```activityMainBinding.ckeditot.sendDataToCKEditor5("<p>asdfasdfasdf</p>",false);```

#### To get Data from CKEditor

At class level implement  ```CKEditorDataInterface``` it provides ```getDataFromEditor``` method which returns data as string

### Well Done. Enjoy the CKEditor

### Can Customize? yes, you can

You can go to ckeditor site https://ckeditor.com/ckeditor-5/online-builder/
follow those steps and download the zip. Extract the zip file and open the ckeditor js file. Copy the entire code and paste it in CkEditor library> assets folder > editorhtml > index.html > replace the script code. And open the sample and copy the code from toolbar until create ends and replace in your both index.html

#### look like below:

```sh ClassicEditor.create( document.querySelector( '#editor' ), {
		toolbar: {
			items: [
				'heading',
				'|',
				'highlight',
				'bold',
				'italic',
				'link',
				'blockQuote',
				'bulletedList',
				'numberedList',
				'todoList',
				'insertTable',
				'|',
				'|',
				'undo',
				'redo'
			]
		},
		language: 'en',
		table: {
			contentToolbar: [
				'tableColumn',
				'tableRow',
				'mergeTableCells'
			]
		},
		licenseKey: '',
 ```
 ### License:
For [CkEditor5] rights are same as https://github.com/ckeditor/ckeditor5

For [AndroidCkEditor5] you can use it for free.
