package com.example.quotesapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class QuotesActivity extends AppCompatActivity {

    TextView txtTitle;
    RecyclerView recyclerview1;

    ArrayList<ModalClassQuotes> quoteslist = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quotes);

        initview();
    }

    private void initview() {

        String title;

        txtTitle = findViewById(R.id.txtTitle);
        recyclerview1 = findViewById(R.id.recyclerview1);

        if(getIntent()!=null)
        {
            title = getIntent().getStringExtra("catrgoryname");
            txtTitle.setText(title);

//            txtTitle.setText(getIntent().getStringExtra("catrgoryname"));


            if(title.equals("Happy"))
            {
                ModalClassQuotes m1 = new ModalClassQuotes();
                m1.setQuotes("The purpose of our lives is to be happy.");
                quoteslist.add(m1);

                ModalClassQuotes m2 = new ModalClassQuotes();
                m2.setQuotes("sun will rise and we will try again.");
                quoteslist.add(m2);

                ModalClassQuotes m3 = new ModalClassQuotes();
                m3.setQuotes("Happy mind happy life.");
                quoteslist.add(m3);

                ModalClassQuotes m4 = new ModalClassQuotes();
                m4.setQuotes("Believe you can and you will.");
                quoteslist.add(m4);

                ModalClassQuotes m5 = new ModalClassQuotes();
                m5.setQuotes("HAPPINESS is enjoying the little things in life.");
                quoteslist.add(m5);

                ModalClassQuotes m6 = new ModalClassQuotes();
                m6.setQuotes("Today is a great day to smile and be happy.");
                quoteslist.add(m6);

                ModalClassQuotes m7 = new ModalClassQuotes();
                m7.setQuotes("Happiness is a mood. Positivity is a mindset.");
                quoteslist.add(m7);

                ModalClassQuotes m8 = new ModalClassQuotes();
                m8.setQuotes("I believe that when you put a smile out there, you get a smile back.");
                quoteslist.add(m8);

                ModalClassQuotes m9 = new ModalClassQuotes();
                m9.setQuotes("A perfect day is when the soul smile.");
                quoteslist.add(m9);

                ModalClassQuotes m10 = new ModalClassQuotes();
                m10.setQuotes("Smile is one my prized possessions.");
                quoteslist.add(m10);

                ModalClassQuotes m11 = new ModalClassQuotes();
                m11.setQuotes("A smile is a curve that sets everything straight.");
                quoteslist.add(m11);

                ModalClassQuotes m12 = new ModalClassQuotes();
                m12.setQuotes("Be happy with the little that you have. There are people with nothing that still manage to smile.");
                quoteslist.add(m12);

                ModalClassQuotes m13 = new ModalClassQuotes();
                m13.setQuotes("A smile is the best way to get away with trouble even if it's a fake one.");
                quoteslist.add(m13);

                ModalClassQuotes m14 = new ModalClassQuotes();
                m14.setQuotes("'' Happiness '' is the most important, then comes smile, because smile comes from lips, happiness comes from heart.");
                quoteslist.add(m14);

                ModalClassQuotes m15 = new ModalClassQuotes();
                m15.setQuotes("Because of your smile, you make life more beautiful.");
                quoteslist.add(m15);

                ModalClassQuotes m16 = new ModalClassQuotes();
                m16.setQuotes("Count your age by friends, not years. Count your life by smiles, not tears.");
                quoteslist.add(m16);

                ModalClassQuotes m17 = new ModalClassQuotes();
                m17.setQuotes("If you have only one smile in you, give it to the people you LOVE.");
                quoteslist.add(m17);

                ModalClassQuotes m18 = new ModalClassQuotes();
                m18.setQuotes("Smile makes people feel Good and Positive, conveying A sense of Good will rapport, and Trust");
                quoteslist.add(m18);

                ModalClassQuotes m19 = new ModalClassQuotes();
                m19.setQuotes("I salute those people who smiled despite all of their problems.");
                quoteslist.add(m19);

                ModalClassQuotes m20 = new ModalClassQuotes();
                m20.setQuotes("A smile is the best makeup any girl can wear.");
                quoteslist.add(m20);


            }
            else if (title.equals("Emotions"))
            {
                ModalClassQuotes m1 = new ModalClassQuotes();
                m1.setQuotes("Sometimes God doesn't change your situation Because He is trying to change your heart.");
                quoteslist.add(m1);

                ModalClassQuotes m2 = new ModalClassQuotes();
                m2.setQuotes("Feelings come and o like clouds in a windy sky. Conscious breathing is my anchor. ");
                quoteslist.add(m2);

                ModalClassQuotes m3 = new ModalClassQuotes();
                m3.setQuotes("No one cares how much you know, until they know how much you care.");
                quoteslist.add(m3);

                ModalClassQuotes m4 = new ModalClassQuotes();
                m4.setQuotes("The best and most beautiful things in the world cannot be seen or even touched. They must be felt with the heart");
                quoteslist.add(m4);

                ModalClassQuotes m5 = new ModalClassQuotes();
                m5.setQuotes("I don't want to be at the mercy of my emotions. I want to use them, to enjoy them, and to dominate them.");
                quoteslist.add(m5);

                ModalClassQuotes m6 = new ModalClassQuotes();
                m6.setQuotes("One thing you can't hide - is when you're crippled inside.");
                quoteslist.add(m6);

                ModalClassQuotes m7 = new ModalClassQuotes();
                m7.setQuotes("The emotion that can break your heart is sometimes the very one that heals it...");
                quoteslist.add(m7);

                ModalClassQuotes m8 = new ModalClassQuotes();
                m8.setQuotes("Pity those who don't feel anything at all.");
                quoteslist.add(m8);

                ModalClassQuotes m9 = new ModalClassQuotes();
                m9.setQuotes("I envy people that know love. That have someone who takes them as they are.");
                quoteslist.add(m9);

                ModalClassQuotes m10 = new ModalClassQuotes();
                m10.setQuotes("I knew they would kill me when they found out, but…” He struggled for words, releasing a sharp breath. “I think I realized that I would rather die because I betrayed them, than live because I betrayed you.");
                quoteslist.add(m10);

                ModalClassQuotes m11 = new ModalClassQuotes();
                m11.setQuotes("Books can also provoke emotions. And emotions sometimes are even more troublesome than ideas. Emotions have led people to do all sorts of things they later regret-like, oh, throwing a book at someone else.");
                quoteslist.add(m11);

                ModalClassQuotes m12 = new ModalClassQuotes();
                m12.setQuotes("Life is a comedy to those who think, a tragedy to those who feel.");
                quoteslist.add(m12);

                ModalClassQuotes m13 = new ModalClassQuotes();
                m13.setQuotes("One ought to hold on to one's heart; for if one lets it go, one soon loses control of the head too.");
                quoteslist.add(m13);

                ModalClassQuotes m14 = new ModalClassQuotes();
                m14.setQuotes("But feelings can't be ignored, no matter how unjust or ungrateful they seem.");
                quoteslist.add(m14);

                ModalClassQuotes m15 = new ModalClassQuotes();
                m15.setQuotes("The moment we cry in a film is not when things are sad but when they turn out to be more beautiful than we expected them to be.");
                quoteslist.add(m15);

                ModalClassQuotes m16 = new ModalClassQuotes();
                m16.setQuotes("Your emotions make you human. Even the unpleasant ones have a purpose. Don't lock them away. If you ignore them, they just get louder and angrier.");
                quoteslist.add(m16);

                ModalClassQuotes m17 = new ModalClassQuotes();
                m17.setQuotes("All the knowledge I possess everyone else can acquire, but my heart is all my own.");
                quoteslist.add(m17);

                ModalClassQuotes m18 = new ModalClassQuotes();
                m18.setQuotes("Crying does not indicate that you are weak. Since birth, it has always been a sign that you are alive.");
                quoteslist.add(m18);

                ModalClassQuotes m19 = new ModalClassQuotes();
                m19.setQuotes("Sometimes I think, I need a spare heart to feel all the things I feel.");
                quoteslist.add(m19);

                ModalClassQuotes m20 = new ModalClassQuotes();
                m20.setQuotes("It is beautiful, it is endless, it is full and yet seems empty. It hurts us.");
                quoteslist.add(m20);


            }
            else if (title.equals("Love"))
            {
                ModalClassQuotes m1 = new ModalClassQuotes();
                m1.setQuotes("As he read, I fell in love the way you fall asleep: slowly, and then all at once.");
                quoteslist.add(m1);

                ModalClassQuotes m2 = new ModalClassQuotes();
                m2.setQuotes("Loved you yesterday, love you still, always have, always will.");
                quoteslist.add(m2);

                ModalClassQuotes m3 = new ModalClassQuotes();
                m3.setQuotes("The real lover is a man who can thrill you by kissing your forehead or smiling into your eyes or just staring into space.");
                quoteslist.add(m3);

                ModalClassQuotes m4 = new ModalClassQuotes();
                m4.setQuotes("I need you like a heart needs a beat.");
                quoteslist.add(m4);

                ModalClassQuotes m5 = new ModalClassQuotes();
                m5.setQuotes("If I know what love is, it is because of you.");
                quoteslist.add(m5);

                ModalClassQuotes m6 = new ModalClassQuotes();
                m6.setQuotes("I swear I couldn’t love you more than I do right now, and yet I know I will tomorrow.");
                quoteslist.add(m6);

                ModalClassQuotes m7 = new ModalClassQuotes();
                m7.setQuotes("A man is already halfway in love with any woman who listens to him.");
                quoteslist.add(m7);

                ModalClassQuotes m8 = new ModalClassQuotes();
                m8.setQuotes("You make me want to be a better man.");
                quoteslist.add(m8);

                ModalClassQuotes m9 = new ModalClassQuotes();
                m9.setQuotes("Love is that condition in which the happiness of another person is essential to your own.");
                quoteslist.add(m9);

                ModalClassQuotes m10 = new ModalClassQuotes();
                m10.setQuotes("To love at all is to be vulnerable. Love anything and your heart will be wrung and possibly broken. If you want to make sure of keeping it intact you must give it to no one, not even an animal. Wrap it carefully round with hobbies and little luxuries; avoid all entanglements. Lock it up safe in the casket or coffin of your selfishness. But in that casket, safe, dark, motionless, airless, it will change. It will not be broken; it will become unbreakable, impenetrable, irredeemable. To love is to be vulnerable.");
                quoteslist.add(m10);

                ModalClassQuotes m11 = new ModalClassQuotes();
                m11.setQuotes("Love is an untamed force. When we try to control it, it destroys us. When we try to imprison it, it enslaves us. When we try to understand it, it leaves us feeling lost and confused.");
                quoteslist.add(m11);

                ModalClassQuotes m12 = new ModalClassQuotes();
                m12.setQuotes("I love you without knowing how, or when, or from where. I love you simply, without problems or pride: I love you in this way because I do not know any other way of loving but this, in which there is no I or you, so intimate that your hand upon my chest is my hand, so intimate that when I fall asleep your eyes close.");
                quoteslist.add(m12);

                ModalClassQuotes m13 = new ModalClassQuotes();
                m13.setQuotes("The best love is the kind that awakens the soul; that makes us reach for more, that plants the fire in our hearts and brings peace to our minds. That’s what I hope to give you forever.");
                quoteslist.add(m13);

                ModalClassQuotes m14 = new ModalClassQuotes();
                m14.setQuotes("My wish is that you may be loved to the point of madness.");
                quoteslist.add(m14);

                ModalClassQuotes m15 = new ModalClassQuotes();
                m15.setQuotes("Love is always patient and kind. It is never jealous. Love is never boastful or conceited. It is never rude or selfish. It does not take offense and is not resentful. Love takes no pleasure in other people’s sins, but delights in the truth. It is always ready to excuse, to trust, to hope, and to endure whatever comes.");
                quoteslist.add(m15);

                ModalClassQuotes m16 = new ModalClassQuotes();
                m16.setQuotes("One word frees us of all the weight and pain of life: that word is love.");
                quoteslist.add(m16);

                ModalClassQuotes m17 = new ModalClassQuotes();
                m17.setQuotes("This has been my life; I found it worth living.");
                quoteslist.add(m17);

                ModalClassQuotes m18 = new ModalClassQuotes();
                m18.setQuotes("Pursue some path, however narrow and crooked, in which you can walk with love and reverence.");
                quoteslist.add(m18);

                ModalClassQuotes m19 = new ModalClassQuotes();
                m19.setQuotes("I have decided to stick to love; hate is too great a burden to bear.");
                quoteslist.add(m19);

                ModalClassQuotes m20 = new ModalClassQuotes();
                m20.setQuotes("Trust your intuition and be guided by love.");
                quoteslist.add(m20);


            }
            else if (title.equals("Success"))
            {
                ModalClassQuotes m1 = new ModalClassQuotes();
                m1.setQuotes("We cannot solve problems with the kind of thinking we employed when we came up with them.");
                quoteslist.add(m1);

                ModalClassQuotes m2 = new ModalClassQuotes();
                m2.setQuotes("Stay away from those people who try to disparage your ambitions. Small minds will always do that, but great minds will give you a feeling that you can become great too.");
                quoteslist.add(m2);

                ModalClassQuotes m3 = new ModalClassQuotes();
                m3.setQuotes("It is only when we take chances, when our lives improve. The initial and the most difficult risk that we need to take is to become honest.");
                quoteslist.add(m3);

                ModalClassQuotes m4 = new ModalClassQuotes();
                m4.setQuotes("The road to success and the road to failure are almost exactly the same.");
                quoteslist.add(m4);

                ModalClassQuotes m5 = new ModalClassQuotes();
                m5.setQuotes("There are three ways to ultimate success: The first way is to be kind. The second way is to be kind. The third way is to be kind.");
                quoteslist.add(m5);

                ModalClassQuotes m6 = new ModalClassQuotes();
                m6.setQuotes("The pessimist sees difficulty in every opportunity. The optimist sees opportunity in every difficulty.");
                quoteslist.add(m6);

                ModalClassQuotes m7 = new ModalClassQuotes();
                m7.setQuotes("You learn more from failure than from success. Don’t let it stop you. Failure builds character.");
                quoteslist.add(m7);

                ModalClassQuotes m8 = new ModalClassQuotes();
                m8.setQuotes("Experience is a hard teacher because she gives the test first, the lesson afterwards.");
                quoteslist.add(m8);

                ModalClassQuotes m9 = new ModalClassQuotes();
                m9.setQuotes("Concentrate all your thoughts upon the work in hand. The sun's rays do not burn until brought to a focus.");
                quoteslist.add(m9);

                ModalClassQuotes m10 = new ModalClassQuotes();
                m10.setQuotes("Setting goals is the first step in turning the invisible into the visible.");
                quoteslist.add(m10);

                ModalClassQuotes m11 = new ModalClassQuotes();
                m11.setQuotes("The thing women have yet to learn is nobody gives you power. You just take it.");
                quoteslist.add(m11);

                ModalClassQuotes m12 = new ModalClassQuotes();
                m12.setQuotes("Women must learn to play the game as men do.");
                quoteslist.add(m12);

                ModalClassQuotes m13 = new ModalClassQuotes();
                m13.setQuotes("The successful man will profit from his mistakes and try again in a different way.");
                quoteslist.add(m13);

                ModalClassQuotes m14 = new ModalClassQuotes();
                m14.setQuotes("A successful man is one who can lay a firm foundation with the bricks others have thrown at him.");
                quoteslist.add(m14);

                ModalClassQuotes m15 = new ModalClassQuotes();
                m15.setQuotes("You’ll find that education is just about the only thing lying around loose in this world, and it’s about the only thing a fellow can have as much of as he’s willing to haul away.");
                quoteslist.add(m15);

                ModalClassQuotes m16 = new ModalClassQuotes();
                m16.setQuotes("Success is stumbling from failure to failure with no loss of enthusiasm.");
                quoteslist.add(m16);

                ModalClassQuotes m17 = new ModalClassQuotes();
                m17.setQuotes("When I believe in something, I’m like a dog with a bone.");
                quoteslist.add(m17);

                ModalClassQuotes m18 = new ModalClassQuotes();
                m18.setQuotes("Perfection is not attainable. But if we chase perfection we can catch excellence.");
                quoteslist.add(m18);

                ModalClassQuotes m19 = new ModalClassQuotes();
                m19.setQuotes("I am so clever that sometimes I don’t understand a single word of what I am saying.");
                quoteslist.add(m19);

                ModalClassQuotes m20 = new ModalClassQuotes();
                m20.setQuotes("Talent wins games, but teamwork and intelligence win championships.");
                quoteslist.add(m20);


            }
            else if (title.equals("Friendship"))
            {
                ModalClassQuotes m1 = new ModalClassQuotes();
                m1.setQuotes("Friends till the end A true friend is one soul in two bodies.");
                quoteslist.add(m1);

                ModalClassQuotes m2 = new ModalClassQuotes();
                m2.setQuotes("Your vibe attracts your tribe Friends don’t let friends do silly things alone.");
                quoteslist.add(m2);

                ModalClassQuotes m3 = new ModalClassQuotes();
                m3.setQuotes("Love is beautiful, friendship is better");
                quoteslist.add(m3);

                ModalClassQuotes m4 = new ModalClassQuotes();
                m4.setQuotes("Best friends don’t care if your house is clean. They care if you have wine.");
                quoteslist.add(m4);

                ModalClassQuotes m5 = new ModalClassQuotes();
                m5.setQuotes("I hope we’re friends until we die. Then, I hope we stay ghost friends so we can walk through walls and scare people.");
                quoteslist.add(m5);

                ModalClassQuotes m6 = new ModalClassQuotes();
                m6.setQuotes("Strangers think I’m quiet, my friends think I’m outgoing, but my best friends know that I’m completely insane.");
                quoteslist.add(m6);

                ModalClassQuotes m7 = new ModalClassQuotes();
                m7.setQuotes("I hope we’re friends until we die. Then, I hope we stay ghost friends so we can walk through walls and scare people.");
                quoteslist.add(m7);

                ModalClassQuotes m8 = new ModalClassQuotes();
                m8.setQuotes("Friends come and go like waves of the ocean, but the true ones stick like an octopus on your face.");
                quoteslist.add(m8);

                ModalClassQuotes m9 = new ModalClassQuotes();
                m9.setQuotes("Real friendship is when your friend comes over to your house just take a nap.");
                quoteslist.add(m9);

                ModalClassQuotes m10 = new ModalClassQuotes();
                m10.setQuotes("Friends pick us up when we fall down, and if they can’t pick us up they lie down and listen for awhile.");
                quoteslist.add(m10);

                ModalClassQuotes m11 = new ModalClassQuotes();
                m11.setQuotes("Best friend: one million memories, ten thousand inside jokes, one hundred shared secrets.");
                quoteslist.add(m11);

                ModalClassQuotes m12 = new ModalClassQuotes();
                m12.setQuotes("Good friends show their love in times of trouble, not just in times of happiness.");
                quoteslist.add(m12);

                ModalClassQuotes m13 = new ModalClassQuotes();
                m13.setQuotes("“There are no strangers here; Only friends you haven’t yet met.” ");
                quoteslist.add(m13);

                ModalClassQuotes m14 = new ModalClassQuotes();
                m14.setQuotes("“Man’s best support is a very dear friend.”");
                quoteslist.add(m14);

                ModalClassQuotes m15 = new ModalClassQuotes();
                m15.setQuotes("Friendship at first sight, like love at first sight, is said to be the only truth.");
                quoteslist.add(m15);

                ModalClassQuotes m16 = new ModalClassQuotes();
                m16.setQuotes("As we grow up, we realize it’s less important to have a ton of friends and more important to have real ones.");
                quoteslist.add(m16);

                ModalClassQuotes m17 = new ModalClassQuotes();
                m17.setQuotes("Fake friends believe in rumors; real friends believe in you.");
                quoteslist.add(m17);

                ModalClassQuotes m18 = new ModalClassQuotes();
                m18.setQuotes("Nothing makes the earth seem so spacious as to have friends at a distance; they make the latitudes and longitudes.");
                quoteslist.add(m18);

                ModalClassQuotes m19 = new ModalClassQuotes();
                m19.setQuotes("F.R.I.E.N.D.S: Fight for you. Respect you. Include you. Encourage you. Need you. Deserve you. Stand by you.");
                quoteslist.add(m19);

                ModalClassQuotes m20 = new ModalClassQuotes();
                m20.setQuotes("The only people I owe my loyalty to are those who never made me question theirs.");
                quoteslist.add(m20);


            }
            else if (title.equals("Birthday"))
            {
                ModalClassQuotes m1 = new ModalClassQuotes();
                m1.setQuotes("Today was the best because I got to spend it with you — happy birthday!");
                quoteslist.add(m1);

                ModalClassQuotes m2 = new ModalClassQuotes();
                m2.setQuotes("I hope you’re beginning and ending your day with happy thoughts — happy birthday!");
                quoteslist.add(m2);

                ModalClassQuotes m3 = new ModalClassQuotes();
                m3.setQuotes("Happy birthday to my favorite secret-keeper! Thanks for always keeping things interesting.");
                quoteslist.add(m3);

                ModalClassQuotes m4 = new ModalClassQuotes();
                m4.setQuotes("I can’t imagine life without my best friend, and I’m so grateful for you! Happy birthday!");
                quoteslist.add(m4);

                ModalClassQuotes m5 = new ModalClassQuotes();
                m5.setQuotes("Today a true queen was born and I’m so honored to be in your court. Happy birthday my royal highness!");
                quoteslist.add(m5);

                ModalClassQuotes m6 = new ModalClassQuotes();
                m6.setQuotes("Happy birthday to one of the most special people in my life and wishing you many more.Cheers to the nights that turned into mornings and the friend that turned into family. Happy birthday!");
                quoteslist.add(m6);

                ModalClassQuotes m7 = new ModalClassQuotes();
                m7.setQuotes("The best way to remember your wife’s birthday is to forget it once.");
                quoteslist.add(m7);

                ModalClassQuotes m8 = new ModalClassQuotes();
                m8.setQuotes("Every day I spend with you is the new best day of my life — happy birthday!  ");
                quoteslist.add(m8);

                ModalClassQuotes m9 = new ModalClassQuotes();
                m9.setQuotes("Sending my love to the most wonderful person I know — you always bring out the best in me, and I love you for that.");
                quoteslist.add(m9);

                ModalClassQuotes m10 = new ModalClassQuotes();
                m10.setQuotes("Happy birthday babe! You do so much for others, so I’m thrilled you can take time for yourself on your big day.");
                quoteslist.add(m10);

                ModalClassQuotes m11 = new ModalClassQuotes();
                m11.setQuotes("You’re my one and only, forever and always. Happy birthday my love!");
                quoteslist.add(m11);

                ModalClassQuotes m12 = new ModalClassQuotes();
                m12.setQuotes("No matter where you are in the world, I hope you feel my love. Happy birthday, baby.");
                quoteslist.add(m12);

                ModalClassQuotes m13 = new ModalClassQuotes();
                m13.setQuotes("“A wish for you on your birthday, whatever you ask may you receive, whatever you seek may you find, whatever you wish may it be fulfilled on your birthday and always. Happy birthday!”");
                quoteslist.add(m13);

                ModalClassQuotes m14 = new ModalClassQuotes();
                m14.setQuotes("“May the joy that you have spread in the past come back to you on this day. Wishing you a very happy birthday!”");
                quoteslist.add(m14);

                ModalClassQuotes m15 = new ModalClassQuotes();
                m15.setQuotes("“Birthdays are a new start, a fresh beginning and a time to pursue new endeavors with new goals. Move forward with confidence and courage. You are a very special person. May today and all of your days be amazing!”");
                quoteslist.add(m15);

                ModalClassQuotes m16 = new ModalClassQuotes();
                m16.setQuotes("“Be happy! Today is the day you were brought into this world to be a blessing and inspiration to the people around you! You are a wonderful person! May you be given more birthdays to fulfill all of your dreams!”");
                quoteslist.add(m16);

                ModalClassQuotes m17 = new ModalClassQuotes();
                m17.setQuotes("“Happy Birthday! You know, you don’t look that old. But then, you don’t look that young, either.”");
                quoteslist.add(m17);

                ModalClassQuotes m18 = new ModalClassQuotes();
                m18.setQuotes("“As you get older three things happen. The first is your memory goes, and I can’t remember the other two. Happy birthday!”");
                quoteslist.add(m18);

                ModalClassQuotes m19 = new ModalClassQuotes();
                m19.setQuotes("“Happy birthday to someone who is forever young!”");
                quoteslist.add(m19);

                ModalClassQuotes m20 = new ModalClassQuotes();
                m20.setQuotes("“Congratulations on being even more experienced. I’m not sure what you learned this year, but every experience transforms us into the people we are today. Happy birthday!”");
                quoteslist.add(m20);


            }
            else if (title.equals("Life"))
            {
                ModalClassQuotes m1 = new ModalClassQuotes();
                m1.setQuotes("Life is what happens when you're busy making other plans.");
                quoteslist.add(m1);

                ModalClassQuotes m2 = new ModalClassQuotes();
                m2.setQuotes("Many of life’s failures are people who did not realize how close they were to success when they gave up.");
                quoteslist.add(m2);

                ModalClassQuotes m3 = new ModalClassQuotes();
                m3.setQuotes("If you want to live a happy life, tie it to a goal, not to people or things.");
                quoteslist.add(m3);

                ModalClassQuotes m4 = new ModalClassQuotes();
                m4.setQuotes("Never let the fear of striking out keep you from playing the game.");
                quoteslist.add(m4);

                ModalClassQuotes m5 = new ModalClassQuotes();
                m5.setQuotes("Money and success don’t change people; they merely amplify what is already there.");
                quoteslist.add(m5);

                ModalClassQuotes m6 = new ModalClassQuotes();
                m6.setQuotes("Your time is limited, so don’t waste it living someone else’s life. Don’t be trapped by dogma – which is living with the results of other people’s thinking.");
                quoteslist.add(m6);

                ModalClassQuotes m7 = new ModalClassQuotes();
                m7.setQuotes("Not how long, but how well you have lived is the main thing.");
                quoteslist.add(m7);

                ModalClassQuotes m8 = new ModalClassQuotes();
                m8.setQuotes("The whole secret of a successful life is to find out what is one’s destiny to do, and then do it.");
                quoteslist.add(m8);

                ModalClassQuotes m9 = new ModalClassQuotes();
                m9.setQuotes("If life were predictable it would cease to be life, and be without flavor.");
                quoteslist.add(m9);

                ModalClassQuotes m10 = new ModalClassQuotes();
                m10.setQuotes("The big lesson in life, baby, is never be scared of anyone or anything.");
                quoteslist.add(m10);

                ModalClassQuotes m11 = new ModalClassQuotes();
                m11.setQuotes("Sing like no one’s listening, love like you’ve never been hurt, dance like nobody’s watching, and live like it’s heaven on earth.");
                quoteslist.add(m11);

                ModalClassQuotes m12 = new ModalClassQuotes();
                m12.setQuotes("Do all the good you can, for all the people you can, in all the ways you can, as long as you can.");
                quoteslist.add(m12);

                ModalClassQuotes m13 = new ModalClassQuotes();
                m13.setQuotes("Everybody wants to be famous, but nobody wants to do the work. I live by that. You grind hard so you can play hard. At the end of the day, you put all the work in, and eventually it’ll pay off. It could be in a year, it could be in 30 years. Eventually, your hard work will pay off.");
                quoteslist.add(m13);

                ModalClassQuotes m14 = new ModalClassQuotes();
                m14.setQuotes("Life imposes things on you that you can’t control, but you still have the choice of how you’re going to live through this.");
                quoteslist.add(m14);

                ModalClassQuotes m15 = new ModalClassQuotes();
                m15.setQuotes("Life is like riding a bicycle. To keep your balance, you must keep moving.");
                quoteslist.add(m15);

                ModalClassQuotes m16 = new ModalClassQuotes();
                m16.setQuotes("Life is a succession of lessons which must be lived to be understood.");
                quoteslist.add(m16);

                ModalClassQuotes m17 = new ModalClassQuotes();
                m17.setQuotes("My mama always said, life is like a box of chocolates. You never know what you're gonna get.");
                quoteslist.add(m17);

                ModalClassQuotes m18 = new ModalClassQuotes();
                m18.setQuotes("Watch your thoughts; they become words. Watch your words; they become actions. Watch your actions; they become habits. Watch your habits; they become character. Watch your character; it becomes your destiny.");
                quoteslist.add(m18);

                ModalClassQuotes m19 = new ModalClassQuotes();
                m19.setQuotes("The best portion of a good man's life is his little nameless, unencumbered acts of kindness and of love.");
                quoteslist.add(m19);

                ModalClassQuotes m20 = new ModalClassQuotes();
                m20.setQuotes("Life is a flower of which love is the honey.");
                quoteslist.add(m20);


            }
            else if (title.equals("Book"))
            {
                ModalClassQuotes m1 = new ModalClassQuotes();
                m1.setQuotes("A book is a garden, an orchard, a storehouse, a party, a company by the way, a counselor, a multitude of counselors.");
                quoteslist.add(m1);

                ModalClassQuotes m2 = new ModalClassQuotes();
                m2.setQuotes("When I look back, I am so impressed again with the life-giving power of literature. If I were a young person today, trying to gain a sense of myself in the world, I would do that again by reading, just as I did when I was young.");
                quoteslist.add(m2);

                ModalClassQuotes m3 = new ModalClassQuotes();
                m3.setQuotes("Reading should not be presented to children as a chore, a duty. It should be offered as a gift.");
                quoteslist.add(m3);

                ModalClassQuotes m4 = new ModalClassQuotes();
                m4.setQuotes("I think books are like people, in the sense that they’ll turn up in your life when you most need them.");
                quoteslist.add(m4);

                ModalClassQuotes m5 = new ModalClassQuotes();
                m5.setQuotes("It wasn't until I started reading and found books they wouldn't let us read in school that I discovered you could be insane and happy and have a good life without being like everybody else.");
                quoteslist.add(m5);

                ModalClassQuotes m6 = new ModalClassQuotes();
                m6.setQuotes("Books are a uniquely portable magic.");
                quoteslist.add(m6);

                ModalClassQuotes m7 = new ModalClassQuotes();
                m7.setQuotes("Books are mirrors: You only see in them what you already have inside you.");
                quoteslist.add(m7);

                ModalClassQuotes m8 = new ModalClassQuotes();
                m8.setQuotes("Let’s be reasonable and add an eighth day to the week that is devoted exclusively to reading.\"");
                quoteslist.add(m8);

                ModalClassQuotes m9 = new ModalClassQuotes();
                m9.setQuotes("If you don’t like to read, you haven’t found the right book.");
                quoteslist.add(m9);

                ModalClassQuotes m10 = new ModalClassQuotes();
                m10.setQuotes("I can feel infinitely alive curled up on the sofa reading a book.");
                quoteslist.add(m10);

                ModalClassQuotes m11 = new ModalClassQuotes();
                m11.setQuotes("A good would take me out of myself and then stuff me back in, outsized, now, and uneasy with the fit.");
                quoteslist.add(m11);

                ModalClassQuotes m12 = new ModalClassQuotes();
                m12.setQuotes("Have books ‘happened’ to you? Unless your answer to that question is ‘yes,’ I’m unsure how to talk to you.");
                quoteslist.add(m12);

                ModalClassQuotes m13 = new ModalClassQuotes();
                m13.setQuotes("A story can always break into pieces while it sits inside a book on a shelf; and, decades after we have read it even twenty times, it can open us up, by cut or caress, to a new truth.");
                quoteslist.add(m13);

                ModalClassQuotes m14 = new ModalClassQuotes();
                m14.setQuotes("Reading fiction is important. It is a vital means of imagining a life other than our own, which in turn makes us more empathetic beings. Following complex story lines stretches our brains beyond the 140 characters of sound-bite thinking, and staying within the world of a novel gives us the ability to be quiet and alone, two skills that are disappearing faster than the polar icecaps.");
                quoteslist.add(m14);

                ModalClassQuotes m15 = new ModalClassQuotes();
                m15.setQuotes("Reading is a form of prayer, a guided meditation that briefly makes us believe we’re someone else, disrupting the delusion that we’re permanent and at the center of the universe. Suddenly (we’re saved!) other people are real again, and we’re fond of them.");
                quoteslist.add(m15);

                ModalClassQuotes m16 = new ModalClassQuotes();
                m16.setQuotes("Reading is escape, and the opposite of escape; it's a way to make contact with reality after a day of making things up, and it's a way of making contact with someone else's imagination after a day that's all too real.");
                quoteslist.add(m16);

                ModalClassQuotes m17 = new ModalClassQuotes();
                m17.setQuotes("Reading makes immigrants of us all. It takes us away from home, but more important, it finds homes for us everywhere.");
                quoteslist.add(m17);

                ModalClassQuotes m18 = new ModalClassQuotes();
                m18.setQuotes("You think your pain and your heartbreak are unprecedented in the history of the world, but then you read. It was books that taught me that the things that tormented me most were the very things that connected me with all the people who were alive, who had ever been alive.");
                quoteslist.add(m18);

                ModalClassQuotes m19 = new ModalClassQuotes();
                m19.setQuotes("Reading is important. If you know how to read, then the whole world opens up to you.");
                quoteslist.add(m19);

                ModalClassQuotes m20 = new ModalClassQuotes();
                m20.setQuotes("It is known that reading quickens the growth of a heart like nothing else.");
                quoteslist.add(m20);


            }
            else if (title.equals("Teachers"))
            {
                ModalClassQuotes m1 = new ModalClassQuotes();
                m1.setQuotes("A teacher affects eternity; he can never tell where his influence stops.");
                quoteslist.add(m1);

                ModalClassQuotes m2 = new ModalClassQuotes();
                m2.setQuotes("The beautiful thing about learning is that no one can take it away from you.");
                quoteslist.add(m2);

                ModalClassQuotes m3 = new ModalClassQuotes();
                m3.setQuotes("The duties of a teacher are neither few nor small, but they elevate the mind and give energy to the character.");
                quoteslist.add(m3);

                ModalClassQuotes m4 = new ModalClassQuotes();
                m4.setQuotes("A teacher's job is to take a bunch of live wires and see that they are well-grounded.");
                quoteslist.add(m4);

                ModalClassQuotes m5 = new ModalClassQuotes();
                m5.setQuotes("Teaching is a calling too. And I’ve always thought that teachers in their way are holy—angels leading their flocks out of the darkness.");
                quoteslist.add(m5);

                ModalClassQuotes m6 = new ModalClassQuotes();
                m6.setQuotes("If you have to put someone on a pedestal, put teachers. They are society's heroes.");
                quoteslist.add(m6);

                ModalClassQuotes m7 = new ModalClassQuotes();
                m7.setQuotes("Better than a thousand days of diligent study is one day with a great teacher.");
                quoteslist.add(m7);

                ModalClassQuotes m8 = new ModalClassQuotes();
                m8.setQuotes("Your heart is slightly larger than the average human heart, but that's because you're a teacher.");
                quoteslist.add(m8);

                ModalClassQuotes m9 = new ModalClassQuotes();
                m9.setQuotes("Teachers can change lives with the right mix of chalk and challenges.");
                quoteslist.add(m9);

                ModalClassQuotes m10 = new ModalClassQuotes();
                m10.setQuotes("Teaching is the greatest act of optimism.");
                quoteslist.add(m10);

                ModalClassQuotes m11 = new ModalClassQuotes();
                m11.setQuotes("Students don't care how much you know until they know how much you care.");
                quoteslist.add(m11);

                ModalClassQuotes m12 = new ModalClassQuotes();
                m12.setQuotes("It is not what is poured into the student, but what is planted, that counts.");
                quoteslist.add(m12);

                ModalClassQuotes m13 = new ModalClassQuotes();
                m13.setQuotes("Education is not the filling of a pot but the lighting of a fire.");
                quoteslist.add(m13);

                ModalClassQuotes m14 = new ModalClassQuotes();
                m14.setQuotes("The function of education is to teach one to think intensively and to think critically. Intelligence plus character—that is the goal of true education.");
                quoteslist.add(m14);

                ModalClassQuotes m15 = new ModalClassQuotes();
                m15.setQuotes("The best teachers are the ones that change their minds.");
                quoteslist.add(m15);

                ModalClassQuotes m16 = new ModalClassQuotes();
                m16.setQuotes("Teachers have three loves: love of learning, love of learners, and the love of bringing the first two loves together.");
                quoteslist.add(m16);

                ModalClassQuotes m17 = new ModalClassQuotes();
                m17.setQuotes("It is the supreme art of the teacher to awaken joy in creative expression and knowledge.");
                quoteslist.add(m17);

                ModalClassQuotes m18 = new ModalClassQuotes();
                m18.setQuotes("The best teachers are those who show you where to look but don’t tell you what to see.");
                quoteslist.add(m18);

                ModalClassQuotes m19 = new ModalClassQuotes();
                m19.setQuotes("One child, one teacher, one book, and one pen can change the world.");
                quoteslist.add(m19);

                ModalClassQuotes m20 = new ModalClassQuotes();
                m20.setQuotes("Education doesn't just make us smarter. It makes us whole.");
                quoteslist.add(m20);


            }
            else if (title.equals("Mother"))
            {
                ModalClassQuotes m1 = new ModalClassQuotes();
                m1.setQuotes("“A mother is your first friend, your best friend, your forever friend.”");
                quoteslist.add(m1);

                ModalClassQuotes m2 = new ModalClassQuotes();
                m2.setQuotes("“When you are looking at your mother, you are looking at the purest love you will ever know.”");
                quoteslist.add(m2);

                ModalClassQuotes m3 = new ModalClassQuotes();
                m3.setQuotes("“Mothers are like glue. Even when you can’t see them, they’re still holding the family together.”");
                quoteslist.add(m3);

                ModalClassQuotes m4 = new ModalClassQuotes();
                m4.setQuotes("“Mother is the name for God in the lips and hearts of little children.”");
                quoteslist.add(m4);

                ModalClassQuotes m5 = new ModalClassQuotes();
                m5.setQuotes("“The influence of a mother in the lives of her children is beyond calculation.”");
                quoteslist.add(m5);

                ModalClassQuotes m6 = new ModalClassQuotes();
                m6.setQuotes("“Motherhood is the exquisite inconvenience of being another person’s everything.”");
                quoteslist.add(m6);

                ModalClassQuotes m7 = new ModalClassQuotes();
                m7.setQuotes("“Motherhood is the biggest gamble in the world. It is the glorious life force. It’s huge and scary – it’s an act of infinite optimism.”");
                quoteslist.add(m7);

                ModalClassQuotes m8 = new ModalClassQuotes();
                m8.setQuotes("“My mother is a walking miracle.”");
                quoteslist.add(m8);

                ModalClassQuotes m9 = new ModalClassQuotes();
                m9.setQuotes("“All that I am, or ever hope to be, I owe to my angel mother.” ");
                quoteslist.add(m9);

                ModalClassQuotes m10 = new ModalClassQuotes();
                m10.setQuotes("“A mother’s love is more beautiful than any fresh flower.”");
                quoteslist.add(m10);

                ModalClassQuotes m11 = new ModalClassQuotes();
                m11.setQuotes("“In the mother’s eyes, her smile, her stroking touch, the child reads the message: ‘You are there!’”");
                quoteslist.add(m11);

                ModalClassQuotes m12 = new ModalClassQuotes();
                m12.setQuotes("“There is no way to be a perfect mother, and a million ways to be a good one.”");
                quoteslist.add(m12);

                ModalClassQuotes m13 = new ModalClassQuotes();
                m13.setQuotes("“A mother is clothed with strength and dignity, laughs without fear of the future. When she speaks her words are wise and she gives instructions with kindness.”");
                quoteslist.add(m13);

                ModalClassQuotes m14 = new ModalClassQuotes();
                m14.setQuotes("“Any mother could perform the jobs of several air-traffic controllers with ease.”");
                quoteslist.add(m14);

                ModalClassQuotes m15 = new ModalClassQuotes();
                m15.setQuotes("“God could not be everywhere, and therefore he made mothers.”");
                quoteslist.add(m15);

                ModalClassQuotes m16 = new ModalClassQuotes();
                m16.setQuotes("“When your mother asks, ‘Do you want a piece of advice?’ it’s a mere formality. It doesn’t matter if you answer yes or no. You’re going to get it anyway.”");
                quoteslist.add(m16);

                ModalClassQuotes m17 = new ModalClassQuotes();
                m17.setQuotes("“Acceptance, tolerance, bravery, compassion. These are the things my mom taught me.” ");
                quoteslist.add(m17);

                ModalClassQuotes m18 = new ModalClassQuotes();
                m18.setQuotes("“Mother love is the fuel that enables a normal human being to do the impossible.”");
                quoteslist.add(m18);

                ModalClassQuotes m19 = new ModalClassQuotes();
                m19.setQuotes("“Being a mother is learning about strengths you didn’t know you had.”");
                quoteslist.add(m19);

                ModalClassQuotes m20 = new ModalClassQuotes();
                m20.setQuotes("“No language can express the power and beauty and heroism of a mother’s love.”");
                quoteslist.add(m20);


            }
            else if (title.equals("Father"))
            {
                ModalClassQuotes m1 = new ModalClassQuotes();
                m1.setQuotes("When my father didn’t have my hand… he had my back.");
                quoteslist.add(m1);

                ModalClassQuotes m2 = new ModalClassQuotes();
                m2.setQuotes("Dads are most ordinary men turned by love into heroes, adventurers, story-tellers, and singers of song.");
                quoteslist.add(m2);

                ModalClassQuotes m3 = new ModalClassQuotes();
                m3.setQuotes("A father is the one friend upon whom we can always rely.");
                quoteslist.add(m3);

                ModalClassQuotes m4 = new ModalClassQuotes();
                m4.setQuotes("My father gave me the greatest gift anyone could give another person, he believed in me.");
                quoteslist.add(m4);

                ModalClassQuotes m5 = new ModalClassQuotes();
                m5.setQuotes("No matter how far away I roam, I’m your daughter and with you I’m home.");
                quoteslist.add(m5);

                ModalClassQuotes m6 = new ModalClassQuotes();
                m6.setQuotes("I’m so lucky to have your love and guidance in my life A father's love will always be imprinted on the heart of a son.");
                quoteslist.add(m6);

                ModalClassQuotes m7 = new ModalClassQuotes();
                m7.setQuotes("My stepdad may not have given me life, but he sure has made my life better.");
                quoteslist.add(m7);

                ModalClassQuotes m8 = new ModalClassQuotes();
                m8.setQuotes("You’re more than just a husband to my mom. You’ve been a father to me, and I’m so grateful to have you in my life.");
                quoteslist.add(m8);

                ModalClassQuotes m9 = new ModalClassQuotes();
                m9.setQuotes("Fatherhood is great because you can ruin someone from scratch.");
                quoteslist.add(m9);

                ModalClassQuotes m10 = new ModalClassQuotes();
                m10.setQuotes("Just once on Father's Day I wish my kids would give me a #1 Dad mug instead of one with my actual ranking.");
                quoteslist.add(m10);

                ModalClassQuotes m11 = new ModalClassQuotes();
                m11.setQuotes("A daughter needs her dad to be the standard against she will judge all men. In my case, it’s a pretty high standard.");
                quoteslist.add(m11);

                ModalClassQuotes m12 = new ModalClassQuotes();
                m12.setQuotes("A dad is someone you never outgrow your need for.");
                quoteslist.add(m12);

                ModalClassQuotes m13 = new ModalClassQuotes();
                m13.setQuotes("A daughter may outgrow your lap, but she’ll never outgrow your heart.");
                quoteslist.add(m13);

                ModalClassQuotes m14 = new ModalClassQuotes();
                m14.setQuotes("A daughter needs her dad to be the standard against she will judge all men. In my case, it’s a pretty high standard.");
                quoteslist.add(m14);

                ModalClassQuotes m15 = new ModalClassQuotes();
                m15.setQuotes("Dad, I know you’ve loved me as long as I’ve lived, but I’ve loved you my whole life.");
                quoteslist.add(m15);

                ModalClassQuotes m16 = new ModalClassQuotes();
                m16.setQuotes("A father’s tears and fears are unseen, his love is unexpressed, but his care and protection remains as a pillar of strength throughout our lives.");
                quoteslist.add(m16);

                ModalClassQuotes m17 = new ModalClassQuotes();
                m17.setQuotes("My father didn’t tell me how to live. He lived and let me watch him do it.");
                quoteslist.add(m17);

                ModalClassQuotes m18 = new ModalClassQuotes();
                m18.setQuotes("A father is the one friend upon whom we can always rely.");
                quoteslist.add(m18);

                ModalClassQuotes m19 = new ModalClassQuotes();
                m19.setQuotes("Dads are most ordinary men turned by love into heroes, adventurers, story-tellers, and singers of song.");
                quoteslist.add(m19);

                ModalClassQuotes m20 = new ModalClassQuotes();
                m20.setQuotes("No matter how far away I roam, I’m your daughter and with you I’m home.");
                quoteslist.add(m20);


            }
            else if (title.equals("Broken"))
            {
                ModalClassQuotes m1 = new ModalClassQuotes();
                m1.setQuotes("Sometimes good things fall apart so better things can fall together.");
                quoteslist.add(m1);

                ModalClassQuotes m2 = new ModalClassQuotes();
                m2.setQuotes("When you are in love, and you get hurt, it's like a cut — it will heal, but there will always be a scar.");
                quoteslist.add(m2);

                ModalClassQuotes m3 = new ModalClassQuotes();
                m3.setQuotes("Every time your heart is broken, a doorway cracks open to a world full of new beginnings, new opportunities.  ");
                quoteslist.add(m3);

                ModalClassQuotes m4 = new ModalClassQuotes();
                m4.setQuotes("I think you are wrong to want a heart. It makes most people unhappy. If you only knew it, you are in luck not to have a heart.");
                quoteslist.add(m4);

                ModalClassQuotes m5 = new ModalClassQuotes();
                m5.setQuotes("Perhaps someday I'll crawl back home, beaten, defeated. But not as long as I can make stories out of my heartbreak, beauty out of sorrow.");
                quoteslist.add(m5);

                ModalClassQuotes m6 = new ModalClassQuotes();
                m6.setQuotes("You can’t buy love, but you can pay heavily for it.");
                quoteslist.add(m6);

                ModalClassQuotes m7 = new ModalClassQuotes();
                m7.setQuotes("There is something bleak and barren about a world that is missing the person who knows you best.");
                quoteslist.add(m7);

                ModalClassQuotes m8 = new ModalClassQuotes();
                m8.setQuotes("Unable are the loved to die. For love is immortality.");
                quoteslist.add(m8);

                ModalClassQuotes m9 = new ModalClassQuotes();
                m9.setQuotes("I wish I were a little girl again because skinned knees are easier to fix than a broken heart.");
                quoteslist.add(m9);

                ModalClassQuotes m10 = new ModalClassQuotes();
                m10.setQuotes("It is strange how often a heart must be broken. Before the years can make it wise.");
                quoteslist.add(m10);

                ModalClassQuotes m11 = new ModalClassQuotes();
                m11.setQuotes("Back then, in those first days, I was so alone that every day was like eating my own heart.");
                quoteslist.add(m11);

                ModalClassQuotes m12 = new ModalClassQuotes();
                m12.setQuotes("I don't think anyone can give you advice when you've got a broken heart.");
                quoteslist.add(m12);

                ModalClassQuotes m13 = new ModalClassQuotes();
                m13.setQuotes("Love hurts worse than getting slammed by a 250-pound linebacker.");
                quoteslist.add(m13);

                ModalClassQuotes m14 = new ModalClassQuotes();
                m14.setQuotes("The greatest tragedy of life is not that men perish, but that they cease to love.");
                quoteslist.add(m14);

                ModalClassQuotes m15 = new ModalClassQuotes();
                m15.setQuotes("Have you ever been in love? Horrible isn’t it? It makes you so vulnerable. It opens your chest and it opens up your heart and it means that someone can get inside you and mess you up.");
                quoteslist.add(m15);

                ModalClassQuotes m16 = new ModalClassQuotes();
                m16.setQuotes("Un-break my heart. Say you'll love me again. Undo this hurt you caused when you walked out the door and walked out of my life.");
                quoteslist.add(m16);

                ModalClassQuotes m17 = new ModalClassQuotes();
                m17.setQuotes(" “Trust is the glue of life. It’s the most essential ingredient in effective communication. It’s the foundational principle that holds all relationships.” ");
                quoteslist.add(m17);

                ModalClassQuotes m18 = new ModalClassQuotes();
                m18.setQuotes(" “You may be deceived if you trust too much, but you will live in torment unless you trust enough.”");
                quoteslist.add(m18);

                ModalClassQuotes m19 = new ModalClassQuotes();
                m19.setQuotes("“Trust is something that is difficult to establish. It is very fragile that needs to be taken care of. Once trust breaks or shatters into pieces, it is very difficult to rebuild it.”");
                quoteslist.add(m19);

                ModalClassQuotes m20 = new ModalClassQuotes();
                m20.setQuotes("“Being trustworthy requires: Doing the right thing. And doing things right.”");
                quoteslist.add(m20);


            }
            else if (title.equals("Flower"))
            {
                ModalClassQuotes m1 = new ModalClassQuotes();
                m1.setQuotes("Happiness held is the seed; Happiness shared is the flower.");
                quoteslist.add(m1);

                ModalClassQuotes m2 = new ModalClassQuotes();
                m2.setQuotes("Love is the flower you’ve got to let grow.");
                quoteslist.add(m2);

                ModalClassQuotes m3 = new ModalClassQuotes();
                m3.setQuotes("If you look the right way, you can see that the whole world is a garden.");
                quoteslist.add(m3);

                ModalClassQuotes m4 = new ModalClassQuotes();
                m4.setQuotes("Take time to smell the roses.");
                quoteslist.add(m4);

                ModalClassQuotes m5 = new ModalClassQuotes();
                m5.setQuotes("Love is like wildflowers; it’s often found in the most unlikely places.");
                quoteslist.add(m5);

                ModalClassQuotes m6 = new ModalClassQuotes();
                m6.setQuotes("A flower cannot blossom without sunshine, and a man cannot live without love.");
                quoteslist.add(m6);

                ModalClassQuotes m7 = new ModalClassQuotes();
                m7.setQuotes("What a lonely place it would be to have a world without a wildflower!");
                quoteslist.add(m7);

                ModalClassQuotes m8 = new ModalClassQuotes();
                m8.setQuotes("Flowers are a proud assertion that a ray of beauty out values all the utilities in the world.");
                quoteslist.add(m8);

                ModalClassQuotes m9 = new ModalClassQuotes();
                m9.setQuotes("The very best relationship has a gardener and a flower. The gardener nurtures and the flower blooms.");
                quoteslist.add(m9);

                ModalClassQuotes m10 = new ModalClassQuotes();
                m10.setQuotes("The smallest flower is a thought, a life answering to some feature of the Great Whole, of whom they have a persistent intuition.");
                quoteslist.add(m10);

                ModalClassQuotes m11 = new ModalClassQuotes();
                m11.setQuotes("A flower’s appeal is in its contradictions — so delicate in form yet strong in fragrance, so small in size yet big in beauty, so short in life yet long on effect.");
                quoteslist.add(m11);

                ModalClassQuotes m12 = new ModalClassQuotes();
                m12.setQuotes("Flowers don’t tell, they show.");
                quoteslist.add(m12);

                ModalClassQuotes m13 = new ModalClassQuotes();
                m13.setQuotes("Flowers whisper ‘Beauty!’ to the world, even as they fade, wilt, fall.");
                quoteslist.add(m13);

                ModalClassQuotes m14 = new ModalClassQuotes();
                m14.setQuotes("You’re only here for a short visit. Don’t hurry, don’t worry. And be sure to smell the flowers along the way.");
                quoteslist.add(m14);

                ModalClassQuotes m15 = new ModalClassQuotes();
                m15.setQuotes("If we could see the miracle of a single flower clearly our whole life would change.");
                quoteslist.add(m15);

                ModalClassQuotes m16 = new ModalClassQuotes();
                m16.setQuotes("My love for you blossoms every day.");
                quoteslist.add(m16);

                ModalClassQuotes m17 = new ModalClassQuotes();
                m17.setQuotes("If I had a single flower for every time I think about you, I could walk forever in my garden.");
                quoteslist.add(m17);

                ModalClassQuotes m18 = new ModalClassQuotes();
                m18.setQuotes("All the flowers of the tomorrows are in the seeds of today.");
                quoteslist.add(m18);

                ModalClassQuotes m19 = new ModalClassQuotes();
                m19.setQuotes("Mama was my greatest teacher, a teacher of compassion, love and fearlessness. If love is sweet as a flower, then my mother is that sweet flower of love.");
                quoteslist.add(m19);

                ModalClassQuotes m20 = new ModalClassQuotes();
                m20.setQuotes("She sprouted love like flowers, grew a garden in her mind, and even on the darkest days, from her smile the sun still shined.");
                quoteslist.add(m20);


            }
            else if (title.equals("Dream"))
            {
                ModalClassQuotes m1 = new ModalClassQuotes();
                m1.setQuotes("Let your actions be louder than your words and your dreams bigger than your fears.");
                quoteslist.add(m1);

                ModalClassQuotes m2 = new ModalClassQuotes();
                m2.setQuotes("“Dream big, it’s the first step to success, making goals come second.”");
                quoteslist.add(m2);

                ModalClassQuotes m3 = new ModalClassQuotes();
                m3.setQuotes("Always dare to dream. For as long as there’s a dream, there is hope, and as long as there is hope, there is joy in living.");
                quoteslist.add(m3);

                ModalClassQuotes m4 = new ModalClassQuotes();
                m4.setQuotes("“Dare to dream big, living without dreams is like body without soul”");
                quoteslist.add(m4);

                ModalClassQuotes m5 = new ModalClassQuotes();
                m5.setQuotes("Today’s realities are yesterday’s dreams come true.");
                quoteslist.add(m5);

                ModalClassQuotes m6 = new ModalClassQuotes();
                m6.setQuotes("Doing what you believe in, and going after your dreams will only result in success.");
                quoteslist.add(m6);

                ModalClassQuotes m7 = new ModalClassQuotes();
                m7.setQuotes("All our dreams can come true if we have the courage to pursue them.");
                quoteslist.add(m7);

                ModalClassQuotes m8 = new ModalClassQuotes();
                m8.setQuotes("Be brave, fight for what you believe in and make your dreams a reality.");
                quoteslist.add(m8);

                ModalClassQuotes m9 = new ModalClassQuotes();
                m9.setQuotes("Dreams are extremely important. You can’t do it unless you imagine it.");
                quoteslist.add(m9);

                ModalClassQuotes m10 = new ModalClassQuotes();
                m10.setQuotes("Miracles start to happen when you give as much energy to your dreams as you do to your fears.");
                quoteslist.add(m10);

                ModalClassQuotes m11 = new ModalClassQuotes();
                m11.setQuotes("“Dreams are today’s answers to tomorrow’s questions.”");
                quoteslist.add(m11);

                ModalClassQuotes m12 = new ModalClassQuotes();
                m12.setQuotes("The only thing that stands between you and your dream is the will to try and the belief that it is actually possible.");
                quoteslist.add(m12);

                ModalClassQuotes m13 = new ModalClassQuotes();
                m13.setQuotes("“A dream doesn’t become reality through magic; it takes sweat, determination, and hard work.”");
                quoteslist.add(m13);

                ModalClassQuotes m14 = new ModalClassQuotes();
                m14.setQuotes("“The only courage anybody ever needs is the courage to follow your own dreams.”");
                quoteslist.add(m14);

                ModalClassQuotes m15 = new ModalClassQuotes();
                m15.setQuotes("Dream and give yourself permission to envision a YOU that you choose to be.");
                quoteslist.add(m15);

                ModalClassQuotes m16 = new ModalClassQuotes();
                m16.setQuotes("If you don’t dream, you won’t die, but even you won’t be alive without them.");
                quoteslist.add(m16);

                ModalClassQuotes m17 = new ModalClassQuotes();
                m17.setQuotes("The future belongs to those who believe in the beauty of their dreams.");
                quoteslist.add(m17);

                ModalClassQuotes m18 = new ModalClassQuotes();
                m18.setQuotes("Go confidently in the direction of your dreams and live the life you have imagined.");
                quoteslist.add(m18);

                ModalClassQuotes m19 = new ModalClassQuotes();
                m19.setQuotes("Every great dream begins with a dreamer. Always remember, you have within you the strength, the patience, and the passion to reach for the stars to change the world.");
                quoteslist.add(m19);

                ModalClassQuotes m20 = new ModalClassQuotes();
                m20.setQuotes("Yesterday is but today’s memory, and tomorrow is today’s dream.");
                quoteslist.add(m20);


            }
            else if (title.equals("Music"))
            {
                ModalClassQuotes m1 = new ModalClassQuotes();
                m1.setQuotes("“Where words fail, music speaks.”");
                quoteslist.add(m1);

                ModalClassQuotes m2 = new ModalClassQuotes();
                m2.setQuotes("Music is the language of the spirit. It opens the secret of life bringing peace, abolishing strife.");
                quoteslist.add(m2);

                ModalClassQuotes m3 = new ModalClassQuotes();
                m3.setQuotes("Music, once admitted to the soul, becomes a sort of spirit, and never dies.");
                quoteslist.add(m3);

                ModalClassQuotes m4 = new ModalClassQuotes();
                m4.setQuotes("Music touches us emotionally, where words alone can't.");
                quoteslist.add(m4);

                ModalClassQuotes m5 = new ModalClassQuotes();
                m5.setQuotes("Music produces a kind of pleasure which human nature cannot do without.");
                quoteslist.add(m5);

                ModalClassQuotes m6 = new ModalClassQuotes();
                m6.setQuotes("Music is the universal language of mankind.");
                quoteslist.add(m6);

                ModalClassQuotes m7 = new ModalClassQuotes();
                m7.setQuotes("Music is an agreeable harmony for the honor of God and the permissible delights of the soul.");
                quoteslist.add(m7);

                ModalClassQuotes m8 = new ModalClassQuotes();
                m8.setQuotes("There are not more than five musical notes, yet the combinations of these five give rise to more melodies than can ever be heard.");
                quoteslist.add(m8);

                ModalClassQuotes m9 = new ModalClassQuotes();
                m9.setQuotes("Music is the strongest form of magic.");
                quoteslist.add(m9);

                ModalClassQuotes m10 = new ModalClassQuotes();
                m10.setQuotes("The best music is essentially there to provide you something to face the world with.");
                quoteslist.add(m10);

                ModalClassQuotes m11 = new ModalClassQuotes();
                m11.setQuotes("I've found that no matter what life throws at me, music softens the blow.");
                quoteslist.add(m11);

                ModalClassQuotes m12 = new ModalClassQuotes();
                m12.setQuotes("Music is the wine that fills the cup of silence.");
                quoteslist.add(m12);

                ModalClassQuotes m13 = new ModalClassQuotes();
                m13.setQuotes("“Love is friendship set to music.”");
                quoteslist.add(m13);

                ModalClassQuotes m14 = new ModalClassQuotes();
                m14.setQuotes("“Music is an outburst of the soul.”");
                quoteslist.add(m14);

                ModalClassQuotes m15 = new ModalClassQuotes();
                m15.setQuotes("“Music is life itself.”");
                quoteslist.add(m15);

                ModalClassQuotes m16 = new ModalClassQuotes();
                m16.setQuotes("Music is the moonlight in the gloomy night of life.");
                quoteslist.add(m16);

                ModalClassQuotes m17 = new ModalClassQuotes();
                m17.setQuotes("I’ve always thought people would find a lot more pleasure in their routines if they burst into song at significant moments.");
                quoteslist.add(m17);

                ModalClassQuotes m18 = new ModalClassQuotes();
                m18.setQuotes("Music is your own experience, your thoughts, your wisdom. If you don’t live it, it won’t come out of your horn.");
                quoteslist.add(m18);

                ModalClassQuotes m19 = new ModalClassQuotes();
                m19.setQuotes("Music is love in search of a word.");
                quoteslist.add(m19);

                ModalClassQuotes m20 = new ModalClassQuotes();
                m20.setQuotes("Music… can name the unnameable and communicate the unknowable.");
                quoteslist.add(m20);


            }


        }


        LinearLayoutManager manager = new LinearLayoutManager(QuotesActivity.this,LinearLayoutManager.VERTICAL,false);
        recyclerview1.setLayoutManager(manager);

         QuotesAdapter adapter = new QuotesAdapter(QuotesActivity.this,quoteslist);
         recyclerview1.setAdapter(adapter);

    }
}