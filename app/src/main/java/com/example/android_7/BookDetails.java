package com.example.android_7;

import static com.example.android_7.MainActivity.IMAGE_URL_BASE;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
public class BookDetails extends AppCompatActivity {
    public final static String BOOK_EXTRA = "BOOK_EXTRA";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_details);
        TextView bookTitleTextView = findViewById(R.id.book_title);
        TextView bookAuthorTextView = findViewById(R.id.book_author);
        TextView numberOfPagesTextView = findViewById(R.id.number_of_pages);
        TextView bookFirstPublishYearTextView = findViewById(R.id.book_first_publish_year);
        TextView bookLanguagesTextView = findViewById(R.id.book_language);
        TextView bookSubjectsTextView = findViewById(R.id.book_subject);
        ImageView bookCover = findViewById(R.id.img_cover);
        TextView hasEbookTextView = findViewById(R.id.has_ebook);

        Book book = (Book) getIntent().getSerializableExtra(BOOK_EXTRA);

        bookTitleTextView.setText(getString(R.string.title) + " " + book.getTitle());
        bookAuthorTextView.setText(getString(R.string.author) + " " + TextUtils.join(", ", book.getAuthors()));
        numberOfPagesTextView.setText(getString(R.string.pages) + " " + (book.getNumberOfPages()));
        bookFirstPublishYearTextView.setText((getString(R.string.bookfirstpublishyear) + " " + book.getFirstPublishYear()));
        hasEbookTextView.setText(getString(R.string.ebook) + " " + book.getHasEbook());
        bookLanguagesTextView.setText(getString(R.string.language) + " " + TextUtils.join(", ", book.getLanguages()));

        if(book.getSubjects()!= null) {
            bookSubjectsTextView.setText(getString(R.string.subject) + " " + TextUtils.join(", ", book.getSubjects()));
        }

        if (book.getCover() != null) {
            Picasso.with(getApplicationContext())
                    .load(IMAGE_URL_BASE + book.getCover() + "-L.jpg")
                    .placeholder(R.drawable.ic_baseline_book_24).into(bookCover);
        } else {
            bookCover.setImageResource(R.drawable.ic_baseline_book_24);
        }
    }
}
