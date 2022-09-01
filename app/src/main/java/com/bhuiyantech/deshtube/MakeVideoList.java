
package com.bhuiyantech.deshtube;

import java.util.ArrayList;
import java.util.HashMap;

public class MakeVideoList {

	public static ArrayList< ArrayList<HashMap<String,String>> > rootArrayList;
	public static ArrayList< HashMap<String, String> > catArrayList;
	public static ArrayList< HashMap<String, String> > videoArrayList;
	public static HashMap<String, String> hashMap;


	//--------------------------------------------------------------------------------------------
	//===============================Some automation by Juba
	public static void addVideoItem(String video_id, String title, String desciption){
		hashMap = new HashMap<>();
		hashMap.put("vdo_id", video_id);
		hashMap.put("vdo_title", title);
		hashMap.put("vdo_desciption", desciption);
		videoArrayList.add(hashMap);
	}
	//========================================================================
	//===============================Some automation by Juba
	public static void createPlayList(String category_name, Integer drawable){
		rootArrayList.add(videoArrayList);
		hashMap = new HashMap<>();
		hashMap.put("category_name", category_name);
		hashMap.put("img", String.valueOf(drawable));
		catArrayList.add(hashMap);
		videoArrayList = new ArrayList<>();
	}
	//========================================================================





	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//----------------------------------------------------
	public static void createMyAlbums(){

		rootArrayList = new ArrayList();
		catArrayList = new ArrayList<>();
		videoArrayList = new ArrayList<>();


		//===============Salman Sha All Movie Song Albam======================================
		addVideoItem("DP1zdi8Ia7s", "Tumi Mor Jiboner Vabona| তুমি মোর জীবনের ভাবনা|", "Singer: Andrew Kishore & Kanak Chapa");
		addVideoItem("YMfLQUQ2EWo", "Tomake Chai Shudhu| তোমাকে চাই শুধু l", "Singer: Andrew Kishore & Kanak Chapa");
		addVideoItem("_MtlE_kpRZY", "Bhalo Achi Bhalo Theko | ভালো আছি ভালো থেকো ", "Singer: Andrew Kishore & Kanak Chapa");
		addVideoItem("0fBVvpS4CVg", "Chithi Elo Jelkhanate | চিঠি এলো জেলখানাতে | ", "Shalman Shah | Sotter Mrittu Nei ");
		addVideoItem("zIyHFbK-qL4", "O Sathire jeona | ও সাথীরে যেওনা | ", "Singer: Sabina Yasmin & Andrew Kishore");
		addVideoItem("FfWqDcGmOLA", "Sathi Tumi Amar Jibone | সাথী তুমি আমার জীবনে |", "Singer: Khalid Hassan Milu & Kanak Chapa");
		addVideoItem("9RDYlosUmEU", "Prithibite Sukh Bole | পৃথিবীতে সুখ বলে |", "Singer: Sabina Yasmin & Agun");
		addVideoItem("DgJy2dG8sQY", "Tumi Amar Moner | তুমি আমার মনের মানুষ | ", "Singer: Sabina Yasmin & Rafiqul Alam");
		addVideoItem("KQetfNW4prk", "Ami Je Tomar | Salman Shah | ", "Singer: Khaled Hasan Milu & Kanak Chapa");
		addVideoItem("8kB-4ff4zWk", "Nishidin Protidin | Salman Shah | Shabnur| ", "Singer: Runa Laila");
		addVideoItem("SetbJhXSaYc", "E Jibone Jarey Cheyechi | এ জীবনে যারে চেয়েছি | ", "Singer: Sabina Yasmin & Andrew Kishore");
		addVideoItem("4lHK8bagiTg", "Tumi Amar Emoni ekjon | Salman Shah |", "Singer: Kanak Chapa");
		addVideoItem("6E4lRR-I6WA", "Ekhane Dujone Nirjone | Salman Shah | ", "Singer: Runa Laila & Andrew Kishore ");
		addVideoItem("FcSDcCgzvy8", "O Amar Bondhu Go | Salman Shah, Moushumi |  ", "Singer: Agun & Runa Laila");
		addVideoItem("E8RVKqQGzLA", "Amar Nakeri l Salman Shah ", "Singer: Kanak cahapa & Andrew Kishore");
		addVideoItem("LpNCI1tvims", "Bajare Jachai Kore l Salman Shah l  ", "Singer: Kanak Chapa");
		addVideoItem("HsQ7FyJpLPw", "Tumi Amay Korte Shukhi l Salman Shah", "Singer: Anuradha Padowal & Amit Kumar");
		addVideoItem("Oes9WMc88C8", "Uttore Voyongkor Jongol | ", "Singer: Salma Jahan ");
		addVideoItem("aEhzHsnAknQ", "Bristi Re Bristi Ayna Jore | Salman Shah  ", "Singer :Sabina Yasmin & Agun");
		addVideoItem("c4hho8IkWF4", "Oi Bashir Shure | Salman Shah | Shabnur| ", "Singer: Runa Laila");
		addVideoItem("Fdceg-BswVY", "Eaidin Seidin Kono Din | Sabina Yasmin | Andrew Kishor  ", "Salman Shah Song");
		addVideoItem("bxnTNwF-ATo", "Ontore Ontore Song | Salman Shah And Moushomi ", "Movie Name: Ontore Ontore");
		addVideoItem("lT8S_Bb6u_M", "Bhalobashia Gelam Fasia | ভালোবাসিয়া গেলাম ফাঁসিয়া |  ", "Salman Shah & Moushumi | Antore Antore");
		addVideoItem("MY3UMM7sljk", "Ai Chokh Ai Buk Chere Song ", "Salman Shah & Shabnur | Jibon Songsar");
		addVideoItem("yep2h-zWarg", "Amader Choto Nodi | আমাদের ছোট নদী | ", "Salman Shah & Roji Afsari |");
		addVideoItem("KlyxkwXVnnU", "Pathore Likhini Khuye Jabe Song", "Salman Shah & Shabnur");
		addVideoItem("vInW7FmhCZ4", "Amar Jonmo Tomar Jonno Song", "Salman Shah & Shabnur ");
		addVideoItem("fKGVsrigb_U", "Noyoner Kache Theko | নয়নের কাছে থেকো |", "Salman Shah & Shahnaz | Sotter Mrittu Nei");
		addVideoItem("2lKFgz2ynqU", "Sukher Arek Nam | Salman Shah | Shahnaz ", "Sotter Mrittu Nei Movie ");
		addVideoItem("8iFGdGI3LLM", "Ei Poth Amar Thikana | এই পথ আমার ঠিকানা | ", " Salman Shah | Agun | Sotter Mrittu Nei");
		addVideoItem("4gbe9NQXgh8", "Neel Sagor Par Hoye | নীল সাগর পার হয়ে", " Salman Shah & Sonia | Shopner Thikana");
		addVideoItem("0qj8G21diPI", "Jato Din Beche Acho  Song", "Salman Shah | Shahnaz | Sotter Mrittu Nei Movie ");
		addVideoItem("fnUzeXbBLRk", "Bondhu Tumi Amar Song ", "Salman Shah & Shabnur | Bikkhov");
		addVideoItem("tcFiwAd_R4g", "Biddaloy Moder Biddaloy Song", "Salman Shah, Shabnur & Others | Bikkhov");
		addVideoItem("qqPzhJdJkyE", "O Amar Jibon Shathi | ও আমার জীবন সাথী", " Salman Shah & Shabnur | Runa Laila | Bikkhov ");
		addVideoItem("kllSYwoVLik", "Tomake Ami Jeno | তোমাকে আমি যেন |", "Salman Shah & Shabnur | Shakila zafar & Agun | Bikkhov");
		addVideoItem("hojaivWsZ-c", "71 Er Maa Jononi | ৭১ এর মা জননী |", " Salman Shah, Shabnur & Others | Runa Laila & Agun | Bikkhov");
		addVideoItem("0JwnqlhnG6E", "Mon Mane Na | মন মানে না | ", " Salman Shah & Shilpi | Priyojon ");
		addVideoItem("tCwUr5hrV6Q", "O Sathire | ও সাথীরে | Salman Shah, Riaz & Shilpi ", " Salman Shah, Riaz & Shilpi | Duet Version | Priyojon");
		addVideoItem("W-hY1pW_V_o", "Ektu khani Sono Na (একটু খানি শোনো না)  ", " Salman Shah & Bristy | Ei Ghor Ei Songsar  ");
		addVideoItem("gsF8QIbhd2c", "Sob Sokhire Par Korite | সব সখিরে পার করিতে", " Salman Shah | Shabnur | Andrew kishor | Sabina Yeasmin ");
		addVideoItem("ZnFNMlbFtw8", "Aare Kothai Bole Gachhe Bel  ", " Salman Shah | Shabnur || by Agun | Sujon Sokhi ");
		addVideoItem("5sbsXnkWmng", "Amar E Gaan Hobena | আমার এ গান হবে না |", "Salman Shah | Shabnur | Sabina Yasmin | Prem Piyashi");
		addVideoItem("lNWNpT2QmEM", "Ki Je Tumi Chao | কি যে তুমি চাও  ", " Salman Shah | Shabnur | Sabina Yasmin | Prem Piyashi");
		addVideoItem("WS8GtcCEGGg", "Ek Jibone Amar Mitbe Na | এক জীবনে আমার মিটবে না  ", "  Salman Shah | Shabnur | Runa Laila | Agun ");
		addVideoItem("DFLdt29j-vg", "Tumi Jodi Sukh Pao ", " Salman Shah || Shabnur || Sabina Yasmin || Prem Piyashi | Agniveena");
		addVideoItem("p6bJJ7HkHlY", "Shudhu Ekbar | শুধু একবার বলো ভালোবাসি | ", " Salman Shah & Moushumi | Sabina & Milu | Denmohor ");
		addVideoItem("jCjGuXvhNZs", "Mousum Elo Bhalobashar | মৌসুম এলো ভালবাসার  ", "Salman Shah & Moushumi | Runa Laila | Denmohor");
		addVideoItem("IXVYPlbQOn8", "Akdin Dui Din Tin Din Por", "  Salman Shah , Shabnur | Salma Jahan & MA Khalek | Moha Milon");
		addVideoItem("KHI6UBKe9Qc", "পিঁপড়া খাবে বড় লোকের ধন | Pipra Khabe Boro Loker Dhon ", " Salman Shah,Humayun Faridi | Mayer Odhikar");
		addVideoItem("PCCI1Da5B8M", "তুমি একটা চোর | Tumi Ekta Chor | Salman Shah ", "Shabnaz | Runa Laila | Andrew Kishor | Mayer Odhikar");
		addVideoItem("cIdcvpFvEug", "Meye To Noy Re Pagli | মেয়ে তো নয় রে পাগলী ", "Salman Shah | Shabnaz | Agun,Runa Laila | Mayer Odhikar");
		addVideoItem("xFwwIbVau_8", "Ogo Mor Priya jene rakho tumi  ", " Salman Shah & Lima | Agun & Kanak Chapa | Prem Juddha");
		addVideoItem("lN37Rp3BQdA", "Rimjhim Rimjhim Borsha Elo Song ", "Salman Shah & Lima | Runa & Andrew | Konnadan");
		addVideoItem("L6kWL0qF57o", "Prem Priti Ar Valobasa ", "  Salman Shah & Shabnaz | Asha Bhalobasha ");
		addVideoItem("0JwnqlhnG6E", "Mon Mane Na | মন মানে না | ", " Salman Shah & Shilpi | Priyojon ");
		createPlayList("Salman Shah", R.drawable.vedio_icon);
		//=========Salman Shah All movie Song Albam End==========================================================================
		//=======================================================================================================================
		//=====================================================================================================================


		//==========================================================================


		//===========================Shabnur all Song Album===============================================
		//==============================================================================================
		//==============================================================================================
		addVideoItem("Dgskb8NLkL4", "Assalamalaikum Biyain Shab | আসসালামালাইকুম বিয়ান সাব ", "Ferdous & Shabnur | Premer Jala ");
		addVideoItem("30S9NuNXqG8", "Protidin Tomake Ami Chai", "Shabnur, Shakil Khan & Bapparaj | Amar Ontore Tumi");
		addVideoItem("WvCDcBqckrM", "Bodhu Beshe konna jokhon elo re", "Shabnur & Riaz | Momtaz & Rathindronath Roy | Hridoyer Bondhon");
		addVideoItem("Y-6ojEsTFow", "Nisshas Dhire Dhire ", "Riaz & Shabnur | Alka & Amit | Prithibi Tomar Amar");
		addVideoItem("fW1dwvF5qKo", "Tumi Mor Jiboner | তুমি মোর জীবনের  ", "Salman Shah & Shabnur | Andrew & Salma | Anondo Osru ");
		addVideoItem("_MtlE_kpRZY", "Bhalo Achi Bhalo Theko | ভালো আছি ভালো থেকো ", "Salman Shah & Shabnur | Tomake Chai  ");
		addVideoItem("YMfLQUQ2EWo", "Tomake Chai | তোমাকে চাই শুধু l ", "Andrew & Kanak | Tomake Chai | Anupam ");
		addVideoItem("zIyHFbK-qL4", "O Sathire | ও সাথীরে যেওনা ", "Salman Shah & Shabnur | Shopner Thikana ");
		addVideoItem("FfWqDcGmOLA", "Sathi Tumi Amar Jibone | সাথী তুমি আমার জীবনে  ", " Salman Shah & Shabnur | Chawa Theke Pawa ");
		addVideoItem("9RDYlosUmEU", "Prithibite Sukh Bole | পৃথিবীতে সুখ বলে  ", "Salman Shah & Shabnur | Jibon Songsar ");
		addVideoItem("DgJy2dG8sQY", "Tumi Amar Moner | তুমি আমার মনের মানুষ  ", "Salman Shah & Shabnur | Shopner Prithibi ");
		addVideoItem("8kB-4ff4zWk", "Nishidin Protidin | Salman Shah | Shabnur ", " Salman Shah | Shabnur | Runa Laila | Shopner Nayok ");
		addVideoItem("hlIlOsW15V0", "এ জীবনে যারে চেয়েছি | E Jibone Jare Cheyechi ", "Salman Shah | Shilpi | Priyojon");
		addVideoItem("Oes9WMc88C8", "Uttore Voyongkor Jongol ", "Shabnur | Salma Jahan | Anondo Osru  ");
		addVideoItem("uQVNJ8O7xmc", "Tumi Hajar Phooler | তুমি হাজার ফুলের মাঝে", " Riaz & Shabnur | Andrew & Kanak | Mon Mane Na ");
		addVideoItem("-jr-QTSe_tQ", "Tomake Chere Ami | তোমাকে ছেড়ে আমি ", " Riaz & Shabnur | Kanak Chapa | Mon Mane Na");
		addVideoItem("Gb56ptLiIV8", "Ei Modhu Josonay, ei Mon Tumai chai ", "Shabnur & Riaz | Andrew & Kanak | Kajer Meye ");
		addVideoItem("9jBr8mcx_uE", "Lakho Jonom Tomake | লাখো জনম তোমাকে | ", " Shabnur & Riaz | Milu & Kanak Chapa | Bhalobasi Tomake");
		addVideoItem("clkIoVkO-Lk", "Tumi Khub Shadharon Ekti Meye ", "Ferdous | Shabnur | Riaz | Dui Noyoner Alo ");
		addVideoItem("QRkbe73A5lU", "Buk Bhora | বুক ভরা ভালোবাসা ", "Shabnur & Riaz | Kumar Shanu & Anuradha | Buk Bhora Bhalobasha");
		addVideoItem("Kv4XqfnluBM", " Ekdin Tomake | একদিন তোমাকে", "Shabnur & Riaz | Andrew & Kanak | Kajer Meye  ");
		addVideoItem("Gb56ptLiIV8", "Ei Modhu Josonay ", "Shabnur & Riaz | Andrew & Kanak | Kajer Meye ");
		addVideoItem("Dgskb8NLkL4", "Assalamalaikum Biyain Shab | আসসালামালাইকুম বিয়ান সাব ", "Ferdous & Shabnur | Premer Jala ");
		addVideoItem("meIldl1Z7xY", "Noyon Khuje Peyeche | নয়ন খুঁজে পেয়েছে মনি  ", "Shabnur & Riaz | Andrew & Kanak | Mon ");
		addVideoItem("raULkMD_Yjk", "Onek Shadhonar Pore | অনেক সাধনার পরে  ", " Shabnur & Riaz | Milu & Kanak Chapa | Bhalobasi Tomake ");
		addVideoItem("meIldl1Z7xY", "Noyon Khuje Peyeche | নয়ন খুঁজে পেয়েছে মনি ", "Shabnur & Riaz | Andrew & Kanak | Mon | Anupam ");
		addVideoItem("a6a2f82KXR0", " Thako Jodi Kachakachi | থাকো যদি কাছাকাছি", " Shabnur & Riaz | Andrew & Kanak | Bostir Meye | Anupam ");
		addVideoItem("UzN-YB0r_Qo", " Tumi Kichu Diona | তুমি কিছু দিওনা | Shabnur & Riaz", "Shabnur & Riaz | Andrew & Kanak | Bhalobasa Bhalobasa ");
		addVideoItem("BEuOJjaXFBo", " Boro Kosto Valobashay | Riaz | Shabnur |", "Riaz | Shabnur | Bapparaj | Valobasha Kare Koy ");
		addVideoItem("26svxtZKjfY", "Tumi Acho Mone | তুমি আছো মনে ", "Shabnur, Riaz & Dipjol | Gundar Prem ");
		addVideoItem("QjPP_R1n3qc", "Tumi Bolona | তুমি বলোনা | HD | RIaz & Shabnur ", "RIaz & Shabnur | Andrew & Kanak Chapa | Matir Phool | Anupam ");
		addVideoItem("9jBr8mcx_uE", "Lakho Jonom Tomake | লাখো জনম তোমাকে | Shabnur & Riaz  ", "Shabnur & Riaz | Milu & Kanak Chapa | Bhalobasi Tomake ");
		addVideoItem("Z7OvAIAUsyg", "Premo Ronge | প্রেমও রঙে | Shabnur & Riaz  ", "Shabnur & Riaz | Kanak Chapa & Monir Khan | Bhalobasa Bhalobasa ");
		addVideoItem("hJgQkdp8Mi0", "Amar Moneri Angone | আমার মনেরই অঙ্গনে  ", "Shabnur & Riaz | Runa & Andrew | Bostir Meye | Anupam ");
		addVideoItem("c4aeqXEcF_k", "Mon Mane Nare | মন মানে নারে | Shabnur & Riaz ", " Andrew & Doly | O Priya Tumi Kothay | Anupam ");
		addVideoItem("Rtu8-gIQQQI", "Ekta Jibon | একটা জীবন একটাই মন ", " Riaz & Shabnur | Shopner Basor ");
		addVideoItem("FQ8eYqC1lnE", "Ei Chokh Bole Mon Bole | Riaz | Shabnur  ", "Riaz | Shabnur | Nishase Tumi Biswase Tumi | Bangla Movie Song ");
		addVideoItem("LjArxfkPQiQ", "Baulare Baulare | বাউলারে বাউলারে ", "Riaz & Ravina | Andrew & Kanak | Sabdhan  ");
		addVideoItem("X1F0W9FHJfQ", "Tomay Goreche Bidhata | তোমায় গড়েছে বিধাতা ", "Riaz & Ravina | Andrew & Kanak | Sabdhan ");
		addVideoItem("MbEzFcDb-qQ", "Tumi Shukhe Theko | তুমি সুখে থেকো | ", "Shabnur, Riaz & Dipjol | Andrew Kishore | Gundar Prem ");
		addVideoItem("5vde-eC_ypc", " Tomake Peye Ami | তোমাকে পেয়ে আমি |", "Shabnur & Riaz | Andrew & Kanak | O Priya Tumi Kothay ");
		addVideoItem("iW5C9y6LYFQ", " Tumi Chara Kichu | তুমি ছাড়া কিছু |", "Shabnur & Riaz | Andrew & Kanak | Ami Tomari | Anupam ");
		addVideoItem("O2dM3Sv_Kpg", "Ke Tumi Janina | কে তুমি জানিনা |  ", "Shabnur & Riaz | Kanak Chapa & Agun | Karisma ");
		addVideoItem("wdd0bBj1pVY", " Ar Jeno Vul Na Hoy | Riaz | Shabnur", "| Riaz | Shabnur | Valobasha Kare Koy | Bangla Movie Song ");
		addVideoItem("ik7RszrxsBU", "Sona Dana Dami Gohona | সোনা দানা দামী গহনা  ", " Alamara Minu | Riaz & Shabnur | Matir Phool ");
		addVideoItem("GkuE4XZ7Tt0", "Premhin E Jibon | প্রেমহীন এ জীবন | Shabnur & Riaz ", "Shabnur & Riaz | Andrew & Kanak | Bhalobasi Tomake ");
		addVideoItem("3tR9WgBozr4", "Na Na Korbona | না না করবোনা প্রেম ", "Shabnur & Riaz | Kanak Chapa & Asif | Hridoyer Bondhon ");
		addVideoItem("KKbfk28w2go", "Ekta Second Lagenare | একটা সেকেন্ড লাগেনারে ", " Shabnur & Riaz | Andrew & Kanak | Gundar Prem ");
		addVideoItem("8tOOCVIKDoM", "Sagorer Dhew Bole | সাগরের ঢেউ বলে ", " Shabnur, Riaz & Bapparaj | Buk Bhora Bhalobasha ");
		addVideoItem("eEKMIMmxXZA", "Amar premer tajmohol ", "Riaz& shabnur Premer Tajmohol movie song");
		addVideoItem("T7iKDHj4INo", "Emon Ekta Din Nai | এমন একটা দিন নাই  ", "Shabnur & Shakil Khan | Bolo Na Bhalobasi");
		addVideoItem("jS2nMngFxHE", "Jeona Jeona Bondhu | যেওনা যেওনা বন্ধু ", "Shabnur & Amit Hassan | Runa & Andrew | Bhulona Amay ");
		addVideoItem("bRV8QKGHCwY", "bRV8QKGHCwY ", "Shabnur & Omar Sani | Agun & Rizia Parvin | Modhur Milon ");
		addVideoItem("bRV8QKGHCwY", "Premer Khela Hok | প্রেমের খেলা হোক শুরু ", " Shabnur & Omar Sani | Agun & Rizia Parvin | Modhur Milon ");
		addVideoItem("wjxhDsIlwK0", "Tumi Chuyona Chuyona (তুমি ছুয়োনা ছুয়োনা) ", "Riaz & Shabnur Song | Eri Name Dosti | ");
		addVideoItem("8tOOCVIKDoM", "Sagorer Dhew Bole | সাগরের ঢেউ বলে  ", "Shabnur, Riaz & Bapparaj | Buk Bhora Bhalobasha ");
		addVideoItem("volvBseqB0U", "Shukher Pakhire | সুখের পাখিরে বুকের জালে ", "Shabnur | Sabina Yasmin | Dui Noyoner Alo");
		addVideoItem("Y6ETPBkhlUE", "Pakhire O Pakhire | পাখিরে ও পাখিরে ", "Shabnur & Ferdous | Tumi Boro Bhaggoboti ");
		addVideoItem("eiN6QUB2R9I", "Bhalobaste Giye Ami | ভালোবাসতে গিয়ে আমি ", "Manna, Shabnur & Mousumi | Dui Bodhu Ek Shami ");
		addVideoItem("fG3iH73Ohjc", "Bhalobashar Majhe Duti | ভালবাসার মাঝে দু'টি  ", "Manna & Shabnur | Kanak Chapa & Asif | Kothin Purush ");
		addVideoItem("dYofIVICxWM", "Proti Second e Proti minute e ", "Manna & Shabnur | Dui Bodhu Ek Shami ");
		addVideoItem("Dgskb8NLkL4", "Assalamalaikum Biyain Shab | আসসালামালাইকুম বিয়ান সাব ", "Ferdous & Shabnur | Premer Jala ");
		addVideoItem("BevXBNN21Yo", "Chinechi Tomare | চিনেছি তোমারে  ", "Manna | Shabnur | Andrew Kishore | Kanak Chapa  ");
		addVideoItem("fG3iH73Ohjc", "Bhalobashar Majhe Duti | ভালবাসার মাঝে দু'টি ", "Manna & Shabnur | Kanak Chapa & Asif  ");
		addVideoItem("0wCVYpoXnE8", " Noniro Putul | ননীরও পুতুল ", "Manna & Shabnur | Andrew & Kanak | Jibon Ek Songhorsho");
		addVideoItem("6kDALNv-wM4", "Areo Bibijan | আরেও বিবিজান | ", "Manna & Shabnur | Andrew Kishore & Kanak Chapa | Somajke Bodle Daw");
		addVideoItem("BE2vebDzMnU", "Bhalobashi E Kothati | ভালোবাসি এ কথাটি  ", "Manna | Shabnur | Purnima | Shami Strir Juddho ");
		addVideoItem("vPWBMT7J4KI", " Koto Bhalobashi | কত ভালোবাসি | HD |Shabnur & Omor Sani ", "Milu & Sabina Yasmin | K Oporadhi ");
		addVideoItem("RNTVoxFKtDo", "Tomra Ektara | তোমরা একতারা বাজাইওনা  ", "Riaz & Shabnur | Kumar Biswajit | Prithibi Tomar Amar ");
		addVideoItem("T7iKDHj4INo", "Emon Ekta Din Nai | এমন একটা দিন নাই  ", "Shabnur & Shakil Khan | Bolo Na Bhalobasi ");
		addVideoItem("Kv4XqfnluBM", "Ekdin Tomake | একদিন তোমাকে  ", "Shabnur & Riaz | Andrew & Kanak | Kajer Meye ");
		addVideoItem("eESVEeEEyb8", "Tomake Emon Kore | তোমাকে এমন করে  ", "Riaz & Shabnur | Shopner Basor ");

		///////////Ferdous And ShabNur Msong///////////////
		addVideoItem("0RQPO034OuM", "Bhalobasha Charato | ভালোবাসা ছাড়াতো হয়না  ", " Shabnur & Ferdous | Joto Prem Toto Jala");
		addVideoItem("MApyX6mhgcc", "Kon Kanoner | কোন কাননের ফুল  ", "Shabnur & Ferdous | Milu & Kanak | Kheya Ghater Majhi  ");
		addVideoItem("3wtZbD2uxg0", " Purnima Chad | পূর্ণিমা চাঁদ নয়", "Shabnur & Ferdous | Andrew & Sabina | Dui Noyoner Alo ");
		addVideoItem("HgSPEkNWgPQ", "Jiboner Cheye Boro | জীবনের চেয়ে বড় প্রেম ", "Shabnur & Ferdous | Joto Prem Toto Jala ");
		addVideoItem("EpVF8xo08wI", "Bhalobasha Jibone Ekbar  ", "Ferdous, Shabnur | by Andrew Kishore & Kanak Chapa | Sobar Upore Prem ");
		addVideoItem("zNlLVTml5Eo", "Sagorer Motoi Govir | সাগরের মতই গভীর |  ", "  Ferdous & Shabnur | Andrew & Kanak | Premer Jala");
		addVideoItem("i-BtXJ6uJh8", "Amar Jibone Tumi | আমার জীবনে তুমি ", "Shabnur & Ferdous | Sabina & Monir Khan | Amar Shopno Tumi ");
		addVideoItem("Ngsn2uP2P2M", "Gachta Hoilo Shobuj Bondhu | গাছটা হইলো সবুজ বন্ধু ", "Shabnur & Ferdous | Bondhok ");
		addVideoItem("YP8XK3iMikw", "Dhakka Dile Song ", "Shabnur & Ferdous | Mamtaz | Fuler Moto Bou ");
		addVideoItem("cPzXgTYGpYM", "ichu Asha Kichu Bhalobasha ", "Ferdous | Shabnur | Mousumi | Arfin Rumey | Kheya ");
		addVideoItem("m-gb8w-eU5k", "Jiboner Cheye Boro Prem ", " Ferdous | Shabnur | Love Song ");
		addVideoItem("3b-yHNGGveM", "Tomar Bouke Tumi | তোমার বউকে তুমি ", " Shabnur & Ferdous | Sabina Yasmin | Tumi Boro Bhaggoboti ");
		addVideoItem("Y6ETPBkhlUE", "Pakhire O Pakhire | পাখিরে ও পাখিরে ", "Shabnur & Ferdous | Tumi Boro Bhaggoboti ");
		addVideoItem("d0T6BY8hMpQ", "Prothom Premer | প্রথম প্রেমের পরশ ", "Shabnur & Ferdous | Sabina & Monir |Tumi Boro Bhaggoboti ");
		addVideoItem("2ik9v-sFX5c", "Tumi Hobe Bougo | তুমি হবে বউগো ", "Shabnur, Ferdous & Shanu | Tumi Boro Bhaggoboti ");
		addVideoItem("8CJBpzTV7kM", "Ei Modhu Logone | এই মধু লগনে |  ", "Shabnur & Ferdous | Andrew & Kanak | Bostir Meye ");
		addVideoItem("q_evwlYW43w", "Jibone Eshecho | জীবনে এসেছো তুমি ", "Shabnur & Ferdous | Andrew & Kanak | Dilto Pagol ");
		addVideoItem("m6_EMzLahaA", "Tomar Namer Jikir | তোমার নামের জিকির  ", "Shabnur & Ferdous | Kanak Chapa | Premer Jala  ");
		addVideoItem("A598pfniPQo", "O Shami Dhon | ও স্বামী ধন ", "Shabnur & Ferdous | Kanak Chapa | Bondhok ");
		addVideoItem("2EWWJMHHMAs", "Tomay Chara Amar | তোমায় ছাড়া আমার ", "Shabnur & Ferdous | Andrew Kishore & Kanak | Bondhok ");
		addVideoItem("QMuvQt8lljA", "Sonar Boron Holud Amar | সোনার বরণ হলুদ আমার ", "Shabnur & Ferdous | Kanak Chapa | Fuler Moto ");
		addVideoItem("AGnNiCqpDEg", "Kotoi Nidra Jaogo | কতই নিদ্রা যাওগো ", "  Shabnur & Ferdous | Monir Khan & Kanak | Jomela Shundori");
		addVideoItem("AFNsdZxiAXc", "Shokha Aishogo | সখা আইসোগো  ", "Shabnur & Ferdous | Rizia Parvin & Polash | Bondhok ");
		addVideoItem("Dgskb8NLkL4", "Assalamalaikum Biyain Shab | আসসালামালাইকুম বিয়ান সাব ", "Ferdous & Shabnur | Premer Jala ");

		///////Shakib Khan and Shabnur movie Song////////////////////////
		addVideoItem("p81zmO3JE6k", "বিধি তুমি বলে দাও| Shakib Khan, Shabnur & Amin Khan ", "Shakib Khan, Shabnur & Amin Khan |Andrew, Kanak & Biplob|Phool Nebo Na Ashru Nebo ");
		addVideoItem("BoRljuDjb4I", "Dudhe Alta | দুধে আলতা বদন তোমার  ", " Shakib Khan & Shabnur | Andrew Kishore | Phool Nebo Na Ashru Nebo ");
		addVideoItem("hYfZNqc7lQc", "Eto Prem Chilo | এত প্রেম ছিল | Shakib Khan & Shabnur ", " Shakib Khan & Shabnur | Andrew & Kanak | O Priya Tumi Kothay ");
		addVideoItem("MO2RQe2Mfws", "Amar Hridoy Ekta Ayna | আমার হৃদয় একটা আয়না  ", "Shakib Khan & Shabnur | Phool Nebo Na Ashru Nebo ");
		addVideoItem("t33M1Rj83nU", "Duti Mone | দুটি মনে লেগে গেছে জোড়া | HD | Shabnur & Shakib Khan  ", "Shabnur & Shakib Khan | Andrew & Kanak | Golam ");
		addVideoItem("gGidNmGxYrQ", "Bhalobasa Chara Jani | ভালোবাসা ছাড়া জানি ", "Shabnur & Shakib Khan | Hridoy Shudhu Tomar Jnno ");
		addVideoItem("q5LElH7P-TE", "Mon Dilam Pran Dilam | Movie Song | Shakib Khan | Shabnur  ", "Shakib Khan | Shabnur | Kumar Bishwajit | Runa Laila ");
		addVideoItem("e7spFGVGyu8", "Nisshashe Tumi | নিঃশ্বাসে তুমি বিশ্বাসে তুমি ", " Shabnur & Shakib Khan | Nachnewali ");
		addVideoItem("1ulz6Cr1sy0", "Age Jodi Janitam | আগে যদি জানিতাম |  ", " Shakib Khan & Shabnur | Amar Praner Shami ");
		addVideoItem("jAs3XGpv_Wk", "Mathay Pagri Pore | মাথায় পাগড়ী পড়ে | Shakib Khan & Shabnur ", "Shakib Khan & Shabnur | Kanak Chapa & Monir | Prem Songghat ");
		addVideoItem("gIZMU8EihMo", "Dibose Tomake Chai | দিবসে তোমাকে চাই | Shabnur & Shakib Khan ", " Shabnur & Shakib Khan | Sabina & Andrew | Amar Swapno Tumi ");
		addVideoItem("S78AR5JDD50", "Koi Gela Nithur | কই গেলা নিঠুর বন্ধুরে | ", "Shakib Khan & Shabnur | Amar Praner Shami  ");
		addVideoItem("DjOuTILCuKw", "Meye Loker Buddhi | মেয়ে লোকের বুদ্ধি | Shakib Khan & Shabnur ", "Shakib Khan & Shabnur | Phool Nebo Na Ashru Nebo ");
		addVideoItem("1zuZEZyeMUw", "Tomake Bou Banabo | তোমাকে বউ বানাবো ", "Shakib Khan, Shabnur | Tomake Bou Banabo ");
		addVideoItem("1NLAsijl6NM", "Kichu Kichu Manusher Jibone | কিছু কিছু মানুষের  ", "Shakib Khan, Riaz & Shabnur | Shopner Basor ");
		addVideoItem("uDkA_6YmxYs", "Tomar Ei Nil Nil | তোমার এই নীল নীল চোখ | HD | Shakib Khan & Shabnur ", "Shakib Khan & Shabnur | Shopner Basor ");
		addVideoItem("vPOnpCjss-c", "Beche Achi Joto | বেঁচে আছি যত দিন | HD |Shakib Khan & Shabnur ", "|Shakib Khan & Shabnur | Kanak Chapa & Monir | Prem Songghat ");
		addVideoItem("-rBmGxLg3SI", "Ki Piriti Shikhaila (কি পিরিত শিখাইলা) Shakib Khan & Shabnur ", "Shakib Khan & Shabnur | Rosher Baidani  ");
		addVideoItem("Aj9vIuZm9vs", "Eto Prem | Bangla Movie Song | Sheikh Masud ", "Sheikh Masud | Shabnur | Romantic Song ");
		addVideoItem("oX4jAHhLxM0", "O Sathire | ও সাথীরে যেওনা | Sad Song | Salman Shah & Shabnur  ", "Salman Shah & Shabnur | Andrew & Sabina | Shopner Thikana ");
		addVideoItem("DjOuTILCuKw", "Meye Loker Buddhi | মেয়ে লোকের বুদ্ধি | Shakib Khan & Shabnur  ", " Shakib Khan & Shabnur | Phool Nebo Na Ashru Nebo ");
		addVideoItem("H1FIWgTq97k", "এমন নাচ নাচাইয়া | Nachnewali - নাচনেওয়ালী ", "| Shakib Khan, Shabnur, Dildar | MOVIE SONG ");
		addVideoItem("m5M7dPMvk30", "Beche Achi Joto Din | Shakib Khan | Shabnur  ", "Shakib Khan | Shabnur | Kanak Chapa | Monir Khan | Prem Songghat ");
		addVideoItem("bXP7VkataVA", "Shey Jodi Janto | সে যদি জানতো | HD | Shabnur & Shakib Khan ", "Shabnur & Shakib Khan | Andrew & Kanak | Golam ");
		addVideoItem("cEOCGRW6SNs", "Amar Bhalobashar | আমার ভালোবাসার | Shabnur & Shakib Khan  ", "Shabnur & Shakib Khan | Kanak Chapa | Noyon Bhora Jol ");
		addVideoItem("LbMtR3jmQ18", "Bolbo Kotha Bashor Ghore | Bangla Movie Song | Shakib Khan | Shabnur ", "Bangla Movie Song | Shakib Khan | Shabnur | Asif | Kanak Chapa ");
		addVideoItem("q3y1l1--4JE", "Je Amar Moner Manush Go || যে আমার মনের মানুষ গো  ", "Shakib Khan || Shabnur ");

		//////Shabnur and shakil khan//////////
		addVideoItem("30S9NuNXqG8", "Protidin Tomake Ami | প্রতিদিন তোমাকে আমি চাই | ", " Shabnur, Shakil Khan & Bapparaj | Amar Ontore Tumi ");
		addVideoItem("550DuYN9DbM", "Bangali Ekti Meye | বাঙ্গালী একটি মেয়ে ", " Shabnur & Shakil Khan | Bolo Na Bhalobasi  ");
		addVideoItem("K2fky8mqLzc", "Tumi Amar Shudhu Amari | তুমি আমার শুধু আমারই ", " Shabnur, Shakil Khan & Bapparaj | Amar Ontore Tumi ");
		addVideoItem("_VDhyQGFPgw", "O Pori O Pori | Shabnur | Shakil Khan |  ", "Shakil Khan | Kumar Bishwajit | Dui Noyoner Alo | Bangla Movie Song ");
		addVideoItem("xIGVMXAtvIc", "Tomar Buke Amar Bari | তোমার বুকে আমার বাড়ি | ", "Shabnur & Shakil Khan | Rizia & Andrew | Mon ");
		addVideoItem("T7iKDHj4INo", "Emon Ekta Din Nai | এমন একটা দিন নাই ", "Shabnur & Shakil Khan | Bolo Na Bhalobasi ");
		addVideoItem("htJsLszLfdE", "O Shathi Amar | ও সাথী আমার | Shabnur, Bapparaj & Shakil Khan ", " Shabnur, Bapparaj & Shakil Khan | Milu | Amar Ontore Tumi ");
		createPlayList("Shabnur",  R.drawable.vedio_icon);
		//==========================================================================







		//=============================Riazz album==================================================
		//==========================================================================================
		addVideoItem("ik7RszrxsBU", "Sona Dana Dami Gohona | সোনা দানা দামী গহনা  ", " Alamara Minu | Riaz & Shabnur | Matir Phool ");
		addVideoItem("S5gcMwh8ayI", "Bhalobasbo Basbo Re | ভালোবাসবো বাসবো রে বন্ধু ", "Riaz & Purnima | Hridoyer Kotha ");
		addVideoItem("e3RpdbX6-ks", "Hridhoye Likechi Tomari Naam || Purnima | ", " Purnima || Riaz || Samina || S I Tutul ");
		addVideoItem("ivo9g13NoMc", "Ei Bukete Kosto ", "Biplob | Riaz & Shabnur | Biplob | Matir Phool | Anupam");
		addVideoItem("nV9Lp_dPdCA", "Bhalobese Kosto ", "Shabnur & Riaz | Ayub Bacchu & Kanak | Karisma");
		addVideoItem("X1F0W9FHJfQ", "Tomay Goreche Bidhata | তোমায় গড়েছে বিধাতা ", "Riaz & Ravina | Andrew & Kanak | Sabdhan ");
		addVideoItem("1BgJlFlJIjk", "Tomake Vulte Giye| তোমাকে ভুলতে গিয়ে ", "Riaz & Popy | Milu & Kanak | Bidroho Charidike ");
		addVideoItem("mkPVRbvZ754", "Jar Mone Chile Tumi | যার মনে ছিলে তুমি ", " Riaz, Riya Sen & Sijar | Mone Pore Tomake ");
		//=======Riyaz and Purnima Movie song====================
		addVideoItem("aCz-eZxNdy4", "O Priyo Sathi | ও প্রিয় সাথী | Riaz & Purnima  ", "Subir Nandi & Kanak Chapa | Chotto Ektu Bhalobasa ");
		addVideoItem("u1-rHx5Kqmw", "Ei tumi Sei tumi | এই তুমি সেই তুমি |  ", "| Riaz & Purnima | Badha ");
		addVideoItem("z5LEZ-lDOgE", "Kotota Bochor Ei Shukh Robe | কতোটা বছর এই সুখ রবে ", "Riaz & Purnima | Hridoyer Kotha ");
		addVideoItem("kvSbEPOF6MI", "Dui Noyone Dekhe | দুই নয়নে দেখে | Riaz & Purnima  ", "Riaz & Purnima | Monir Khan & Kanak | Lal Doria ");
		addVideoItem("cmhW24Bc8dA", "Bujhe Nio Bujhe Nio | বুঝে নিও বুঝে নিও | ", "Romantic Song | Riaz & Purnima | Sathi Tumi Kar | ");
		addVideoItem("qTcaBQ3VWTM", "Nojor Na Lage Jeno || Riaz || Purnima || S I Tutul | ", "Riaz || Purnima || S I Tutul || Akash Chowa Bhalobasha  ");
		addVideoItem("1nHu_I9j3dQ", "Tomar Karone Ami Ucchal | তোমার কারনে আমি উচ্ছল ", " Riaz & Purnima | Hridoyer Kotha");
		addVideoItem("F6Y3yyWlH24", "Bujhe Nio Bujhe Nio | বুঝে নিও বুঝে নিও | Sad Song ", " Riaz & Purnima | Protik Hassan | Sathi Tumi Kar ");
		addVideoItem("oOuJzKFYdic", "Tomake Chere Bolo Ki Niye | তোমাকে ছেড়ে বল কি নিয়ে  ", "Riaz & Purnima | Hridoyer Kotha | Anupam ");
		addVideoItem("ftjCfZICiMU", "Moner Majhe Tumi | ft Riaz , Purnima | ", "  Riaz , Purnima | by Udit Narayan n Sadhana Sargam | Moner Majhe Tumi");
		addVideoItem("-K28SQx6Hvk", "Hawai Hawai Dolna Dole | হাওয়ায় হাওয়ায় দোলনা দোলে  ", "Riaz || Purnima | Habib | Nancy | Movie Song ");
		addVideoItem("Zng7R37sLUg", " Ekhon Premer Boshonto  ", "S.I Tutul | Soniya | Riaz | Purnima | Bangla Movie Song ");
		addVideoItem("QROlVmTrTeU", " Chupi Chupi Kichu Kotha | ft Riaz , Purnima", "Riaz , Purnima | by Kavita Krishnamurthy | Moner Majhe Tumi ");
		addVideoItem("eGAgdKO1Ius", "Tomay Banaiyache Je | তোমায় বানাইয়াছে যে আমায় বানাইয়াছে সে ", "Riaz&Purnima | Khobordar Movie Song ");
		addVideoItem("BdVHotOOTZw", "Akashe Batase Chol Version 2 | ft Riaz , Purnima ", " Riaz , Purnima | by Suam n Sadhana Sargam | Moner Majhe Tumi");
		addVideoItem("eGEdunfD_hA", "আমার নিঃশ্বাস বলো আমার বিশ্বাস বলো | Riaz | Purnima |  ", "Riaz | Purnima | Andrew Kishore,Samina Chowdhury,Jamai Shoshur ");
		addVideoItem("aCz-eZxNdy4", "O Priyo Sathi | ও প্রিয় সাথী  ", "Riaz & Purnima | Subir Nandi & Kanak Chapa | Chotto Ektu Bhalobasa ");
		addVideoItem("-YjJRWFjS4o", "Jay Din Jay Ekaki | যায় দিন যায় একাকী ", "Riaz & Purnima | S. I. Tutul | Hridoyer Kotha | Anupam ");
		addVideoItem("U8eZWzkOyJs", "Pran Kade Hay | ft Riaz , Purnima | by Kumar Sanu ", "Riaz , Purnima | by Kumar Sanu | Moner Majhe Tumi ");
		addVideoItem("KPN_dDWbD8M", "Jibone Morone Tumi Amari | Riaz | Purnima | Nishase Tumi Biswase Tumi ", " | Riaz | Purnima | Nishase Tumi Biswase Tumi | Bangla Movie Song");
		addVideoItem("vAnszPnKDDE", "Jibone Morone Tumi | জীবনে মরনে তুমি | Purnima & Riaz ", "Purnima & Riaz | Nishase Tumi Biswase Tumi ");
		addVideoItem("L4iAUbsNSAs", "  Premer Tajmohol | Bangla Movie Song", " Premer Tajmohol | Bangla Movie Song");
		addVideoItem("Zng7R37sLUg", "Ekhon Premer Boshonto | এখন প্রেমের বসন্ত ", "S.I Tutul | Soniya | Riaz | Purnima | Bangla Movie Song ");
		addVideoItem("z5LEZ-lDOgE", "Kotota Bochor Ei Shukh Robe | কতোটা বছর এই সুখ রবে  ", "Riaz & Purnima | Hridoyer Kotha ");
		addVideoItem("u1-rHx5Kqmw", "Ei tumi Sei tumi | এই তুমি সেই তুমি | Riaz & Purnima ", "Ei tumi Sei tumi | এই তুমি সেই তুমি | Riaz & Purnima ");
		addVideoItem("QROlVmTrTeU", "Chupi Chupi Kichu Kotha | ft Riaz , Purnima ", " Riaz , Purnima | by Kavita Krishnamurthy | Moner Majhe Tumi");
		addVideoItem("eGEdunfD_hA", "আমার নিঃশ্বাস বলো আমার বিশ্বাস বলো | Riaz | Purnima ", " Riaz | Purnima | Andrew Kishore,Samina Chowdhury,Jamai Shoshur ");
		addVideoItem("2Xpox3ESSDk", "তোমায় বানায়াছে যে | Riaz | Purnima | Bangla Movie Song  ", "  Tomay Banayache Je | RupNagar Entertainment");
		addVideoItem("5-p4k6i0EQc", "Monta Chuimoi Kore | মনটা ছুঁইমুই করে | Riaz & Purnima ", "Riaz & Purnima | Sathi Tumi Kar | Anupam ");
		addVideoItem("XPg986O5I20", "Buker Bhitor | Bangla Movie Song  ", " Bangla Movie Song | Riaz | Purnima | 2018 ");
		addVideoItem("nwavgICTy6Q", " Dekhar Chokhe | দেখার চোখে দেখে |", "Riaz & Purnima | Samina & S. I. Tutul | Tomakei Khujchi ");
		addVideoItem("B7oiRBwbJuM", "Tumi Shopno Tumi Sorgo | Riaz | Purnima | Subir Nandi  ", " Riaz | Purnima | Subir Nandi | Akash Chowa Bhalobasha");
		addVideoItem("meIldl1Z7xY", "Noyon Khuje Peyeche | নয়ন খুঁজে পেয়েছে মনি ", "Shabnur & Riaz | Andrew & Kanak | Mon | Anupam ");
		addVideoItem("a6a2f82KXR0", " Thako Jodi Kachakachi | থাকো যদি কাছাকাছি", " Shabnur & Riaz | Andrew & Kanak | Bostir Meye | Anupam ");
		addVideoItem("UzN-YB0r_Qo", " Tumi Kichu Diona | তুমি কিছু দিওনা | Shabnur & Riaz", "Shabnur & Riaz | Andrew & Kanak | Bhalobasa Bhalobasa ");
		addVideoItem("BEuOJjaXFBo", " Boro Kosto Valobashay | Riaz | Shabnur |", "Riaz | Shabnur | Bapparaj | Valobasha Kare Koy ");
		addVideoItem("26svxtZKjfY", "Tumi Acho Mone | তুমি আছো মনে ", "Shabnur, Riaz & Dipjol | Gundar Prem ");
		addVideoItem("QjPP_R1n3qc", "Tumi Bolona | তুমি বলোনা | HD | RIaz & Shabnur ", "RIaz & Shabnur | Andrew & Kanak Chapa | Matir Phool | Anupam ");
		addVideoItem("9jBr8mcx_uE", "Lakho Jonom Tomake | লাখো জনম তোমাকে | Shabnur & Riaz  ", "Shabnur & Riaz | Milu & Kanak Chapa | Bhalobasi Tomake ");
		addVideoItem("Z7OvAIAUsyg", "Premo Ronge | প্রেমও রঙে | Shabnur & Riaz  ", "Shabnur & Riaz | Kanak Chapa & Monir Khan | Bhalobasa Bhalobasa ");
		addVideoItem("hJgQkdp8Mi0", "Amar Moneri Angone | আমার মনেরই অঙ্গনে  ", "Shabnur & Riaz | Runa & Andrew | Bostir Meye | Anupam ");
		addVideoItem("c4aeqXEcF_k", "Mon Mane Nare | মন মানে নারে | Shabnur & Riaz ", " Andrew & Doly | O Priya Tumi Kothay | Anupam ");
		addVideoItem("Rtu8-gIQQQI", "Ekta Jibon | একটা জীবন একটাই মন ", " Riaz & Shabnur | Shopner Basor ");
		addVideoItem("FQ8eYqC1lnE", "Ei Chokh Bole Mon Bole | Riaz | Shabnur  ", "Riaz | Shabnur | Nishase Tumi Biswase Tumi | Bangla Movie Song ");
		addVideoItem("LjArxfkPQiQ", "Baulare Baulare | বাউলারে বাউলারে ", "Riaz & Ravina | Andrew & Kanak | Sabdhan  ");
		addVideoItem("X1F0W9FHJfQ", "Tomay Goreche Bidhata | তোমায় গড়েছে বিধাতা ", "Riaz & Ravina | Andrew & Kanak | Sabdhan ");
		addVideoItem("MbEzFcDb-qQ", "Tumi Shukhe Theko | তুমি সুখে থেকো | ", "Shabnur, Riaz & Dipjol | Andrew Kishore | Gundar Prem ");
		addVideoItem("5vde-eC_ypc", " Tomake Peye Ami | তোমাকে পেয়ে আমি |", "Shabnur & Riaz | Andrew & Kanak | O Priya Tumi Kothay ");
		addVideoItem("iW5C9y6LYFQ", " Tumi Chara Kichu | তুমি ছাড়া কিছু |", "Shabnur & Riaz | Andrew & Kanak | Ami Tomari | Anupam ");
		addVideoItem("O2dM3Sv_Kpg", "Ke Tumi Janina | কে তুমি জানিনা |  ", "Shabnur & Riaz | Kanak Chapa & Agun | Karisma ");
		addVideoItem("wdd0bBj1pVY", " Ar Jeno Vul Na Hoy | Riaz | Shabnur", "| Riaz | Shabnur | Valobasha Kare Koy | Bangla Movie Song ");
		addVideoItem("ik7RszrxsBU", "Sona Dana Dami Gohona | সোনা দানা দামী গহনা  ", " Alamara Minu | Riaz & Shabnur | Matir Phool ");
		addVideoItem("GkuE4XZ7Tt0", "Premhin E Jibon | প্রেমহীন এ জীবন | Shabnur & Riaz ", "Shabnur & Riaz | Andrew & Kanak | Bhalobasi Tomake ");
		addVideoItem("3tR9WgBozr4", "Na Na Korbona | না না করবোনা প্রেম ", "Shabnur & Riaz | Kanak Chapa & Asif | Hridoyer Bondhon ");
		addVideoItem("KKbfk28w2go", "Ekta Second Lagenare | একটা সেকেন্ড লাগেনারে ", " Shabnur & Riaz | Andrew & Kanak | Gundar Prem ");
		addVideoItem("8tOOCVIKDoM", "Sagorer Dhew Bole | সাগরের ঢেউ বলে ", " Shabnur, Riaz & Bapparaj | Buk Bhora Bhalobasha ");
		addVideoItem("RuEIchQfNtM", "Bodhu Esheche | Bangla Biyer Gaan | ", " Riaz | Shabnur | Kazi Hayat ");
		addVideoItem("s4az8E3Ob60", "Tomar Majhe Peyechi | তোমার মাঝে পেয়েছি", "Popy & Riaz | Andrew & Kanak | Khepabasu");
		addVideoItem("3fcs-OR2XdU", "Chokhu Duita Kajol Kalo | HD Movie Song", " Movie Song | Riaz & Popy | CD Vision");
		addVideoItem("1BgJlFlJIjk", "Tomake Vulte Giye| তোমাকে ভুলতে গিয়ে", " Riaz & Popy | Milu & Kanak | Bidroho Charidike | Anupam");
		addVideoItem("2WtptoLp2Uw", "Jala Boro Jala", " Bipasha & Asif | Khepabasu | Anupam");
		addVideoItem("2jm0kUSzrpk", "আমি শুধু তোমার হলাম", "Riaz, Popy | Bangla Movie Songs");
		addVideoItem("crZOL1t1ihY", "Ghumiye Thako Go Shojoni | ঘুমিয়ে থাকো গো সজনী", "Shabnur | Riaz | Shakil Khan | 3 Star Entertainmen");
		addVideoItem("HXRmQF54uZ8", "Bolona keno oi Akash Name Ase Sagorer Buke ", "HD Movie Song | Riaj, Popy & Tany Dais | CD Vision");
		addVideoItem("clkIoVkO-Lk", "Tumi Khub Shadharon Ekti Meye | Ferdous | Shabnur | Riaz ", " Ferdous | Shabnur | Riaz | Dui Noyoner Alo");
		addVideoItem("Z7OvAIAUsyg", "Premo Ronge | প্রেমও রঙে | Shabnur & Riaz ", " Shabnur & Riaz | Kanak Chapa & Monir Khan | Bhalobasa Bhalobasa ");
		addVideoItem("-jr-QTSe_tQ", "Tomake Chere Ami | তোমাকে ছেড়ে আমি | Riaz & Shabnur ", "Riaz & Shabnur | Kanak Chapa | Mon Mane Na ");
		addVideoItem("rvRgheK_nU8", "Milon Hobe Koto Dine | মিলন হবে কত দিনে ", " | Riaz | Shabnur | Kanak Chapa");
		addVideoItem("FQ8eYqC1lnE", " Ei Chokh Bole Mon Bole | Riaz | Shabnur", " Riaz | Shabnur | Nishase Tumi Biswase Tumi | Bangla Movie Song");
		addVideoItem("Kv4XqfnluBM", "Ekdin Tomake | একদিন তোমাকে | HD | Shabnur & Riaz ", " Shabnur & Riaz | Andrew & Kanak | Kajer Meye ");
		addVideoItem("oND_gPsrwm8", "Bidhata Bina Doshe | Bangla Movie Song | Riaz  ", "Bangla Movie Song | Riaz | Shabnur | Rinku ");
		createPlayList("Riaz", R.drawable.vedio_icon);
		//==========================================================================

		//=========================Purnima Album=================================================
		//=======================================================================================
		//=========================================================================================
		addVideoItem("6rGXihVmAXU", "Best of Purnima | বেস্ট অফ পূর্ণিমা | HD |10 Superhit Film Songs ", "Best of Purnima | বেস্ট অফ পূর্ণিমা | HD |10 Superhit Film Songs ");
		addVideoItem("urMGveqypEw", "Tumi Sathi Amar | তুমি সাথী আমার | Shakil Khan & Purnima", "Shakil Khan & Purnima | Monir Khan | Sathi Tumi Kar ");
		addVideoItem("ip3r7o9_7Gg", " OO Prio vul bujhe jabe kuthai| Riaz | Purnima ", " Riaz | Purnima | Monir Khan | Konok Chapa | Jamai Shoshur ");
		addVideoItem("WwUkBxPJOsE", "Mon Vashaiya Premer sompane | Shakib Khan&Shahara | ", "Shakib Khan&Shahara | Bolbo Kotha Bashor Ghore ");
		addVideoItem("2Rq88SchwxE", "Amar Ashar Basha | আমার আশার বাসা | ", "Monir Khan | Kanak Chapa | Purnima |Amin Khan |Bangla Movie  ");
		addVideoItem("5JP0Z1YIqGI", "Buk Chin Chin Korche | বুক চিন চিন করছে | HD", "Manna & Purnima | Andrew & Doly | Bastab | Anupam");
		addVideoItem("hVI2Fn9zhSQ", "Phool Dekhle Icche Kore | ফুল দেখলে ইচ্ছে করে | Manna & Purnima ", "Manna & Purnima | Doly & Palash | Ulta Palta");
		addVideoItem("L_k8LC33d5M", "ইমরান ও পুর্নিমার কন্ঠে গান । Imran। Purnima।", " Imran। Purnima। Channel i Music Award 2017 | Vuna Khichuri");
		addVideoItem("czf6tra4uSE", "Jibone Chaina Kichu | জীবনে চাইনা কিছু | Manna & Purnima ", "Manna & Purnima | Moner Sathe Juddha");
		addVideoItem("cM9kX6JAY4k", "Bhalobashi E Kothati | ভালোবাসি এ কথাটি | HD | Manna, Shabnur & Purnima", "Manna, Shabnur & Purnima | Shami Strir Juddho| Anupam");
		addVideoItem("ZuwIbMJDMi8", "Ei Monta Tomari | এই মনটা তোমারই দিওয়ানা | HD ", " Manna & Purnima | Baby Naznin & Asif | Villain");
		addVideoItem("MiuV0_NStAA", "Amay Duniya Theke | আমায় দুনিয়া থেকে | Amin Khan & Purnima", "Amin Khan & Purnima | Andrew & Kanak | Mukhomukhi | Anupam");
		addVideoItem("pQZIXPHHbPg", "Manus Bacher | মানুষ বাঁচার জন্য ", " Shakib Khan & Purnima | Monir Khan & Baby | Badha | Anupam");
		addVideoItem("txkPL7ETMk0", "Beiccha Dimu | বেইচ্যা দিমু রূপের দোকান", "Purnima & Amin Khan | Mukhomukhi | Anupam");
		addVideoItem("Csefgqmpc_4", "Ki Diya Bondhu | কি দিয়া বন্ধু মনটা কাড়িলা | ", "Shakib Khan & Apu | Tumi Shopno Tumi Sadhona");
		addVideoItem("2Rq88SchwxE", "Amar Ashar Basha | আমার আশার বাসা | Monir Khan | Kanak Chapa", "Monir Khan | Kanak Chapa | Purnima |Amin Khan |Bangla Movie");
		addVideoItem("nTXKJILzvj0", "Emon Mishti Ekta Bou", "Purnima & Ferdous | Shontan Jokhn Sottru | Anupam");
		addVideoItem("ZP6JuMUQ0qg", "Toka Dile Tostos | টোকা দিলে টসটস করে", "Shakib Khan & Purnima | Doly | Ajker Dapot | Anupam");
		addVideoItem("u1-rHx5Kqmw", "Ei tumi Sei tumi | এই তুমি সেই তুমি | Riaz & Purnima", "Riaz & Purnima | Badha");
		addVideoItem("X0RB9xlau84", "Ashbar Kale Ashlam Eka | আসবার কালে আসলাম একা", "| Manna & Purnima | James | Moner Sathe ");
		addVideoItem("KBtYKfQEq40", "Tumi Ki Jadu Jano | তুমি কি যাদু জানো ", "Manna & Purnima | Baby Naznin & Monir Khan | Ulta Palta");
		addVideoItem("kkCzlhNyl3Y", "Dine Dorja | দিনে দরজা খট খটায় | HD |", "Purnima | Momtaz | Bolo Na Bhalobasi | Anupam Movie Songs");
		addVideoItem("0uXwz5N1C8M", "Amay Tumi Mone Rakho | আমায় তুমি মনে রাখো", "Riaz & Purnima | Monir Khan & Kanak | Lal Doria");
		addVideoItem("IFKKNirbkno", "Tomari Preme Porey | তোমার'ই প্রেমে পরে ", "Bapparaj & Purnima | Premer Nam Bedona");
		addVideoItem("jTnpn4SWe50", "Bangla Romantic Song | Mon Ja Bole Boluk | ft. Purnima & Arifin Shuvoo", "Purnima & Arifin Shuvoo | Bangla Movie Song | Full HD");
		addVideoItem("0SHNlIr5N_U", "তোমাকে পেয়েছি আমি আনেক দিন পর | Riaz | Purnima |", "Riaz | Purnima | Bangla Movie Song| Channel i Movies");
		addVideoItem("ZTp207SGMtA", "Jodi Theme Jay | যদি থেমে যায় | HD | Purnima & Sizar", "Ayub Bacchu & Kanak | Miss Daina | Anupam");
		addVideoItem("EM4Zb_FaJ74", "Olpo Diner Jibon | অল্প দিনের জীবন | HD | Amin Khan & Purnima", "Milu & Kanak Chapa | Kallu Mama");
		addVideoItem("IjpC6kGAFpk", "Buker Vitor Hridoy Ache | বুকের ভিতর হৃদয় আছে ", "Amin Khan & Purnima | Bipodjonok");
		addVideoItem("zRN-n8zAEpc", "Chinli Na Tui | চিনলি না তুই | Amin Khan & Purnima", "Amin Khan & Purnima | Milu & Kanak | Mukhomukhi");
		addVideoItem("RY0Q8TdjFCc", "Premer Mobile | প্রেমের মোবাইল ফোনে ", " Amin Khan & Purnima | Runa & Andrew | Kallu Mama | ");
		addVideoItem("aCz-eZxNdy4", "O Priyo Sathi | ও প্রিয় সাথী | Riaz & Purnima  ", "Subir Nandi & Kanak Chapa | Chotto Ektu Bhalobasa ");
		addVideoItem("u1-rHx5Kqmw", "Ei tumi Sei tumi | এই তুমি সেই তুমি |  ", "| Riaz & Purnima | Badha ");
		addVideoItem("z5LEZ-lDOgE", "Kotota Bochor Ei Shukh Robe | কতোটা বছর এই সুখ রবে ", "Riaz & Purnima | Hridoyer Kotha ");
		addVideoItem("kvSbEPOF6MI", "Dui Noyone Dekhe | দুই নয়নে দেখে | Riaz & Purnima  ", "Riaz & Purnima | Monir Khan & Kanak | Lal Doria ");
		addVideoItem("cmhW24Bc8dA", "Bujhe Nio Bujhe Nio | বুঝে নিও বুঝে নিও | ", "Romantic Song | Riaz & Purnima | Sathi Tumi Kar | ");
		addVideoItem("qTcaBQ3VWTM", "Nojor Na Lage Jeno || Riaz || Purnima || S I Tutul | ", "Riaz || Purnima || S I Tutul || Akash Chowa Bhalobasha  ");
		addVideoItem("1nHu_I9j3dQ", "Tomar Karone Ami Ucchal | তোমার কারনে আমি উচ্ছল ", " Riaz & Purnima | Hridoyer Kotha");
		addVideoItem("F6Y3yyWlH24", "Bujhe Nio Bujhe Nio | বুঝে নিও বুঝে নিও | Sad Song ", " Riaz & Purnima | Protik Hassan | Sathi Tumi Kar ");
		addVideoItem("oOuJzKFYdic", "Tomake Chere Bolo Ki Niye | তোমাকে ছেড়ে বল কি নিয়ে  ", "Riaz & Purnima | Hridoyer Kotha | Anupam ");
		addVideoItem("ftjCfZICiMU", "Moner Majhe Tumi | ft Riaz , Purnima | ", "  Riaz , Purnima | by Udit Narayan n Sadhana Sargam | Moner Majhe Tumi");
		addVideoItem("-K28SQx6Hvk", "Hawai Hawai Dolna Dole | হাওয়ায় হাওয়ায় দোলনা দোলে  ", "Riaz || Purnima | Habib | Nancy | Movie Song ");
		addVideoItem("Zng7R37sLUg", " Ekhon Premer Boshonto  ", "S.I Tutul | Soniya | Riaz | Purnima | Bangla Movie Song ");
		addVideoItem("QROlVmTrTeU", " Chupi Chupi Kichu Kotha | ft Riaz , Purnima", "Riaz , Purnima | by Kavita Krishnamurthy | Moner Majhe Tumi ");
		addVideoItem("eGAgdKO1Ius", "Tomay Banaiyache Je | তোমায় বানাইয়াছে যে আমায় বানাইয়াছে সে ", "Riaz&Purnima | Khobordar Movie Song ");
		addVideoItem("BdVHotOOTZw", "Akashe Batase Chol Version 2 | ft Riaz , Purnima ", " Riaz , Purnima | by Suam n Sadhana Sargam | Moner Majhe Tumi");
		addVideoItem("eGEdunfD_hA", "আমার নিঃশ্বাস বলো আমার বিশ্বাস বলো | Riaz | Purnima |  ", "Riaz | Purnima | Andrew Kishore,Samina Chowdhury,Jamai Shoshur ");
		addVideoItem("aCz-eZxNdy4", "O Priyo Sathi | ও প্রিয় সাথী  ", "Riaz & Purnima | Subir Nandi & Kanak Chapa | Chotto Ektu Bhalobasa ");
		addVideoItem("-YjJRWFjS4o", "Jay Din Jay Ekaki | যায় দিন যায় একাকী ", "Riaz & Purnima | S. I. Tutul | Hridoyer Kotha | Anupam ");
		addVideoItem("U8eZWzkOyJs", "Pran Kade Hay | ft Riaz , Purnima | by Kumar Sanu ", "Riaz , Purnima | by Kumar Sanu | Moner Majhe Tumi ");
		addVideoItem("KPN_dDWbD8M", "Jibone Morone Tumi Amari | Riaz | Purnima | Nishase Tumi Biswase Tumi ", " | Riaz | Purnima | Nishase Tumi Biswase Tumi | Bangla Movie Song");
		addVideoItem("vAnszPnKDDE", "Jibone Morone Tumi | জীবনে মরনে তুমি | Purnima & Riaz ", "Purnima & Riaz | Nishase Tumi Biswase Tumi ");
		addVideoItem("L4iAUbsNSAs", "  Premer Tajmohol | Bangla Movie Song", " Premer Tajmohol | Bangla Movie Song");
		addVideoItem("Zng7R37sLUg", "Ekhon Premer Boshonto | এখন প্রেমের বসন্ত ", "S.I Tutul | Soniya | Riaz | Purnima | Bangla Movie Song ");
		addVideoItem("z5LEZ-lDOgE", "Kotota Bochor Ei Shukh Robe | কতোটা বছর এই সুখ রবে  ", "Riaz & Purnima | Hridoyer Kotha ");
		addVideoItem("u1-rHx5Kqmw", "Ei tumi Sei tumi | এই তুমি সেই তুমি | Riaz & Purnima ", "Ei tumi Sei tumi | এই তুমি সেই তুমি | Riaz & Purnima ");
		addVideoItem("QROlVmTrTeU", "Chupi Chupi Kichu Kotha | ft Riaz , Purnima ", " Riaz , Purnima | by Kavita Krishnamurthy | Moner Majhe Tumi");
		addVideoItem("eGEdunfD_hA", "আমার নিঃশ্বাস বলো আমার বিশ্বাস বলো | Riaz | Purnima ", " Riaz | Purnima | Andrew Kishore,Samina Chowdhury,Jamai Shoshur ");
		addVideoItem("2Xpox3ESSDk", "তোমায় বানায়াছে যে | Riaz | Purnima | Bangla Movie Song  ", "  Tomay Banayache Je | RupNagar Entertainment");
		addVideoItem("5-p4k6i0EQc", "Monta Chuimoi Kore | মনটা ছুঁইমুই করে | Riaz & Purnima ", "Riaz & Purnima | Sathi Tumi Kar | Anupam ");
		addVideoItem("XPg986O5I20", "Buker Bhitor | Bangla Movie Song  ", " Bangla Movie Song | Riaz | Purnima | 2018 ");
		addVideoItem("nwavgICTy6Q", " Dekhar Chokhe | দেখার চোখে দেখে |", "Riaz & Purnima | Samina & S. I. Tutul | Tomakei Khujchi ");
		addVideoItem("B7oiRBwbJuM", "Tumi Shopno Tumi Sorgo | Riaz | Purnima | Subir Nandi  ", " Riaz | Purnima | Subir Nandi | Akash Chowa Bhalobasha");
		addVideoItem("zn9WH7mM1Fw", "Ki diya ki Korlare | কি দিয়া কি করলারে | Purnima & Rubel", " Purnima & Rubel | Runa & Andrew | Sheyana Pagol");
		addVideoItem("TI1hILdTKrg", "Ek Polok Na Dekhle | এক পলক না দেখলে", " Rubel & Purnima | Andrew & Doly | Sheyana Pagol");
		createPlayList("Purnima", R.drawable.vedio_icon);
		//==========================================================================





		//==========================Arifin Shuvo Movie song Album================================================
		//=======================================================================================================
		addVideoItem("-WjzCI0KIl0", "Jane Ei Mon Jane | Arifin Shuvoo | Nusraat Faria  ", "Imran | Dhat Teri Ki | Bangla Movie Video Song ");
		addVideoItem("2MhhDlp7Y_Q", " Anek Kotha Chilo | Arifin Shuvo | Nusraat Faria", " Arifin Shuvo | Nusraat Faria | Zubeen Garg | Akassh ");
		addVideoItem("nKxopGm7kPU", "Chok Chok Korlei | Video Song | Arifin Shuvoo | Nusraat Faria", "Arifin Shuvoo | Nusraat Faria | Akassh | Premi O Premi Bengali Movie");
		addVideoItem("zCx2PMcE3eM", "Premi O Premi (Title Song) | Arifin Shuvoo | Nusraat Faria | Akassh", "Arifin Shuvoo | Nusraat Faria | Akassh | Bangla Movie Video Song 2019");
		addVideoItem("2lgTE1DIOnc", "Sajna Full Video | Arifin Shuvoo | Nusraat Faria | Imran | Akassh", "Arifin Shuvoo | Nusraat Faria | Imran | Akassh | Premi O Premi Bengali Movie 2016");
		addVideoItem("Ph53uv0UCdw", "Dhat Teri Ki Title Song | Arifin Shuvoo | Nusrat Faria", "Arifin Shuvoo | Nusrat Faria | \u200ERoshan\u202C | Farin |");
		//======Nusrat and arifin end===

		addVideoItem("aL3-r5K8y9Y", "Bangla Movie Song | Poth Jana Nei - by Arfin Rumey & Porshi", "Arfin Rumey & Porshi - ft Purnima & Arifin Shuvoo | Full HD");

		addVideoItem("KZqRrPmb95I", "Ayna Bolna (Full Video Song) | Arifin Shuvoo | Nusrat Imrose Tisha |", "| Arifin Shuvoo | Nusrat Imrose Tisha | Ostitto Bengali Movie 2016");
		addVideoItem("dY29rMeM_N0", "Tor Name Likhechi (Video Song) | Arifin Shuvoo | Nusrat Imrose Tisha", " Arifin Shuvoo | Nusrat Imrose Tisha | Ostitto Bengali Movie 2016");
		addVideoItem("j_T-a7jYaSM", "Ami Banglar Hero (Video Song) | Arifin Shuvoo | Nusrat Imrose Tisha", "Arifin Shuvoo | Nusrat Imrose Tisha | Ostitto Bengali Movie 2016");
		addVideoItem("1MSQ51st2hU", "Tor Name Likhechi (Full Video Song) | Arifin Shuvoo | Tisha ", "Arifin Shuvoo | Tisha | Ostitto Bengali Movie 2016");
		addVideoItem("7entq0kJrFA", "Ayna Bolna (Video Song) | Arifin Shuvoo | Nusrat Imrose Tisha", " Arifin Shuvoo | Nusrat Imrose Tisha | Ostitto Bengali Movie 2016");
		//==============Tisha and arifin end song========

		addVideoItem("qb1HTyRAVV4", "Tahsan, Kona - Chhuye Dile Mon", "Tahsan, Kona - Chhuye Dile Mon movie song");
		addVideoItem("YgPy1Dj01dc", "Valobasha Dao Habib Chuye Dile Mon Movie Song", "Chuye Dile Mon Movie Song");
		addVideoItem("AnP1LMShlEI", "Onek Sadhonar Pore | অনেক সাধনার পরে | Imran & Nancy", "Imran & Nancy | Arifin Shuvo & Jolly | Niyoti | Anupam");
		addVideoItem("LAT5nXYcl-k", "Dhakai Sharee | Video Song | Arifin Shuvoo | Jolly | Lemis ", "Arifin Shuvoo | Jolly | Lemis | Savvy | Niyoti Bengali Movie");
		addVideoItem("HeDy_SMZ1fE", "SHUDHU EKBAR BOLO | Full Video Song | Kistimaat", "Kistimaat | Porshi, Shahin & Tahsin | Tanjil Alam");
		addVideoItem("kLRfIbgi3-M", "Moneri Bhaje Bhaje - Kona & Tasif | Full Video Song ", "Full Video Song | Kistimaat (2014) | Arifin Shuvoo | Achol");
		addVideoItem("hoq8f2GjNd0", "Rong - Belal Khan & Konal | Musafir (2016) | Video Song | Arifin Shuvoo | Marjan Jenifa", "Musafir (2016) | Video Song | Arifin Shuvoo | Marjan Jenifa");
		addVideoItem("N7Il0aZKG_4", "Facebook | Video Song | Warning (2015) | Bengali Movie", "Bengali Movie | Arifin Shuvoo | Mahiya Mahi");
		addVideoItem("GZ93UXIVtPc", "Alto Choyate - Imran | Musafir (2016) | Official Video Song", "Musafir (2016) | Official Video Song | Arifin Shuvoo | Marjan Jenifa");
		addVideoItem("GD63Y097Wtw", "Ami Tumi By Arfin Rumey & Puja | Tarkata Bangla", "Tarkata Bangla Movie Song | Arefin Shuvo & Mim");
		addVideoItem("WVfi88ziaUQ", "Tumi Chaile | তুমি চাইলে | Zia Raj | Siam | Sabila Nur", "Siam | Sabila Nur | OST of Telefilm Happy Ending | Bangla song");
		addVideoItem("esfyhfSnrsU", "Mawla By Imran Mahmudul || Arifin Shuvoo & Mim ", "Arifin Shuvoo & Mim || Shapludu Movie Song 2019 || Rtv Music Special");
		addVideoItem("N1rg02QzW_Q", "Firey Aay - Porshi & Tahsin | Musafir (2016) ", "Bengali Movie | Video Song | Arifin Shuvoo | Marjan");
		addVideoItem("0AQccCYW8UM", "Hai Allah | Video Song | Arifin Shuvoo | Jolly | Kona ", "Arifin Shuvoo | Jolly | Kona | Savvy");
		addVideoItem("UAmHtKVfdiE", "Charpashe Eto Alo I Bhalo Theko I Shafiq Tuhin I", "Shafiq Tuhin I Arifin Shuvo I Official Video");
		addVideoItem("_licYE9aH4s", "O Akash | Chaya-Chobi Bangla Movie Song ", "Purnima & Arifin Shuvoo | Official Video Song Full HD");
		addVideoItem("3W6a-3PtCZk", "Oboshese By Shohid | HD Music Video", " Arifin Shovo & Tinni");

		addVideoItem("rQ2zxiysdVQ", "Chaya Chobi (ছায়া ছবি) || Full Video Song ", "Bangla Movie Song || Arifin Shuvoo | Purnima | Full HD");
		addVideoItem("IrzC-1vpwFo", "Mon Haralo | Video Song | Arifin Shuvoo | Jolly | Shaan", " Arifin Shuvoo | Jolly | Shaan | Nancy | Savvy");
		addVideoItem("A7AHZ21R6rc", "Onek Sadhonar Pore | Arifin Shuvoo | Seamoon |", "Arifin Shuvoo | Seamoon | Savvy | Niyoti Bengali Movie 2016");
		addVideoItem("ZHp5QXM097Y", "Alto Choyate - Imran | Musafir (2016) | Full Audio Track with Lyrics", "Full Audio Track with Lyrics | Arifin Shuvoo | Marjan Jenifa ");
		addVideoItem("Z6o3Knher_E", "Eto Kosto - James | Audio Track | Warning (2015)", "| Bengali Movie | Arifin Shuvoo | Mahiya Mahi");
		createPlayList("Arifin Shuvo", R.drawable.vedio_icon);
		//==========================================================================




		//===========Nusrat Fariya Movie song===============================================================
		//==================================================================================================
		addVideoItem("bM7_TctP3KQ", "PATAKA (Official Music Video) | Nusraat Faria | Pritom Hasan", " Nusraat Faria | Pritom Hasan | Baba Yadav | Bangla Song 2018");
		addVideoItem("hxtR1tgxSbY", "Habibi (হাবিবি) | Nusraat Faria | Bengali Dance Track ", "Nodi | Nusraat Faria | Dhat Teri ki ");
		addVideoItem("-WjzCI0KIl0", "Jane Ei Mon Jane | Arifin Shuvoo | Nusraat Faria  ", "Imran | Dhat Teri Ki | Bangla Movie Video Song ");
		addVideoItem("2MhhDlp7Y_Q", " Anek Kotha Chilo | Arifin Shuvo | Nusraat Faria", " Arifin Shuvo | Nusraat Faria | Zubeen Garg | Akassh ");
		addVideoItem("nKxopGm7kPU", "Chok Chok Korlei | Video Song | Arifin Shuvoo | Nusraat Faria", "Arifin Shuvoo | Nusraat Faria | Akassh | Premi O Premi Bengali Movie");
		addVideoItem("zCx2PMcE3eM", "Premi O Premi (Title Song) | Arifin Shuvoo | Nusraat Faria | Akassh", "Arifin Shuvoo | Nusraat Faria | Akassh | Bangla Movie Video Song 2019");
		addVideoItem("2lgTE1DIOnc", "Sajna Full Video | Arifin Shuvoo | Nusraat Faria | Imran | Akassh", "Arifin Shuvoo | Nusraat Faria | Imran | Akassh | Premi O Premi Bengali Movie 2016");
		addVideoItem("Ph53uv0UCdw", "Dhat Teri Ki Title Song | Arifin Shuvoo | Nusrat Faria", "Arifin Shuvoo | Nusrat Faria | \u200ERoshan\u202C | Farin |");

		addVideoItem("76TN9YPqqQA", "Roshik Amaar | Shakib Khan | Nusrat Faria | Savvy | Kona", "| Savvy | Kona | Shahenshah Bengali Movie 2019");
		addVideoItem("OkxiPuCj0hw", "Dhat Teri Ki | Full Video | Jeet | Nusrat Faria", "Nusrat Faria | Baba Yadav | Badsha Bengali Movie 2016");
		addVideoItem("Vh38bp5mqGg", "Mor Ghumo Ghore | Nazrul Giti | Nodi | Nusraat Faria | Dhat Teri k ", "Nodi | Nusraat Faria | Dhat Teri ki ");
		addVideoItem("B9cK2BVmPCM", "Ae Poth Jodi Na Sesh Hoy | Om | Nusraat Faria | Riya Sen ", " Nusraat Faria | Riya Sen | Savvy | Hero 420 Bengali Movie 2016 ");
		createPlayList("Nusrat Fariya", R.drawable.vedio_icon);
		//==========================================================================






		//==================Shakib Khan Movie song Album========================================================
		//======================================================================================================
		//======================================================================================================
		addVideoItem("jo41PDr-e58", "Amar Valobasha | আমার ভালোবাসা | ", "Zarin | Shakib Khan | Puja Chery | Golui ");
		addVideoItem("1DNAA0bJ5rM", "Jombe Mela | Shakib Khan | Puja Chery ", " Zarin | Golui Movie Song ");
		addVideoItem("hYfZNqc7lQc", "Eto Prem Chilo | এত প্রেম ছিল | Shakib Khan & Shabnur ", "Shakib Khan & Shabnur | Andrew & Kanak | O Priya Tumi Kothay ");
		addVideoItem("ShY5I3YYqpA", "Tumi Amar Praner Shami | তুমি আমার প্রানের স্বামী ", " Shakib Khan & Shabnur | Amar Praner Shami ");
		addVideoItem("SbZpKhsjLYc", "O Konnago | ও কন্যাগো | Shabnur & Shakib Khan ", " Andrew Kishore & Momtaz | Nachnewali ");
		addVideoItem("0LAp-RvjCs0", "Harabo Toke | Full Video | Shakib Khan | Srabanti | Shaan  ", " Shakib Khan | Srabanti | Shaan | Shikari Bengali Movie 2016 ");
		addVideoItem("L1m3T-I-LZY", "Uth Chhuri Tor Biye Hobe | Full Video | Shakib Khan | Srabanti  ", "Shakib Khan | Srabanti | Shikari Bengali Movie 2016 ");
		addVideoItem("1whuyrYn89I", "Ar Kono Kotha Na Bole\u202C | Shakib Khan | Srabanti", "hakib Khan | Srabanti | Arijit Singh | Shikari Bengali Movie 2016 ");
		addVideoItem("8IGv50XasM4", "CHUMMA | ROMANTIC SONG | AMI NETA HOBO | SHAKIB KHAN | BIDYA SINHA  ", "SHAKIB KHAN | BIDYA SINHA | LATEST BENGALI SONG 2018 ");
		addVideoItem("yCtdkcx93w0", "Likhechhi Tor Naam | Shakib Khan | Srabanti ", "Shakib Khan | Srabanti | Bhaijaan Elo Re | Romantic Song 2018 ");
		addVideoItem("76TN9YPqqQA", "Roshik Amaar | Shakib Khan | Nusrat Faria | Savvy ", "Shakib Khan | Nusrat Faria | Savvy | Kona | Shahenshah ");
		addVideoItem("gIZMU8EihMo", "Dibose Tomake Chai | দিবসে তোমাকে চাই | Shabnur & Shakib Khan ", " Shabnur & Shakib Khan | Sabina & Andrew | Amar Swapno Tumi ");
		addVideoItem("S78AR5JDD50", "Koi Gela Nithur | কই গেলা নিঠুর বন্ধুরে | ", "Shakib Khan & Shabnur | Amar Praner Shami  ");
		addVideoItem("DjOuTILCuKw", "Meye Loker Buddhi | মেয়ে লোকের বুদ্ধি | Shakib Khan & Shabnur ", "Shakib Khan & Shabnur | Phool Nebo Na Ashru Nebo ");
		addVideoItem("1zuZEZyeMUw", "Tomake Bou Banabo | তোমাকে বউ বানাবো ", "Shakib Khan, Shabnur | Tomake Bou Banabo ");
		addVideoItem("1NLAsijl6NM", "Kichu Kichu Manusher Jibone | কিছু কিছু মানুষের  ", "Shakib Khan, Riaz & Shabnur | Shopner Basor ");
		addVideoItem("uDkA_6YmxYs", "Tomar Ei Nil Nil | তোমার এই নীল নীল চোখ | HD | Shakib Khan & Shabnur ", "Shakib Khan & Shabnur | Shopner Basor ");
		addVideoItem("vPOnpCjss-c", "Beche Achi Joto | বেঁচে আছি যত দিন | HD |Shakib Khan & Shabnur ", "|Shakib Khan & Shabnur | Kanak Chapa & Monir | Prem Songghat ");
		addVideoItem("-rBmGxLg3SI", "Ki Piriti Shikhaila (কি পিরিত শিখাইলা) Shakib Khan & Shabnur ", "Shakib Khan & Shabnur | Rosher Baidani  ");
		addVideoItem("Aj9vIuZm9vs", "Eto Prem | Bangla Movie Song | Sheikh Masud ", "Sheikh Masud | Shabnur | Romantic Song ");
		addVideoItem("oX4jAHhLxM0", "O Sathire | ও সাথীরে যেওনা | Sad Song | Salman Shah & Shabnur  ", "Salman Shah & Shabnur | Andrew & Sabina | Shopner Thikana ");
		addVideoItem("DjOuTILCuKw", "Meye Loker Buddhi | মেয়ে লোকের বুদ্ধি | Shakib Khan & Shabnur  ", " Shakib Khan & Shabnur | Phool Nebo Na Ashru Nebo ");
		addVideoItem("H1FIWgTq97k", "এমন নাচ নাচাইয়া | Nachnewali - নাচনেওয়ালী ", "| Shakib Khan, Shabnur, Dildar | MOVIE SONG ");
		addVideoItem("m5M7dPMvk30", "Beche Achi Joto Din | Shakib Khan | Shabnur  ", "Shakib Khan | Shabnur | Kanak Chapa | Monir Khan | Prem Songghat ");
		addVideoItem("bXP7VkataVA", "Shey Jodi Janto | সে যদি জানতো | HD | Shabnur & Shakib Khan ", "Shabnur & Shakib Khan | Andrew & Kanak | Golam ");
		addVideoItem("cEOCGRW6SNs", "Amar Bhalobashar | আমার ভালোবাসার | Shabnur & Shakib Khan  ", "Shabnur & Shakib Khan | Kanak Chapa | Noyon Bhora Jol ");
		addVideoItem("LbMtR3jmQ18", "Bolbo Kotha Bashor Ghore | Bangla Movie Song | Shakib Khan | Shabnur ", "Bangla Movie Song | Shakib Khan | Shabnur | Asif | Kanak Chapa ");
		addVideoItem("q3y1l1--4JE", "Je Amar Moner Manush Go || যে আমার মনের মানুষ গো  ", "Shakib Khan || Shabnur ");
		//============Shakib khan And Bubly==========
		addVideoItem("9xQW1TdRn-U", "Dil Dil Dil | Full Video Song | Shakib Khan | Bubly  ", "Shakib Khan | Bubly | Imran and Kona | Boss Giri ");
		addVideoItem("kuZ-CyrAZFo", "Hati Hati Paye Paye | Shakib Khan | Payel Sarkar  ", "Shakib Khan | Payel Sarkar | Bhaijaan Elo Re ");
		addVideoItem("QR9Lyub6j30", "PAGOL MON (পাগল মন) । SHAKIB KHAN l BUBLY  ", "  SHAKIB KHAN l BUBLY l PASSWORD Bangla Movie Song");
		addVideoItem("LFWFaYKiXnY", "TUMI AMAR JIBON (তুমি আমার জীবন) । BIR (বীর)  ", "SHAKIB KHAN l BUBLY | Imran | Konal ");
		addVideoItem("P5OkJJ7I7PQ", "Boom Boom | Shakib Khan | Shabnom Bubly ", "Shakib Khan | Shabnom Bubly | Upcoming Bengali Movie Super Hero ");
		addVideoItem("gjrEMPxIxWk", "Tomake Apon Kore | Shakib Khan | Shabnom Bubly| ", " Shakib Khan | Shabnom Bubly| Ashiqur Rahman |");
		addVideoItem("-KvPY-1pbKw", "Keno Aajkal | Shakib Khan | Bubly  ", " Shakib Khan | Bubly | Chittagainga Powa Noakhailla Maiya  ");
		addVideoItem("AUE5QSxl2MY", "Rim Jhim | Full Video Song | Shakib Khan | Bubly ", "Shakib Khan | Bubly | Mohammed Irfan | Rangbaaz ");
		addVideoItem("x3j8jbKXlYo", "লাইক মেরেছি | Like Merechi Full Song ", " Shakib Khan | Bubly | Bidrohi Movie Song ");
		addVideoItem("rdo6yIRJE-k", "KOTO VALOBASHI TORE - কতো ভালোবাসি তোরে । ", "SHAKIB KHAN l BUBLY l IMRAN l Moner Moto Manush Pailam Na ");
		addVideoItem("Xzac1ZjGrEU", "Tui Chad Eider | Full Video Song | Shakib Khan | Bubly ", " Shakib Khan | Bubly | Savvy | Rangbaaz Bengali Movie ");
		addVideoItem("2OcwEI7YnRw", "Buker Vitor Rekhe Tomay (Video Song) | Shakib Khan | Bubly  ", " Shakib Khan | Bubly | Imran | Ohongkar Bangla Movie  ");
		addVideoItem("4bONzaujjhI", "MISS BUBLY ( মিস বুবলী ) । BIR (বীর) Movie Item Song। ", "SHAKIB KHAN l BUBLY | KONAL | AKASSH SEN ");
		addVideoItem("CRMnmsp46MY", "AGUN LAGAILO (আগুন লাগাইলো) l SHAKIB KHAN l BUBLY  ", "SHAKIB KHAN l BUBLY l PASSWORD Movie Party Song ");
		addVideoItem("2x3CTtngJtY", "ভাবিনি কখনো এভাবে | Bhabini Kokhono Ebhabe ", "ShakibKhan | Bubly | ImranMahmudul | Bidrohi Movie Song ");
		addVideoItem("2LRqmjl5czs", "Bubly Bubly Bubly | Full Video Song | Shakib Khan | Bubly  ", "Shakib Khan | Bubly | S I Tutul | Boss Giri Bangla Movie 2016 ");

		/////Shakib Khan and Apu bissash//////
		addVideoItem("j1tN8arx4pI", "Toke Onek Bhalobashi - Love Marriage ", "Movie Song | Shakib Khan, Apu Biswas ");
		addVideoItem("Yz14YYnbioE", "Love Marriage: Title Song | Movie Song  ", "Movie Song | Shakib Khan, Apu Biswas ");
		addVideoItem("nOP39RST7jM", "Panku Jamai Title Song | Shakib Khan  ", "Shakib Khan | Apu Biswas | Panku Jamai Bengali Movie 2018 ");
		addVideoItem("XRC2ln69hZU", "Neel Neel Nilanjona | নীল নীল নীলাঞ্জনা | HD  ", "Shakib Khan & Apu Biswas | Asif | Tumi Amar Prem ");
		addVideoItem("qVakmrWr94c", "Dekhle Tore Monta | দেখলে তোরে মনটা বলে  ", "Shakib Khan & Apu Biswas | Daring Lover ");
		addVideoItem("Mjzi7-lSPQE", "Jaan Kurban | জান কুরবান | S.I.Tutul | Kanok Chapa ", "S.I.Tutul | Kanok Chapa | Shakib Khan | Apu Biswas ");
		addVideoItem("Jgl5m5mlfxs", " Karo Preme | কারো প্রেমে | Doly Sayontoni |", " Doly Sayontoni | Shakib Khan | Apu | Jaan Kurban | Bangla Movie");
		addVideoItem("zEbWTdBWo6A", "O Praner Raja | RAJA 420 | Shakib Khan | ApuBiswash ", "Shakib Khan | ApuBiswash | Uttam Akash | Raja 420 Bangla Movie ");
		addVideoItem("SmiDJpqYUT4", "Bhalobashar Prithibita Kokhon | ভালবাসার পৃথিবীটা কখন ", " Shakib Khan & Apu Biswas | Top Hero ");
		addVideoItem("HQiyPU_lg-k", "Koti Koti | কোটি কোটি মানুষের | HD | Shakib Khan & Apu Biswas  ", "Shakib Khan & Apu Biswas | Amar Buker Moddhikhane  ");
		addVideoItem("wPxzUSPLfNU", "Bhalobasha Ontobihin | ভালোবাসা অন্তবিহীন | ", "Shakib Khan & Apu Biswas | Koti Takar Kabin | ");
		addVideoItem("n0d1KoBwCWk", "O Premi | ও প্রেমী ও প্রেমী | HD | ", "  Shakib Khan & Apu Biswas | S.I. Tutul & Doly ");
		addVideoItem("GFPB5bsy3Xw", " Chainare Jomidari | চাইনারে জমিদারী ", " S I Tutul | Rizia | Shakib Khan | Apu | Bangla Movie Song ");
		addVideoItem("pV5puNPChuE", "Dhum Ta Na | ধুম তা না | ", "| Apu Biswas & Rumana | Preme Porechi ");
		addVideoItem("9qJoyvHpCQs", "Ek Bindu Bhalobasha | এক বিন্দু ভালোবাসা দাও ", " Shakib Khan & Apu Biswas | Mone Prane Acho Tumi ");
		addVideoItem("8PNwI1QfOnk", "Tukro Tukro Kore | টুকরো টুকরো করে দেখো ", "Shakib Khan & Apu Biswas | Bolona Kobul  ");
		addVideoItem("X_yxXEaE0DI", "Raatbhor - Imran | SAMRAAT: The King Is Here ", "Video Song | Shakib Khan | Apu Biswas ");
		addVideoItem("CXFMEKjcXmI", "Amar Buker Bhetor | আমার বুকের ভেতর | HD ", "Shakib Khan & Apu Biswas | Sontan Amar Ohongkar  ");
		addVideoItem("_uOkmSdOnz4", "Tumi Je Amar Sadhona | Shakib Khan | Apu Biswas ", "Shakib Khan | Apu Biswas | Ziddi Mama Movie Song ");
		addVideoItem("AJIL-3adzzM", "Amar Moneri Ghore | আমার মনেরই ঘরে ", "Shakib Khan & Apu Biswas | Moner Ghore Bosot Kore ");
		addVideoItem("j0cL8rpLZVU", "Mon Churi Chara | মন চুরি ছাড়া কাজ নেই  ", "Shakib Khan & Apu Biswas | Takar Cheye Prem Boro ");
		addVideoItem("_XNMmBBOCZw", "Emon Jodi Hoto - Andrew Kishore and Konok Chapa ", "Kothin Protishodh | Shakib Khan | Apu Biswas ");
		addVideoItem("Bk-9KICa67c", "Ami Chilam Eka | Bangla Movie Song | ", "Shakib Khan, Apu Biswas | PMNB | আমি ছিলাম একা ");
		addVideoItem("zs8TMq5NT_Y", "Eshona Bachi | এসোনা বাঁচি  ", "S.I Tutul | Shakib Khan | Apu Biswas | Jaan Kurban ");
		addVideoItem("B7o_6_q3z6c", "Chupi Chupi Mon Nile Kere | Love Marriage  ", "Movie Song | Shakib Khan, Apu Biswas ");
		addVideoItem("gbmGXKLarRo", "Tumi Janan Janamer | তুমি জনম জনমের সাথী  ", " Shakib Khan & Apu Biswas | Jonom Jonomer Prem");
		addVideoItem("cGKiUD5VA7A", " Monta to Diyechi | Shakib Khan | Apu Biswas | মনটাতো দিয়েছি", " Monta to Diyechi | Shakib Khan | Apu Biswas | মনটাতো দিয়েছি");
		addVideoItem("593ZWOI9gtA", "Alta Dudhe | Shakib Khan | Apu Biswas ", "Alta Dudhe | Shakib Khan | Apu Biswas ");
		addVideoItem("T1w61tQKdLU", "Chokher Dorja Khule | চোখের দরজা খুলে ", "Shakib Khan & Apu Biswas | Preme Porechi ");
		addVideoItem("ewbmAHgJLVg", "Tomari Preme Ami | তোমারই প্রেমে আমি ", " Amin Khan & Apu Biswas | Pitar Ason ");
		addVideoItem("quQ9NiggWdE", "ভালোবাসা এক্সপ্রেস | Shakib Khan | Apu Biswas  ", "Shakib Khan | Apu Biswas | New Bangla Movie Song ");
		addVideoItem("SbLW7bG8zjE", "Kate Nato Ghor | Bangla Movie Song ", " Shakib Khan | Apu Biswas | S.I Tutul ");
		addVideoItem("nwgJPmHkKEY", " I Love You Hero | Shakib Khan | Apu Biswas | ", " Shakib Khan | Apu Biswas | Polash | Tanjina Ruma | Moon  ");
		addVideoItem("DFAcv2hZi4g", " Bhalobehse Eibar Ay Kache Tui - Love Marriage Movie Song ", " Love Marriage Movie Song | Shakib Khan, Apu Biswas ");
		addVideoItem("wWfPqN2Anlo", "Valobashar Hobe Joy | ভালোবাসার হবে জয়  ", " S.I Tutul | Shakib Khan | Apu Biswas | Bangla Movie Song ");
		addVideoItem("PYSfV63V5LA", "Chupi Chupi Mon | ft Shakib Khan | Apu Biswas ", "Shakib Khan | Apu Biswas | HD1080p ");
		addVideoItem("ignrINISSjY", "Ore Amar Moyna Pakhi | Bangla Movie Song ", "Bangla Movie Song | Shakib Khan | Amit Hasan | Apu Biswas ");
		addVideoItem("_xDUBw3PxBI", "Shopno Gulo Sotti Holo | Shakib Khan | Apu Biswas ", " Shakib Khan | Apu Biswas | S I Tutul | Mim | Hitman ");

		//==========Shakib khan and purnima========================
		addVideoItem("OHW9EpYzLOE", "Icche Boro Icche | ইচ্ছে বড় ইচ্ছে | Shakib Khan & Purnima | ", "Shakib Khan & Purnima | Poran Jay Joliyare ");
		addVideoItem("pQZIXPHHbPg", "Manus Bacher | মানুষ বাঁচার জন্য | HD | Shakib Khan & Purnima  ", "Shakib Khan & Purnima | Monir Khan & Baby | Badha  ");
		addVideoItem("cSQABIzvCCw", "Janre Monre | জানরে মনরে প্রেমরে | HD | Shakib Khan & Purnima  ", "  Shakib Khan & Purnima | Kanak Chapa & Palash | Shikari");
		addVideoItem("JK4jsq2-zpQ", "Bondho Ekta Kamra | ft Shakib Khan , Purnima ", " Shakib Khan , Purnima | Samina Chowdhury & Komol");
		addVideoItem("-2Q3Sf4o1js", "Prem Hoye Jai | Shakib Khan | Purmima | ", "Shakib Khan | Purmima | Andrew Kishore | Shikari Movie ");
		addVideoItem("Q2Et-j8Cfqk", "Aj Tumi Bolecho Amake | ft Shakib Khan , Purnima | ", "Shakib Khan , Purnima | Kanak Chapa & Monir Khan| Maa Amar Shorgo ");
		addVideoItem("czR98Ln8K9E", "Amar Poran Jay | আমার পরান যায় জ্বলিয়ারে | ", "Amar Poran Jay | আমার পরান যায় জ্বলিয়ারে | ");
		addVideoItem("2Rq88SchwxE", "Amar Ashar Basha | আমার আশার বাসা | Monir Khan | Kanak Chapa ", " Monir Khan | Kanak Chapa | Purnima |Amin Khan |Bangla Movie Song");
		addVideoItem("pQZIXPHHbPg", "Manus Bacher | মানুষ বাঁচার জন্য | HD | Shakib Khan & Purnima | Monir Khan & Baby  ", "Shakib Khan & Purnima | Monir Khan & Baby | Badha | Anupam ");
		addVideoItem("OQVbCtM0z1U", " Khub Chena Chena Lagche | খুব চেনা চেনা লাগছে |", "  Shakib Khan | Purnima | Bangla Movie Song");
		addVideoItem("TcM8MTgd1gU", " Aaj Tumi Bolecho | আজ তুমি বলেছো", "Monir Khan | Kanak Chapa | Maa Amar Shorgo | Bangla Movie Song ");
		addVideoItem("0vRQRCE7Abc", "Cholo Cholo Sajan | Bangla Movie Song | ", "Shakib Khan | Purnima | Full Video Song ");
		addVideoItem("zpTMPslq8Sk", "Hridoy Amar | হৃদয় আমার | Shakib Khan  ", " Shakib Khan | Purnima | Judge Barrister Police Commissioner ");
		addVideoItem("GDWXf3EwI4U", "O Prithibi Dekho | ও পৃথিবী দেখো | ", " O Prithibi Dekho | ও পৃথিবী দেখো | Shakib Khan, Purnima");
		addVideoItem("B9iWekfoVFA", "Norom Norom | Shakib Khan | Purnima | Mejaj Gorom ", " Shakib Khan | Purnima | Mejaj Gorom | Bangla Movie Song");
		addVideoItem("_q8cRCdWjaQ", "Ektu Ektu Kore | একটু একটু করে | Shakib Khan & Purnima  ", "  Shakib Khan & Purnima | Palash & Doly ");
		addVideoItem("cSQABIzvCCw", "Janre Monre | জানরে মনরে প্রেমরে |  ", " Shakib Khan & Purnima | Kanak Chapa & Palash | Shikari ");

		//====Shakib khan And Popy popy popy popy ================
		addVideoItem("rMPb0ohNXMg", "Tui Bine Mon | তুই বিনে মন মানেনা  ", "Shakib Khan & Popy | Monir Khan & Anima | Jomoj ");
		addVideoItem("2IMbMqT-tas", "Bhalobeshe Faguner Shukh | ভালোবেসে ফাগুনের সুখ  ", "  Shakib Khan & Popy | Andrew & Kanak | Dosshu");
		addVideoItem("oaIQ7VuMg7c", " Sundori O Sundori | সুন্দরী ও সুন্দরী ", " Shakib Khan & Popy | Kanak & Shahin | Gono Dushmon ");
		addVideoItem("SSc1oUwIjrQ", "Mon Bojhona | মন বোঝনা | HD | Shakib Khan, Popy & Nodi  ", "Shakib Khan, Popy & Nodi | Baby Naznin & Anima D Costa  ");
		addVideoItem("Kico5bDQ4Y0", " Tumi Jodi Prithibite Na Aste | তুমি যদি পৃথিবীতে না আসতে", "Shakib Khan & Popy | Hira Chuni Panna ");
		addVideoItem("9SzRwiANqR0", "Amra Shudhu Dujon Dujonar | আমরা শুধু দু'জন দু'জনার ", "Shakib Khan & Popy | Dujon Dujonar ");
		addVideoItem("KtX0M0rP9Ew", "আমার মাঝে নেই তো আমি | Amar Majhe Nei To Ami | ", "Amar Majhe Nei To Ami | Shakib Khan | Popy | Uma Khan, Juari, Movie Song  ");
		addVideoItem("8cVBRFGRxTw", "Roshik Dilwala | রসিক দিলওয়ালা | Shakil Khan & Popy ", "Shakil Khan & Popy | Rizia Parvin | Milon Malar Prem ");
		addVideoItem("a20oaRVTUMA", "Dam Diye Prem Jayna | দাম দিয়ে প্রেম যায়না কেনা ", "Shakil Khan & Popy | Ei Mon Tomake Dilam ");
		addVideoItem("RUYc37GhdjU", "Mon Manena | মন মানেনা কথা শোনেনা ", "Shakib Khan & Poppy | Daku Rani | SB Entertainment ");
		addVideoItem("qw0IY4zio5E", "Jibon Furiye Jabe | জীবন ফুরিয়ে যাবে | Riaz & Popy ", " Riaz & Popy | Andrew & kanak | Bidroho Charidike ");
		addVideoItem("EMdETbRpPJs", "Tui Bine Mon Manena | তুই বিনে মন মানেনা বন্ধু ", " Shakib Khan&Popy | Jomoj Movie Song ");
		addVideoItem("HiZNndW_YQE", "Se ki Asbe | সে কি আসবে  ", "Shakib Khan & Popy | Runa Laila | Dujon Dujonar ");
		addVideoItem("vve1NfLE5zQ", "Tomar Name Likhe Dilem | তোমার নামে লিখে দিলেম ", "Shakil Khan & Popy | Borsha Badol ");
		addVideoItem("j9IZ4AZJKtQ", "Dau Dau Tumi Dau | দাও দাও তুমি দাও |  ", "Shakib Khan & Popy | Milu & Baby Naznin | Dujon Dujonar ");
		addVideoItem("_nSy4za9fNY", "O Amar Sathire | ও আমার সাথীরে | Shakib Khan & Popy ", "Andrew Kishore | Hira Chuni Panna ");
		addVideoItem("OVZ-tGGzPGQ", "Premer Kajol | Bangla Movie Song | Shakib Khan  ", "Bangla Movie Song | Shakib Khan | Popy | Cute Love Song ");
		addVideoItem("gQN7AQ2-Qtw", "Ekta Prithibi Amra Dujon | Bangla Movie Song | Shakib Khan ", " Shakib Khan | Popy | Cute Romantic Song ");
		addVideoItem("Ij1sp9j5WAk", "মন দেব কি দেব না | Mon Debo Ki Debo Na ", "Shakib Khan | Popy | Bap Betir Juddho | Bangla Movie Song ");
		addVideoItem("ThYzKBDe5SY", "Tomar Bukeri Vitore | তোমার বুকেরই ভিতরে  ", "Shakil Khan & Popy | Ma Jokhon Bicharok | ");
		addVideoItem("4sC-n25M2OU", "Ruper Jale Porte Hobe | রূপের জালে পরতে হবে ", "| Shakil Khan & Popy | Ei Mon Tomake Dilam ");

		//sakib khan and boby///
		addVideoItem("fJBPThcVhbw", "Dekhe Tor Mayabi Hashi (HD Video Song) | Hero The Superstar ", "  Hero The Superstar (2014) | Shakib Khan & Bobby");
		addVideoItem("w_wrlGUBk14", "Bhalobashi Priyo | Bangla Movie Song | Shakib Khan | Bobby ", "Shakib Khan | Bobby | Adit | Hasib | Kheya | Rajotto ");
		addVideoItem("XmXlAXLYhxQ", "Moner Majhe | Bangla Movie Song | Shakib Khan, Bobby ", "Shakib Khan, Bobby | Hasib, Dola | Adit | Rajotto ");
		addVideoItem("IhNFTiN7fSY", "Bhalobasha Hoye Jay | Shakib Khan | Boby | Atik Hasan | Doly Sayontony  ", " Boby | Atik Hasan | Doly Sayontony | Bangla Movie Song ");
		addVideoItem("WVTFlVFZHcw", "Tomake Bhalobasi | Bangla Movie Song | Shakib Khan, Bobby  ", "Shakib Khan, Bobby | Hasib, Kona | Adit | Rajotto ");
		addVideoItem("5ZCVWxAgGTc", "Rup Dekhei Pagol | Movie Scene | ", " Movie Scene | Shakib Khan | Boby | First Love");
		addVideoItem("pxFCmcRDhQQ", " Tumi Ar Karo Nou | Bangla Movie Song | Shakib Khan | Munmun | Romantic Son", "Tumi Ar Karo Nou | Bangla Movie Song | Shakib Khan | Munmun | Romantic Son ");
		createPlayList("Shakib Khan", R.drawable.vedio_icon);
		//=========================End Of Shakib khan album=================================================



		//=============================Apu Bissashhh Movie Song================================================
		//=====================================================================================================
		addVideoItem("umxws5znuYY", "Amar Jibon Naye | আমার জীবন নায়ে বন্ধু  ", " Shakib Khan & Apu Biswas | Tumi Shopno Tumi Sadhona");
		addVideoItem("j1tN8arx4pI", "Toke Onek Bhalobashi - Love Marriage ", "Movie Song | Shakib Khan, Apu Biswas ");
		addVideoItem("Yz14YYnbioE", "Love Marriage: Title Song | Movie Song  ", "Movie Song | Shakib Khan, Apu Biswas ");
		addVideoItem("nOP39RST7jM", "Panku Jamai Title Song | Shakib Khan  ", "Shakib Khan | Apu Biswas | Panku Jamai Bengali Movie 2018 ");
		addVideoItem("XRC2ln69hZU", "Neel Neel Nilanjona | নীল নীল নীলাঞ্জনা | HD  ", "Shakib Khan & Apu Biswas | Asif | Tumi Amar Prem ");
		addVideoItem("qVakmrWr94c", "Dekhle Tore Monta | দেখলে তোরে মনটা বলে  ", "Shakib Khan & Apu Biswas | Daring Lover ");
		addVideoItem("Mjzi7-lSPQE", "Jaan Kurban | জান কুরবান | S.I.Tutul | Kanok Chapa ", "S.I.Tutul | Kanok Chapa | Shakib Khan | Apu Biswas ");
		addVideoItem("Jgl5m5mlfxs", " Karo Preme | কারো প্রেমে | Doly Sayontoni |", " Doly Sayontoni | Shakib Khan | Apu | Jaan Kurban | Bangla Movie");
		addVideoItem("zEbWTdBWo6A", "O Praner Raja | RAJA 420 | Shakib Khan | ApuBiswash ", "Shakib Khan | ApuBiswash | Uttam Akash | Raja 420 Bangla Movie ");
		addVideoItem("SmiDJpqYUT4", "Bhalobashar Prithibita Kokhon | ভালবাসার পৃথিবীটা কখন ", " Shakib Khan & Apu Biswas | Top Hero ");
		addVideoItem("HQiyPU_lg-k", "Koti Koti | কোটি কোটি মানুষের | HD | Shakib Khan & Apu Biswas  ", "Shakib Khan & Apu Biswas | Amar Buker Moddhikhane  ");
		addVideoItem("wPxzUSPLfNU", "Bhalobasha Ontobihin | ভালোবাসা অন্তবিহীন | ", "Shakib Khan & Apu Biswas | Koti Takar Kabin | ");
		addVideoItem("n0d1KoBwCWk", "O Premi | ও প্রেমী ও প্রেমী | HD | ", "  Shakib Khan & Apu Biswas | S.I. Tutul & Doly ");
		addVideoItem("GFPB5bsy3Xw", " Chainare Jomidari | চাইনারে জমিদারী ", " S I Tutul | Rizia | Shakib Khan | Apu | Bangla Movie Song ");
		addVideoItem("pV5puNPChuE", "Dhum Ta Na | ধুম তা না | ", "| Apu Biswas & Rumana | Preme Porechi ");
		addVideoItem("9qJoyvHpCQs", "Ek Bindu Bhalobasha | এক বিন্দু ভালোবাসা দাও ", " Shakib Khan & Apu Biswas | Mone Prane Acho Tumi ");
		addVideoItem("8PNwI1QfOnk", "Tukro Tukro Kore | টুকরো টুকরো করে দেখো ", "Shakib Khan & Apu Biswas | Bolona Kobul  ");
		addVideoItem("X_yxXEaE0DI", "Raatbhor - Imran | SAMRAAT: The King Is Here ", "Video Song | Shakib Khan | Apu Biswas ");
		addVideoItem("CXFMEKjcXmI", "Amar Buker Bhetor | আমার বুকের ভেতর | HD ", "Shakib Khan & Apu Biswas | Sontan Amar Ohongkar  ");
		addVideoItem("_uOkmSdOnz4", "Tumi Je Amar Sadhona | Shakib Khan | Apu Biswas ", "Shakib Khan | Apu Biswas | Ziddi Mama Movie Song ");
		addVideoItem("AJIL-3adzzM", "Amar Moneri Ghore | আমার মনেরই ঘরে ", "Shakib Khan & Apu Biswas | Moner Ghore Bosot Kore ");
		addVideoItem("j0cL8rpLZVU", "Mon Churi Chara | মন চুরি ছাড়া কাজ নেই  ", "Shakib Khan & Apu Biswas | Takar Cheye Prem Boro ");
		addVideoItem("_XNMmBBOCZw", "Emon Jodi Hoto - Andrew Kishore and Konok Chapa ", "Kothin Protishodh | Shakib Khan | Apu Biswas ");
		addVideoItem("Bk-9KICa67c", "Ami Chilam Eka | Bangla Movie Song | ", "Shakib Khan, Apu Biswas | PMNB | আমি ছিলাম একা ");
		addVideoItem("zs8TMq5NT_Y", "Eshona Bachi | এসোনা বাঁচি  ", "S.I Tutul | Shakib Khan | Apu Biswas | Jaan Kurban ");
		addVideoItem("B7o_6_q3z6c", "Chupi Chupi Mon Nile Kere | Love Marriage  ", "Movie Song | Shakib Khan, Apu Biswas ");
		addVideoItem("gbmGXKLarRo", "Tumi Janan Janamer | তুমি জনম জনমের সাথী  ", " Shakib Khan & Apu Biswas | Jonom Jonomer Prem");
		addVideoItem("cGKiUD5VA7A", " Monta to Diyechi | Shakib Khan | Apu Biswas | মনটাতো দিয়েছি", " Monta to Diyechi | Shakib Khan | Apu Biswas | মনটাতো দিয়েছি");
		addVideoItem("593ZWOI9gtA", "Alta Dudhe | Shakib Khan | Apu Biswas ", "Alta Dudhe | Shakib Khan | Apu Biswas ");
		addVideoItem("T1w61tQKdLU", "Chokher Dorja Khule | চোখের দরজা খুলে ", "Shakib Khan & Apu Biswas | Preme Porechi ");
		addVideoItem("ewbmAHgJLVg", "Tomari Preme Ami | তোমারই প্রেমে আমি ", " Amin Khan & Apu Biswas | Pitar Ason ");
		addVideoItem("quQ9NiggWdE", "ভালোবাসা এক্সপ্রেস | Shakib Khan | Apu Biswas  ", "Shakib Khan | Apu Biswas | New Bangla Movie Song ");
		addVideoItem("SbLW7bG8zjE", "Kate Nato Ghor | Bangla Movie Song ", " Shakib Khan | Apu Biswas | S.I Tutul ");
		addVideoItem("nwgJPmHkKEY", " I Love You Hero | Shakib Khan | Apu Biswas | ", " Shakib Khan | Apu Biswas | Polash | Tanjina Ruma | Moon  ");
		addVideoItem("DFAcv2hZi4g", " Bhalobehse Eibar Ay Kache Tui - Love Marriage Movie Song ", " Love Marriage Movie Song | Shakib Khan, Apu Biswas ");
		addVideoItem("wWfPqN2Anlo", "Valobashar Hobe Joy | ভালোবাসার হবে জয়  ", " S.I Tutul | Shakib Khan | Apu Biswas | Bangla Movie Song ");
		addVideoItem("PYSfV63V5LA", "Chupi Chupi Mon | ft Shakib Khan | Apu Biswas ", "Shakib Khan | Apu Biswas | HD1080p ");
		addVideoItem("ignrINISSjY", "Ore Amar Moyna Pakhi | Bangla Movie Song ", "Bangla Movie Song | Shakib Khan | Amit Hasan | Apu Biswas ");
		addVideoItem("_xDUBw3PxBI", "Shopno Gulo Sotti Holo | Shakib Khan | Apu Biswas ", " Shakib Khan | Apu Biswas | S I Tutul | Mim | Hitman ");
		addVideoItem("vDoYFwjTnro", "Tumi Chile | তুমি ছিলে | Monir Khan  ", "Baby Naznin | Manna | Apu | Ma Babar Shopno  ");
		addVideoItem("f3bAFIrZ2MQ", "Jodi Prithibi Sotti Hoy | Manna | Apu Biswas ", "Manna | Apu Biswas | Machineman | HD Video Song | SIS Media ");
		addVideoItem("NgBF2s2V3yg", "Prem Pakhita Mone Te | Bangla Movie Song | ", "Riaz | Apu Biswas | CD Vision ");
		addVideoItem("q1MGfTiXqpk", "Shuvo Bibaho | Bangla Movie Song ", " Shuvo Bibaho | Riaz, Ferdous, Apu Biswas ");
		createPlayList("Apu Bissash", R.drawable.vedio_icon);
		//============================End Apu bissash MOvie song==============================================





		//=========================Manna Movie Song=================================================
		//==========================================================================================
		addVideoItem("jBSVYKhpv-k", "Ammajan Song| Manna & Shabnam | Ayub Bacchu", "Manna & Shabnam | Ayub Bacchu | Ammajan");
		addVideoItem("3ypzTP46Ofg", "Jiboner Golpo ache baki olpo", "Abdul Hadi | Monir Khan | Abida Sultana | Manna | Bangla Movie Song");
		addVideoItem("X0RB9xlau84", "Ashbar Kale Ashlam Eka | আসবার কালে আসলাম একা ", "Manna & Purnima | James | Moner Sathe Juddha ");
		addVideoItem("5JP0Z1YIqGI", "Buk Chin Chin Korche | বুক চিন চিন করছে  ", "Manna & Purnima | Andrew & Doly | Bastab | Anupam ");
		addVideoItem("JFkuGbjgQyE", "Chokher Moni Via- চোখের মনি ভাইয়ারে ", "Bangla Movies | Kibria Films | Full HD ");
		addVideoItem("w88OfbTKnG8", "Abbajaan Abbajaan Song Manna ", "Manna, Razib & Sathi | Biplob | Abbajan");
		addVideoItem("q3QseiEtytQ", "Mayer Ekdhar Dudher Dam | মায়ের একধার দুধের দাম  ", "Manna & Anwara | Khalid Hassan Milu | Bortoman ");
		addVideoItem("r0D5C-54vkw", "Ami Manush Tumi Manush | আমি মানুষ তুমি মানুষ ", "Manna & Eka | Milu & Kanak | Dhor ");
		addVideoItem("AWOUpnlZLP8", "Amake Tumi | আমাকে তুমি ভালোই বাসনা ", "Manna & Purnima | Nazu | Khoto Bikkhoto | Anupam");
		addVideoItem("_TV2pGI_iyU", "Premer Moron 1| manna ", "Asif Akbar | Manna | Nodi | Nosto Jibon | Bangla Movie Song");
		addVideoItem("vNciCDHrnGI", "Ami Ajonmokal || Manna Movie song ", " Manna & Shahnaz | Milu & Kanak Chapa | Jhor");
		addVideoItem("cv-_HnOnv8E", "Tumi Nai Kichu Nai | তুমি নাই কিছু নাই", "Manna & Diti | Khalid Hasan Milu & Kanak Chapa | Loottoraj ");
		addVideoItem("0qhBMxxcums", "Tumi Je Amar | তুমি যে আমার | Manna & Shimla", " Monir Khan & Kanak Chapa | Ashanto Agun");

		//===========Manna And Moushomi=============================================================
		addVideoItem( "DgSRAOssML4", "Major Shaheb | মেজর সাহেব ভালোবাসো আমায় ", "Manna & Moushumi | Major Shaheb | Anupam ");
		addVideoItem("u5lE23SSd0g", "Tomar Premer Jonno || Manna Moushomi ", "Manna & Moushumi | Kumar Bishwajit & Kanak Chapa | Kosto ");
		addVideoItem("TfvVN2bh7aE", "Jane Januk Jogotbashi ", "Manna & Moushumi | Bortoman ");
		addVideoItem("W-TZjelsZ2g", "Mon Tomake | মন তোমাকে ভালোবেসেছে", "Manna & Moushumi | Aghat Palta Aghat ");
		addVideoItem("qDoZP4f2h8s", "O Priyo O Priyojon", "Manna | Moushumi | Voyanok Shonghorsho | Movie Song");
		addVideoItem("Qcd1L3IAokI", "Koto Bhalobashi Ami | কতো ভালোবাসি আমি ", " Manna & Moushumi | Swami Chintai");
		addVideoItem("eiN6QUB2R9I", "Bhalobaste Giye Ami | ভালোবাসতে গিয়ে আমি", "Manna, Shabnur & Mousumi | Dui Bodhu Ek Shami");
		addVideoItem("wXSDPu-Jv_E", "নিশা লাগিলো রে | Nesha Lagilo Re", "Manna | Moushumi | Runa Laila | Kumar Raju | Vondo Baba");
		addVideoItem("dgnCHUJjyHg", "Moner Majhe Tumi | মনের মাঝে তুমি ", "Manna & Moushumi | Andrew & Kanak | Chitar Number One");
		addVideoItem("5QGkxAPUYxQ", "Ei Hridoyer Sada Kagoje | এই হৃদয়ের সাদা কাগজে", "Manna & Moushumi | Kukhato Khuni");
		addVideoItem("-CjP4YYheFc", "Ei Dunia Premer Dunia", "Manna & Moushumi |Andrew & Kanak | Dhakaia Mastan");
		addVideoItem("iZHqlJ5rIGI", "Tubhi Tal Mai Bhi Tal", "Manna & Moushumi | Kanak Chapa | Bortoman");
		addVideoItem("svIu6_Q7yWc", "Duti Monete Holo Jora | দুটি মনেতে হলো জোড়া", "Manna & Moushumi | Dui Bodhu Ek Shami");
		addVideoItem("oT_q6yqKIKI", "Ei Duniate | এই দুনিয়াতে", "Monir Akhonda | Manna | Mousumi | Minister | Bangla Movie Song");
		addVideoItem("VqSKjt0b-7I", "Ononto Prem Tumi daw amake", " Manna & Moushumi | Loottoraj");
		addVideoItem("JhXrmTOrS1I", "Ronger Manushre | রঙের মানুষরে ", "Sabina Yesmin | Manna | Mousumi | Shabnur | Bangla Movie Song");
		addVideoItem("xwuaSm8XaIA", "Chiro Sathi | Bangla Movie Song ", " Manna | Moushumi | Love Song");
		addVideoItem("Tf07sBNqL_o", "Tumi Chara Duniyate | তুমি ছাড়া দুনিয়াতে কে আমার", " Manna&Moushumi | Monir Khan | Konok Chapa");
		addVideoItem("fbqSBwwwYZY", "Tomay Dekhlei Amar | তোমায় দেখলেই আমার", "Manna & Moushumi | Kanak Chapa | Kosto");
		addVideoItem("6ecGOHQfFhg", "Tumi Chara Nei Bhabna | Bangla Movie Song", " Manna | Moushumi | Love Song");
		addVideoItem("DgSRAOssML4", "Major Shaheb | মেজর সাহেব ভালোবাসো আমায় ", " Manna & Moushumi | Major Shaheb | Anupam");
		addVideoItem("Qcd1L3IAokI", "Koto Bhalobashi Ami | কতো ভালোবাসি আমি", "Manna & Moushumi | Swami Chintai");
		addVideoItem("dgnCHUJjyHg", "Moner Majhe Tumi | মনের মাঝে তুমি", "Manna & Moushumi | Andrew & Kanak | Chitar Number One");
		//======================End Moushomi=======================================================


		addVideoItem("6EgGb77iBY0", "Kangal Hoile Bhobe", "Manna | S. D. Rubel | Dhor");
		addVideoItem("r0D5C-54vkw", "Ami Manush Tumi Manush | আমি মানুষ তুমি মানুষ ", "Manna & Eka | Milu & Kanak | Dhor");
		addVideoItem("leyVIYEJ_BQ", "Ami Etoboro Duniyate | আমি এতবড় দুনিয়াতে", "Manna & Eka | Ayub Bachu & Kanak Chapa | Dhor");
		addVideoItem("IBZr4TUbhJ4", "Dorja Nore Janla Nore | দরজা নড়ে জানলা নড়ে", "Rubel, Moushumi & Antora | Runa Laila | Sukher Ashay");
		addVideoItem("7M6aHnHY09k", "Dosh Mash Dosh Din | দশ মাস দশ দিন", "| Manna | James | Kosto");
		addVideoItem("by5Y-ZtKPug", "Ami Jonmo Thekei Jolchi ", "Manna & Shabnur | Akbor | Kothin Purush");
		addVideoItem("czf6tra4uSE", "Jibone Chaina Kichu | জীবনে চাইনা কিছু", "| Manna & Purnima | Moner Sathe Juddha");
		addVideoItem("chdMmX23k24", "Kokhono Ki Cheyechile | কখনও কি চেয়েছিলে", "Manna & Purnima | Samina & Asif | Bap Betar Lorai");
		addVideoItem("ndXMG5k21Go", "Mon Tomari Kotha Bole | মন তোমারই কথা বলে", " Manna & Purnima | Andrew & Kanak | Bap Betar Lorai");
		addVideoItem("AKaNtI16O_s", "Ei Prithibir Shuru | এই পৃথিবীর শুরু", " Manna & Purnima | Kumar Bishwajit & Kanak Chapa | Baba");
		addVideoItem("aZslp0UqvTg", "Pagol Korecho Tumi | পাগল করেছো তুমি", "Manna & Purnima | Moner Sathe Juddha");
		addVideoItem("FsY0rUvnikk", "Madhuri Tumi Amari | মাধুরী তুমি আমারই", "Manna & Purnima | Monir Khan & Anima | Bastab");
		addVideoItem("94mfY4pDbiM", "Tomar Buke Bari | তোমার বুকে বাড়ি", "Manna & Purnima | Monir Khan & Baby | Khoto Bikkhoto");
		addVideoItem("mldUcis1zaA", "Aj Mon Ferari | আজ মন ফেরারী |", "Manna & Purnima | Shami Strir Juddho");
		addVideoItem("y8rv67k3XCo", "Ami Tomake Chai | ft Manna , Moushumi", "Kumar Bishwajit, Sonia & Hoimonti | Shotru Shotru Khela");
		addVideoItem("P_lDjdThW8w", "Kokhono Ki Cheyechile ", "Manna , Purnima | by Asif Akbar & Samina Chowdhury | Baap Betar Lorai");
		addVideoItem("Y9wDR4kAVj4", "Shundor Sondhay ", "Manna & Champa | Runa, Andrew & Hadi | Shes Khela | Anupam");
		addVideoItem("KBtYKfQEq40", "Tumi Ki Jadu Jano | তুমি কি যাদু জানো", "Manna & Purnima | Baby Naznin & Monir Khan | Ulta Palta");
		addVideoItem("hp560xtj7xU", "Bondhu Rongila", "Manna , Purnima | by Kumar Bishwajit & Doli Shayontoni");
		addVideoItem("txkPL7ETMk0", "Beiccha Dimu song", "Purnima & Amin Khan | Mukhomukhi");
		addVideoItem("80Ehkrojj4U", "Choto Choto Asha | ছোট ছোট আশা |", "Purnima | Manna | Bangla movie song | SIS Media");
		addVideoItem("hVI2Fn9zhSQ", "Phool Dekhle Icche Kore chuye dite", "Manna & Purnima | Doly & Palash | Ulta Palta");
		addVideoItem("SJ9TYSzU4PI", "Valobashi Sokale | Manna | Purnima", " Manna | Purnima | Bangla Movie Song | Dafon");
		addVideoItem("X0RB9xlau84", "Ashbar Kale Ashlam Eka | আসবার কালে আসলাম একা", "Manna & Purnima | James | Moner Sathe Juddha");
		addVideoItem("g2ewyo8c22g", "Bachinare Bachinare | বাঁচিনারে বাঁচিনারে", "Manna & Purnima | Asif & Rizia Parvin | Dhongsho");
		addVideoItem("v_R8qxxB43A", "Eshona Ogo Sona (এসোন ওগো সোনা)", "Bangla Song | Manna & Purnima");
		addVideoItem("ZRO9bwzdPKk", "Tumi Amar | Bangla Movie Song ", "Manna | Moushumi | Romantic Song");

		//=============pppoppyyy and mannaa=========================================================
		addVideoItem("KOoKz3Rx_RY", "Tumi Dekecho | তুমি ডেকেছো তাই এসেছি", "Manna & Popy | Monir Khan & Kanak Chapa | Gono");
		addVideoItem("IjhSJDLj1Gs", "Amar Buker | আমার বুকের সিংহাসনে ", "Manna & Popy | Kumar Bishwajit & Ankhi | Gono Dushmon");
		addVideoItem("a5CZp5DdeFo", "Ami Tomar Bodhu Tumi Amar ", " Manna , Popy | by Monir Khan & Kanak Chapa | Kothin Simar");
		addVideoItem("ZIa7x4vaoDI", "Aro Agey Keno Tumi | আরো আগে কেন তুমি ", " Manna & Popy | Ayub Bacchu & Kanak | Lal Badsha");
		addVideoItem("y9JnTH6_zBg", "Ashe Pashe Ache | আশে পাশে আছে", "Manna, Popy & Shakib Khan | Anima & Komol | City Terror");
		addVideoItem("DcS0cPk8aWA", "Ontore Lekha Jar Nam | অন্তরে লেখা যার নাম", " Manna & Popy | Lal Badsha");
		addVideoItem("iLvSlXL18CQ", "Tomake Bhalobese Bachbo | তোমাকে ভালবেসে বাঁচবো", "Manna & Popy | Lal Badsha");
		addVideoItem("0UJpXELDGJ0", "Ogo Ma | ওগো মা আমার জন্মভূমি মা", "Manna & Popy | Monir Khan | Gono Dushmon");
		addVideoItem("yKJHdJtfI60", "Ei Balobashar Jelkhanate | এই ভালোবাসার জেলখানাতে", "Manna & Popy | Ke Amar Baba");
		addVideoItem("vpaw5OW487k", "Ei Shite Amar | এই শীতে আমার", "Manna & Popy | Momtaz & Monir Khan | Goriber Dada | Anupam");
		addVideoItem("Bq-25OeUGEY", "Moner Bhitore Mon | মনের ভিতরে তুমি", "Manna & Popy | Ayub Bacchu & Kanak | Lal Badsha");
		addVideoItem("wowFWx5kZjE", "Tomake Chai | তোমাকে চাই ", "Bangla Movie Song | Manna | Popy");
		addVideoItem("fhZ6dR6fcPg", "Jibon Bole Peyechi Ami | জীবন বলে পেয়েছি আমি", " Manna & Popy | Kanak Chapa & Agun | City Terror");
		addVideoItem("r_u3gZKICdY", "এতদিন একা ছিলো মনটা | Manna", "Popy | Khalid Hasan Milu | Kanak Chapa | Teji Sontan");
		addVideoItem("jhYSyGo7e7k", "Rat Nirala- রাত নিরালা | মান্ন-পপি Bangla Movies", "Kibria Films | Full HD");
		addVideoItem("Xe7U9HmE6x0", "Amar Mone Tumi | Bangla Movie Song", "Bangla Movie Song | Manna | Popy | Love Song");
		addVideoItem("vPrK_CIZiEU", "Kono Din Hoio Nako Por | কোনদিন হইয়ো নাকো পর", "Manna & Champa | Moha Sommelon | Anupam");
		addVideoItem("o5wUIUf1m6U", "Tumi Amar Chiroshathi | তুমি আমার চিরসাথী", "Manna & Champa | Kashem Malar Prem | Anupam");
		addVideoItem("noQm2j2qZXM", "Bhalobasha Etota Dami | Bangla Movie Song", "Manna | Rituparna Sengupta");
		addVideoItem("9TddESVbycI", "Asha Bhalobasha | আশা ভালবাসা", "Manna & Rituparna | Shesh Bongshodhor");

		//==============Shabnur and Manna==========================
		addVideoItem("fG3iH73Ohjc", "Bhalobashar Majhe Duti | ভালবাসার মাঝে দু'টি", "Manna & Shabnur | Kanak Chapa & Asif | Kothin Purush");
		addVideoItem("OkQSk7BJUxo", "Hridoyta Hoye Gelo | হৃদয়টা হয়ে গেল চুরি", " Manna & Shabnur| Shami Strir Juddho");
		addVideoItem("dYofIVICxWM", "Protiti second, Protiti Minute", "Manna & Shabnur | Dui Bodhu Ek Shami");
		addVideoItem("ijb5jmkEr3U", "Amar Manob Jomin | আমার মানব জমিন ", " Manna & Shabnur | Somajke Bodle Daw");
		addVideoItem("oPWmbd8Lakw", "Chinechi Tomare | চিনেছি তোমারে |", "Manna & Shabnur | Runa & Andrew | Jibon Ek Songhorsho");
		addVideoItem("BevXBNN21Yo", "Chinechi Tomare | চিনেছি তোমারে | Manna | Shabnur", " Andrew Kishore | Kanak Chapa | Bangla Movie Song");
		addVideoItem("6kDALNv-wM4", "Areo Bibijan | আরেও বিবিজান | Manna & Shabnur", "Manna & Shabnur | Andrew Kishore & Kanak Chapa | Somajke Bodle Daw");
		addVideoItem("vhurM_WNfxE", "Jibonta Chilo Shunno (জীবনটা ছিল শুন্য) ", " Bangla Song | Manna & Shabnur | A Desh Kar |SB Entertainment");
		addVideoItem("0wCVYpoXnE8", "Noniro Putul | ননীরও পুতুল ", " Manna & Shabnur | Andrew & Kanak | Jibon Ek Songhorsho");
		addVideoItem("FyiSX-gT72c", "Shabnur Bangla Romantic Song l Bangla Film Hit Song ", " Bangla Film Hit Song l Manna Movie Song l Mone Agun l Full Movie Song");
		addVideoItem("ijb5jmkEr3U", "Amar Manob Jomin | আমার মানব জমিন ", " Manna & Shabnur | Somajke Bodle Daw");
		addVideoItem("TF8b9fay5jw", "Ronger Manushre", "Mousumi | Shabnur | Kanak Chapa | Bangla New Movie Song 2019");
		addVideoItem("6kDALNv-wM4", "Areo Bibijan | আরেও বিবিজান", "Manna & Shabnur | Andrew Kishore & Kanak Chapa | Somajke Bodle Daw");
		addVideoItem("vKnwLlMYHvI", "Ei Mone Premer Jala", "Manna & Nasrin | S. I. Tutul & Anima | Villain");
		addVideoItem("Yclr6NIOSeQ", "Achere Ache Dil Khola | আছেরে আছে দিল খোলা ", "Manna & Nasrin | Kothin Purush");
		addVideoItem("dYDZUajFscA", "Amar Ontorer Manush Tumi | Bangla Movie Song", "| Manna | Nasrin | Romantic Song");
		addVideoItem("R7YUDAtUv2E", "Cholona | Bangla Movie Song", "Bangla Movie Song | Manna | Dipjol | Nasrin");
		addVideoItem("vfTPdbTcBsc", "Premer Jamuna | Bangla Movie Song", " Manna | Nasrin | Item Song");
		addVideoItem("bNezb5nkYfw", "Mon Preme Porisna", "Nasrin & Manna | Doly Sayontoni | Kukhato Khuni");
		addVideoItem("nSNF0rQUeD0", "Tomake Bhalobeshe | তোমাকে ভালবেসে", "Manna & Shahnaz | Ayub Bacchu & Kanak Chapa |Shanto Keno Mastan");
		addVideoItem("lSeHblQJlVY", "লোকে বলে আমার ঘরে নাকি চাঁদ উঠেছে", "Manna | Shahnaz | Lathi | Bangla Movie Song");
		addVideoItem("ifomiiZz6rw", "Hay Hay Hay Hoye Gelo Ki | হায় হায় হায় হয়ে গেল কি", "| Manna & Shahnaz | Gunda Number One");
		addVideoItem("ITpaS0WKVBI", "Chol Dujone Kori", "| DIpjol & Shahnaz | Biplob & Bipasha | Major Shaheb");
		addVideoItem("JkaQitmBb2Y", "Amar Prem Jalay", " Manna & Shahnaz | Andrew & Rizia | Lathi");
		addVideoItem("7OyrjQoAYDo", "Amar premer jalai ongo jole reee", "Manna | Shahnaz | Lathi | Bangla Movie Song");
		addVideoItem("rkLJGOuSsSU", "Amar Moner Tala Tui Khule De | Manna | Shahanaz", " Manna | Shahanaz | Ruti | Bangla Movie Song");
		addVideoItem("V_Tub_eNrK8", "Loke Bole Amar | লোকে বলে আমার ঘরে", "Manna & Shahnaz | Andrew & Runa | Lathi | Anupam");
		addVideoItem("LQzIqf3VdL0", "Jiboner Cheye Tumi | জীবনের চেয়ে তুমি", "Manna & Shahnaz | Milu & Doly Sayantoni | Shanto Keno Mastan");
		addVideoItem("_1k_a6XBEbk", "Thako Bondhu Tumi Amar Buke ", "Manna & Shahnaz | Mayer Kosom");
		addVideoItem("cv-_HnOnv8E", "Tumi Nai Kichu Nai | তুমি নাই কিছু নাই ", "Manna & Diti | Khalid Hasan Milu & Kanak Chapa | Loottoraj");
		addVideoItem("vzEIPkmQAI8", "Amar Jibon Kahini | আমার জীবন কাহিনী", "Bengali Movie Hit Song | Manna | Diti");
		addVideoItem("7fJN4nvCaF8", "Ami Nolok Hobo | আমি নোলক হবো", " Manna & Diti | Kanak Chapa & Agun | Loottoraj");
		addVideoItem("RsmABTGzMIc", "Choto Choto Asha | Bangla Movie Song", " Bangla Movie Song | Manna | Purnima | Full Video Song");
		addVideoItem("Z-psNxQcjQc", "Ajke Khaichi Go | আজকে খাইছি গো ", " Bangla Movie Song | Manna | Diti");
		addVideoItem("crptgUoJ-AI", "Shokti Shokti Mohashokti", "Manna, Diti, Rubel, Shilpi & Razib | Mukti Chai");
		addVideoItem("HT56uY4iJVg", "Jetuku Somoy | যেটুকু সময় তুমি থাকো কাছে ", " Manna & Poly | Andrew & Kanak | Fire | Anupam");
		addVideoItem("3ypzTP46Ofg", "Jiboner Golpo ache baki olpo", "Abdul Hadi | Monir Khan | Abida Sultana | Manna | Bangla Movie Song");
		addVideoItem("GuyhQC9yl1I", "Ei Jogot Shongshare | এই জগত সংসারে", "Manna & Eka | Ayub Bacchu & Kanak Chapa | Tejee");
		addVideoItem("ulSe3aBPuik", "Bristite Jao Bhije", " Manna & Popy | Runa Laila & Andrew Kishore | Ke Amar Baba");
		addVideoItem("vPrK_CIZiEU", "Kono Din Hoio Nako Por | কোনদিন হইয়ো নাকো পর", "Manna & Champa | Moha Sommelon | Anupam");
		addVideoItem("1rk_M2OuHLg", "Tumi Amar Asha | তুমি আমার আশা | Manna & Champa", "Sabina Yasmin & Andrew Kishore | Andho Prem");
		addVideoItem("3CmAYxwkPOo", "Vulbona Vulbona Bondhu ", "Manna & Champa | Kashem Malar Prem");
		addVideoItem("lraGNp5sz90", "Je Banailo Tomare | যে বানাইলো তোমারে", "Manna & Champa | Runa Laila & Andrew Kishore | Shes Khela");
		addVideoItem("7YpCiodVsCw", "Ami Tomar Preme Deewana", "Manna, Champa | Babar Adesh");
		addVideoItem("YpYiRlKVK4M", "Kache Ele Jibon Pai | কাছে এলে জীবন পাই |", "Manna & Champa | Sabina & Andrew | Shes Khela");
		addVideoItem("-Ds2LOcanHM", "Sholo Theke Sotero | ষোলো থেকে সতেরো", "Shanaz & Amit Hassan | Babul Supriyo & Sadhana | Attotyag");
		addVideoItem("vpGn5jMj3JM", "Jani Prithibita Ekdin", " Manna & Champa | by Andrew Kishore & Sabina Yasmin | Shesh Songram");
		addVideoItem("vJUWM_jtKGM", "Ke Tumi Bolo Mayabini | ft Manna & Champa", " Andrew Kishore & Runa Laila | Shesh Songram");
		addVideoItem("HKgOMxZ_XvY", "Moner Bhitor | মনের ভিতর আছে ", "Manna & Keya | Kumar Biswajit & Kanak | Rongbaz Badsha ");
		addVideoItem("yMhV6qV4ssQ", "Bolo Bhalobasho | বলো ভালবাসো ", " Manna & Munmun | Andrew Kishore & Doly Sayontoni | Danob");
		createPlayList("Manna", R.drawable.vedio_icon);
		//==========================================================================







		//===============Moushomi Movie song===========================================================
		//=============================================================================================
		addVideoItem("MpF27GXGFXQ", "Khairun Lo | খায়রুন লো | Moushumi ", "Momtaz | Polash | Khairun Sundori | Bangla Movie Song");
		addVideoItem("Hu33dx0e6jM", "Sobar jibone Prem Ase", " Andrew & Rizia | Moushumi & Ilias Kanchan | Vangchur");
		addVideoItem("ucwtEjNw2IM", "Lal Sarite Ei Barite || Shakib Khan || Moushumi ", "Shakib Khan || Moushumi || Konok Chapa || Asif || Bangla Movie Song");
		addVideoItem("v_KvGegak6s", "E Jibon Tomake | এ জীবন তোমাকে দিলাম", "Moushumi & Iliash Kanchan | Kumar Shanu & Mitali | Attotyag");
		addVideoItem("TTz-ieBPfWg", "Charidike Shudhu Tumi", "Moushumi & Amit Hassan | Moushumi");
		addVideoItem("zM2GWaUJauk", "Elo Boshonto Amar", " Omor Sani & Moushumi | Andrew | Harano Prem | Anupam");
		addVideoItem("yM2PmyHfbhU", "Prem Hoye Gelo", "Manna | Mousumi | Asif Akbar | Ora Voyonkor | Bangla Movie ");
		addVideoItem("kOgn-fXKK58", "Vije Geche Ongo ", " Moushumi & Rubel | By Runa Laila & Andrew Kishore");
		addVideoItem("lgwDGpAnwu0", "Somoy Hoyeche Fire Jawor", " Moushumi & Ilias Kanchan | Sabina Yasmin | Adorer Santan");
		addVideoItem("RRQO1gAt_zY", "Nai Nai Sara Deshe Nai | নাই নাই সারা দেশে নাই", "Omor Sani & Mousumi | Bangla Movie Song");
		addVideoItem("wLyc_q77CqQ", "Tomar Moto Emon Manush - | Bangla Movie Song |", "Bangla Movie Song | Dulabhai Jindabad | Dipjol, Moushumi");
		addVideoItem("vCA94GWKbjQ", "Je Jibone Tumi Chile NA, Bangla movie songs, ", " ilias kanchon, mousumi romantic songs,");
		addVideoItem("abxoyryn2Og", "Kalto Chilam Valo | কালতো ছিলাম ভালো", "Salman Shah & Moushumi | Runa Laila | Antore Antore");
		addVideoItem("iJnnJm7gv7Y", "Amar Jibon Tumi | আমার জীবন তুমি", " Moushumi & Iliash Kanchan | Andrew & Kanak |Ondho Bhalobasha");
		addVideoItem("AaU1YRs5pVQ", "Amar Ekdike Prithibi | আমার একদিকে পৃথিবী", "Omor Sani & Moushumi | Atto Ahankar");
		addVideoItem("g6Xc744nBYg", "Tumi Chole Jeona | তুমি চলে যেওনা", "Omor Sani & Moushumi | Atto Ahankar");
		addVideoItem("6E4lRR-I6WA", "Ekhane Dujone Nirjone | এখানে দু'জনে নিরজনে", " Salman Shah & Moushumi | Runa & Andrew | Antore Antore");
		addVideoItem("J5xtVfow_NA", "Ki jadu korila | কি যাদু করিলা | HD |Moushumi & Shakil khan", "Moushumi & Shakil khan | Andrew & Dolly | Moger Mulluk | Anupam");
		addVideoItem("_o-mjOE5pZA", "Tumi Chara Duniyate | তুমি ছাড়া দুনিয়াতে", " Manna & Moushumi | Monir Khan & Kanak | Ali Baba");
		addVideoItem("fq-w7mhUz6g", "Ore Sampanwala || ওরে সাম্পানওয়ালা ", "Ferdous || Mousumi || Sonia || Rajib || Bangla Movie Song");
		addVideoItem("Ui0JL8IqrU8", "Eto Bhalobesho Na Amy | এতো ভালোবেসো না আমায়", " | Ferdous | Moushumi | Miss Diana");
		addVideoItem("kK94mFMFC28", "Eto Bhalobashay Jorale Amay | এতো ভালোবাসায় জড়ালে আমায়", "Moushumi & Shakil khan | Biyen Shab");
		addVideoItem("ITUQMMkzmiE", "Tui Jodi Amar | তুই যদি আমার হইতিরে | Shakib Khan & Moushumi", "Shakib Khan & Moushumi | Monir Khan | Tui Jodi Amar Hoitire");
		addVideoItem("zprsCQF9LDU", "Premer Shikol Daona | প্রেমের শিকল দাওনা ", "Moushumi & Rubel | Kanak Chapa | Sukher Ashay");
		addVideoItem("m74ZTXJWW60", "Dhaka Shohor Kina Dimu | Humayun Faridi | Mousumi ", "Humayun Faridi | Mousumi | Runa Laila | Syed Abdul Hadi | Bangla Movie Song");
		addVideoItem("V3dkT8iRkLg", "Tomar Amar Prem |", "Amin Khan & Moushumi |Kanak & Ayub Bacchu | Ammajan| Anupam");
		addVideoItem("wpkwoAzikSE", "Koto Valobasi Ami Tomake | কত ভালোবাসি আমি তোমাকে", "Rubel | Mousumi | Bangla Movie Song");
		addVideoItem("vGCPpkKDSrM", "Ami Tomar Ke | আমি তোমার কে", "Manna & Moushumi | Dui Bodhu Ek Shami");
		addVideoItem("yj6gGlfj1Pk", "Tumi Ami Prithibite Eshe । তুমি আমি পৃথিবীতে এসে", " Manna & Mousumi । Kanak & Andrew । Kala Kafon");
		addVideoItem("7ROWtrhGRJI", "Shono Go Ruposhi Konna Go | Mousumi | Ferdous", "Mousumi | Ferdous | Andrew Kishore | Samina Chowdhury | Banglar Bou");
		addVideoItem("-9FmUJznsQI", "Ami Hoilam Priter Ghari | আমি হইলাম পিরীতের গাড়ি", "Moushumi & Manna | Loottoraj");
		addVideoItem("gJdqOw7DbHM", "Mone Rekho Prithibi | ft Ilias Kanchan , Moushumi", " Ilias Kanchan , Moushumi | by Khalid Hassan Milu , Kanak Chapa");
		addVideoItem("RhnHx0n2NT4", "Moner Manush Pailam Re | Ferdous | Mousumi", "Ferdous | Mousumi | Khairun Sundori | Bangla Movie Song");
		addVideoItem("sRGCpPIBFEw", "Tumi Je Kokhon Ese | তুমি যে কখন এসে ", " Moushumi & Omor Sani | Andrew & Sabina | Lozza");
		addVideoItem("B2nyv3RbRZk", "O Sasuri O Amma Jan ", " Mousumi | Rina Khan | Momtaz | Banglar Bou");
		addVideoItem("33zImZQoDSQ", "Tumi Jonmo Tumi Mritu", " Manna | Moushumi | Video Song | Kritanjoli");
		addVideoItem("YCSP3l0x4Q8", "Ki Darun Dekhte | কি দারুণ দেখতে", " Moushumi & Shakil khan | Ayub Bachu & Moushumi | Moger Mulluk");
		addVideoItem("t7BBCg8Ks9w", "Se Je Keno Elona | সে যে কেন এলো না ", "Moushumi | Sabina Yasmin | Rongin Rangbaz | Anupam");
		addVideoItem("9NO79724sAE", "Tumi Amar Ami Tomar ( তুমি আমার আমি তোমার |", "Moushumi&Ferdous | Golapjan Movie Song");
		addVideoItem("4FTz5LpwuNk", "Din Duniyar Malik | দীন দুনিয়ার মালিক খোদা |", "Moushumi, Amin Khan & Purnima | Bipodjonok");
		addVideoItem("P_J0CdX_fX4", "Golapjaan-গোলাপজান | Video Jukebox | Moushumi | Ferdous", "Video Jukebox | Moushumi | Ferdous | Six Hit Song Of Golapjan");
		addVideoItem("50LefBqm3RU", "Tomra Kauke Bolona | তোমরা কাউকে বলোনা", "Bangla Movie Song | Humayun Faridi | Mousumi | Bisso Premik");
		addVideoItem("CxTuSY5wk1I", "Ki Rup O Dekhilam । কি রুপ ও দেখিলাম | Ferdous | Mousumi", "Ferdous | Mousumi | Monir Khan | Konok Chapa | Golapjan");
		addVideoItem("-CjP4YYheFc", "Ei Dunia Premer Dunia", "Manna & Moushumi |Andrew & Kanak | Dhakaia Mastan");
		addVideoItem("fbqSBwwwYZY", "Tomay Dekhlei Amar | তোমায় দেখলেই আমার", "Manna & Moushumi | Kanak Chapa | Kosto | Anupam");
		//================Moushomi and ferdous=======================
		addVideoItem("Yzd76UMcps4", "Nitti Nitti Udoy Re Surjo | Ferdous | Mousumi ", "Ferdous | Mousumi | Khairun Sundori | Bangla Movie Song");
		addVideoItem("RhnHx0n2NT4", "Moner Manush Pailam Re | Ferdous | Mousumi ", "Ferdous | Mousumi | Khairun Sundori | Bangla Movie Song");
		addVideoItem("i-5TBKgpbYg", "Kokil Ar Dakis Na | কোকিল আর ডাকিস না |", "Mousumi | Ferdous | Momtaz | Polash | Banglar Bou");
		addVideoItem("-ILe7S6kJtY", "Moner Kotha Na Bujhila Re | ft Ferdous , Mousumi", "Ferdous , Mousumi | by Nowrin | Ore Sampanwala | Bangla Movie Song");
		addVideoItem("-rbZYTatxyw", "পরাণে আর সয়না | Porane Ar Sohena", " Ferdous | Mousumi | Monir Khan | Konok Chapa | Golapjan");
		addVideoItem("gI75QokdAfA", "Mathar Keso Diya Bondhu", "| Ferdous | Mousumi | Polash | Jhuma | Khairun Sundori ");
		addVideoItem("fq2sY9_D7Zo", "আমার গোলাপজান | Amar Golapjan", " Ferdous | Mousumi | Andrew Kishore | Konok Chapa | Golapjan");
		addVideoItem("3ewIrCnoZ5w", "Amar Noyon Jeno | আমার নয়ন যেন ", " Andrew Kishore | Kanak | Mousumi | Ferdous | Bangla Movie Song");
		addVideoItem("LZ-XpLPpx9U", "Matir Kole Gacher Jibon | মাটির কোলে গাছের জীবন", "Moushumi & Ferdous | Moynamotir Songshar");
		addVideoItem("CGnL_pGiR9Q", "Paye Dhoira Koi | পায়ে ধইরা কই | Mousumi | Ferdous ", "Mousumi | Ferdous | Jhuma Khandakar | Khairun Sundori");
		addVideoItem("cK9JvxWklbM", "O Sona Bondhure", "Moushumi & Ferdous | Andrew & Kanak | Sonar Moyna Pakhi");
		addVideoItem("iFHrh-9PbD0", "Porane Ar Shoyna Dukkho | পরাণে আর সয়না দুঃখ", "| Moushumi&Ferdous | Golapjaan Movie Song");
		addVideoItem("2eiU9-9XR3g", "চিঠি লিখেছে বউ আমার | Chithi Likheche Bou Amar ", " Ferdous | Mousumi | Monir Khan | Soniya,Banglar Bou");
		addVideoItem("9NO79724sAE", "Tumi Amar Ami Tomar ( তুমি আমার আমি তোমার)", "Moushumi&Ferdous | Golapjan Movie Song");
		addVideoItem("vxssD60BNbk", "Tomaye Dekhle Bondhu ", "Moushumi & Ferdous | Bangla Movie Song");
		addVideoItem("7ROWtrhGRJI", "Shono Go Ruposhi Konna Go | Mousumi | Ferdous", " Mousumi | Ferdous | Andrew Kishore | Samina Chowdhury | Banglar Bou");
		addVideoItem("vXzBY7VsKSo", "Moynamotir Songsar | ময়নামতির সংসার", "Moushumi & Ferdous | Bangla Full Movie");
		addVideoItem("ra0joLTl_mM", "তুমি আমার আমি তোমার | Tumi Amar Ami Tomar ", "Ferdous | Mousumi | Andrew Kishore,Runa Laila | Golapjan");
		addVideoItem("XU18ZfaruOE", "Tomake Khub Sundor Lagche", "Ferdous | Moushumi | Husband and Wife");
		addVideoItem("cK9JvxWklbM", "O Sona Bondhure", "Moushumi & Ferdous | Andrew & Kanak | Sonar Moyna Pakhi");
		addVideoItem("ZxW63h8ovTM", "Kichu Asha Kichu Valobasha || কিছু আশা কিছু ভালবাসা", " Ferdous || Shabnur");
		//====================end moushomi and ferdous========================
		addVideoItem("lgwDGpAnwu0", "Somoy Hoyeche Fire Jawor | সময় হয়েছে ফিরে ", "Moushumi & Ilias Kanchan | Sabina Yasmin | Adorer Santan");
		addVideoItem("_zLnzvWTlxc", "তুমি না থাকলে কাছে না আসলে | Mousumi ", "| Mousumi | Shakil Khan | Bangla Movie Song | Moger Mulluk");
		addVideoItem("3_8NQh3TWVY", "Ame Kabbo Kore Buke Rekhechi Tomay", " Bangla Movie Song | Riaz | Moushumi | Channel i TV");
		addVideoItem( "DgSRAOssML4", "Major Shaheb | মেজর সাহেব ভালোবাসো আমায় ", "Manna & Moushumi | Major Shaheb | Anupam ");
		addVideoItem("u5lE23SSd0g", "Tomar Premer Jonno || Manna Moushomi ", "Manna & Moushumi | Kumar Bishwajit & Kanak Chapa | Kosto ");
		addVideoItem("TfvVN2bh7aE", "Jane Januk Jogotbashi ", "Manna & Moushumi | Bortoman ");
		addVideoItem("W-TZjelsZ2g", "Mon Tomake | মন তোমাকে ভালোবেসেছে", "Manna & Moushumi | Aghat Palta Aghat ");
		addVideoItem("qDoZP4f2h8s", "O Priyo O Priyojon", "Manna | Moushumi | Voyanok Shonghorsho | Movie Song");
		addVideoItem("Qcd1L3IAokI", "Koto Bhalobashi Ami | কতো ভালোবাসি আমি ", " Manna & Moushumi | Swami Chintai");
		addVideoItem("eiN6QUB2R9I", "Bhalobaste Giye Ami | ভালোবাসতে গিয়ে আমি", "Manna, Shabnur & Mousumi | Dui Bodhu Ek Shami");
		addVideoItem("wXSDPu-Jv_E", "নিশা লাগিলো রে | Nesha Lagilo Re", "Manna | Moushumi | Runa Laila | Kumar Raju | Vondo Baba");
		addVideoItem("dgnCHUJjyHg", "Moner Majhe Tumi | মনের মাঝে তুমি ", "Manna & Moushumi | Andrew & Kanak | Chitar Number One");
		addVideoItem("5QGkxAPUYxQ", "Ei Hridoyer Sada Kagoje | এই হৃদয়ের সাদা কাগজে", "Manna & Moushumi | Kukhato Khuni");
		addVideoItem("-CjP4YYheFc", "Ei Dunia Premer Dunia", "Manna & Moushumi |Andrew & Kanak | Dhakaia Mastan");
		addVideoItem("iZHqlJ5rIGI", "Tubhi Tal Mai Bhi Tal", "Manna & Moushumi | Kanak Chapa | Bortoman");
		addVideoItem("svIu6_Q7yWc", "Duti Monete Holo Jora | দুটি মনেতে হলো জোড়া", "Manna & Moushumi | Dui Bodhu Ek Shami");
		addVideoItem("oT_q6yqKIKI", "Ei Duniate | এই দুনিয়াতে", "Monir Akhonda | Manna | Mousumi | Minister | Bangla Movie Song");
		addVideoItem("VqSKjt0b-7I", "Ononto Prem Tumi daw amake", " Manna & Moushumi | Loottoraj");
		addVideoItem("JhXrmTOrS1I", "Ronger Manushre | রঙের মানুষরে ", "Sabina Yesmin | Manna | Mousumi | Shabnur | Bangla Movie Song");
		addVideoItem("xwuaSm8XaIA", "Chiro Sathi | Bangla Movie Song ", " Manna | Moushumi | Love Song");
		addVideoItem("Tf07sBNqL_o", "Tumi Chara Duniyate | তুমি ছাড়া দুনিয়াতে কে আমার", " Manna&Moushumi | Monir Khan | Konok Chapa");
		addVideoItem("fbqSBwwwYZY", "Tomay Dekhlei Amar | তোমায় দেখলেই আমার", "Manna & Moushumi | Kanak Chapa | Kosto");
		addVideoItem("6ecGOHQfFhg", "Tumi Chara Nei Bhabna | Bangla Movie Song", " Manna | Moushumi | Love Song");
		addVideoItem("DgSRAOssML4", "Major Shaheb | মেজর সাহেব ভালোবাসো আমায় ", " Manna & Moushumi | Major Shaheb | Anupam");
		addVideoItem("Qcd1L3IAokI", "Koto Bhalobashi Ami | কতো ভালোবাসি আমি", "Manna & Moushumi | Swami Chintai");
		addVideoItem("dgnCHUJjyHg", "Moner Majhe Tumi | মনের মাঝে তুমি", "Manna & Moushumi | Andrew & Kanak | Chitar Number One");
		addVideoItem("O6fOlsRxZWI", "O Tor Antore", "Riaz & Shimla | Kanak Chapa & Khalid Hasan Milu | Dhawa");
		addVideoItem("OrcU4ZoY43Q", "Cholte Cholte | চলতে চলতে পথ", "Moushumi & Iliash Kanchan | Runa & Andrew | Golaguli | Anupam");
		addVideoItem("FcSDcCgzvy8", "O Amar Bondhu Go | Salman Shah, Moushumi", "Salman Shah, Moushumi | Agun & Runa Laila ");
		createPlayList("Moushomi", R.drawable.vedio_icon);
		//==========================================================================





		//==================================Ferdous Movie song Album========================================
		//==================================================================================================
		//==================================================================================================
		addVideoItem("ZDNfkeAK3VE", "Sukhe Amar Buk Veshe Jai", "Ferdous, Shabnur | Monir Khan & Kanak Chapa | Sobar Upore Prem ");
		addVideoItem("Dgskb8NLkL4", "Assalamalaikum Biyain Shab | আসসালামালাইকুম বিয়ান সাব ", "Ferdous & Shabnur | Premer Jala ");
		addVideoItem("AgkLTQSkRrc", "Sonali Prantore", "Ferdous || Priyanka || Nachiketa Chakraborty | Hothat Brishti");
		addVideoItem("DtnuII5JpSI", "Bikeler Shes | বিকেলের শেষ আলো", "Ferdous & Priyanka | Kumar Sanu & Kabita | Chupi Chupi");
		addVideoItem("aFiPyt5jCYY", "Moner Manush | মনের মানুষ পাইলামরে ", " Moushumi & Ferdous | Khairun Sundori | Anupam");
		addVideoItem("MApyX6mhgcc", "Kon Kanoner | কোন কাননের ফুল", "Shabnur & Ferdous | Milu & Kanak | Kheya Ghater Majhi | Anupam");
		addVideoItem("2EWWJMHHMAs", "Tomay Chara Amar | তোমায় ছাড়া আমার", " Shabnur & Ferdous | Andrew Kishore & Kanak | Bondhok");
		addVideoItem("Y6ETPBkhlUE", "Pakhire O Pakhire | পাখিরে ও পাখিরে ", " Shabnur & Ferdous | Tumi Boro Bhaggoboti | Anupam");
		addVideoItem("OKhngkRtFDs", "Bhaiyer Shali Biyen Shab | ভাইয়ের শালী বিয়ানসাব ", "Shabnur & Ferdous | Biyen Shab");
		addVideoItem("sKwsKjUp638", "Shonogo Ruposi | শোনগো রূপসী ললনা", "Moushumi & Ferdous | Kanak & Monir | Sonar Moyna Pakhi");
		addVideoItem("L4sAzvORdf0", "Premer Kobor Hoye Jak", "Shabnur & Ferdous | Bhalobashar Juddho | Anupam");
		addVideoItem("VfhkWBNL3lc", "Tomake Bhalobeshe | তোমাকে ভালোবেসে ", "Shabnur, Ferdous & Shanu | Tumi Boro Bhaggoboti | Anupam");
		addVideoItem("HgSPEkNWgPQ", "Jiboner Cheye Boro Prem", "Shabnur & Ferdous | Joto Prem Toto Jala | Anupam");
		addVideoItem("yEpErwTSMTU", "Jamai Hoice | জামাই হইছে | HD | Shabnur & Ferdous", "Shabnur & Ferdous | Momtaz & Polash | Jomela Shundori | Anupam");
		addVideoItem("i-BtXJ6uJh8", "Amar Jibone Tumi | আমার জীবনে তুমি", "Shabnur & Ferdous | Sabina & Monir Khan | Amar Shopno Tumi");
		addVideoItem("0RQPO034OuM", "Bhalobasha Charato | ভালোবাসা ছাড়াতো হয়না", "Shabnur & Ferdous | Joto Prem Toto Jala | Anupam");
		addVideoItem("K6PvHXuz0Dg", "Ogo Aprupa Konna", "Moushumi & Ferdous | Monir Khan & Mimi | Moynamotir Songshar");
		addVideoItem("0RQPO034OuM", "Bhalobasha Charato | ভালোবাসা ছাড়াতো হয়না  ", " Shabnur & Ferdous | Joto Prem Toto Jala");
		addVideoItem("MApyX6mhgcc", "Kon Kanoner | কোন কাননের ফুল  ", "Shabnur & Ferdous | Milu & Kanak | Kheya Ghater Majhi  ");
		addVideoItem("3wtZbD2uxg0", " Purnima Chad | পূর্ণিমা চাঁদ নয়", "Shabnur & Ferdous | Andrew & Sabina | Dui Noyoner Alo ");
		addVideoItem("HgSPEkNWgPQ", "Jiboner Cheye Boro | জীবনের চেয়ে বড় প্রেম ", "Shabnur & Ferdous | Joto Prem Toto Jala ");
		addVideoItem("EpVF8xo08wI", "Bhalobasha Jibone Ekbar  ", "Ferdous, Shabnur | by Andrew Kishore & Kanak Chapa | Sobar Upore Prem ");
		addVideoItem("zNlLVTml5Eo", "Sagorer Motoi Govir | সাগরের মতই গভীর |  ", "  Ferdous & Shabnur | Andrew & Kanak | Premer Jala");
		addVideoItem("i-BtXJ6uJh8", "Amar Jibone Tumi | আমার জীবনে তুমি ", "Shabnur & Ferdous | Sabina & Monir Khan | Amar Shopno Tumi ");
		addVideoItem("Ngsn2uP2P2M", "Gachta Hoilo Shobuj Bondhu | গাছটা হইলো সবুজ বন্ধু ", "Shabnur & Ferdous | Bondhok ");
		addVideoItem("YP8XK3iMikw", "Dhakka Dile Song ", "Shabnur & Ferdous | Mamtaz | Fuler Moto Bou ");
		addVideoItem("cPzXgTYGpYM", "ichu Asha Kichu Bhalobasha ", "Ferdous | Shabnur | Mousumi | Arfin Rumey | Kheya ");
		addVideoItem("m-gb8w-eU5k", "Jiboner Cheye Boro Prem ", " Ferdous | Shabnur | Love Song ");
		addVideoItem("3b-yHNGGveM", "Tomar Bouke Tumi | তোমার বউকে তুমি ", " Shabnur & Ferdous | Sabina Yasmin | Tumi Boro Bhaggoboti ");
		addVideoItem("Y6ETPBkhlUE", "Pakhire O Pakhire | পাখিরে ও পাখিরে ", "Shabnur & Ferdous | Tumi Boro Bhaggoboti ");
		addVideoItem("d0T6BY8hMpQ", "Prothom Premer | প্রথম প্রেমের পরশ ", "Shabnur & Ferdous | Sabina & Monir |Tumi Boro Bhaggoboti ");
		addVideoItem("2ik9v-sFX5c", "Tumi Hobe Bougo | তুমি হবে বউগো ", "Shabnur, Ferdous & Shanu | Tumi Boro Bhaggoboti ");
		addVideoItem("8CJBpzTV7kM", "Ei Modhu Logone | এই মধু লগনে |  ", "Shabnur & Ferdous | Andrew & Kanak | Bostir Meye ");
		addVideoItem("q_evwlYW43w", "Jibone Eshecho | জীবনে এসেছো তুমি ", "Shabnur & Ferdous | Andrew & Kanak | Dilto Pagol ");
		addVideoItem("m6_EMzLahaA", "Tomar Namer Jikir | তোমার নামের জিকির  ", "Shabnur & Ferdous | Kanak Chapa | Premer Jala  ");
		addVideoItem("A598pfniPQo", "O Shami Dhon | ও স্বামী ধন ", "Shabnur & Ferdous | Kanak Chapa | Bondhok ");
		addVideoItem("2EWWJMHHMAs", "Tomay Chara Amar | তোমায় ছাড়া আমার ", "Shabnur & Ferdous | Andrew Kishore & Kanak | Bondhok ");
		addVideoItem("QMuvQt8lljA", "Sonar Boron Holud Amar | সোনার বরণ হলুদ আমার ", "Shabnur & Ferdous | Kanak Chapa | Fuler Moto ");
		addVideoItem("AGnNiCqpDEg", "Kotoi Nidra Jaogo | কতই নিদ্রা যাওগো ", "  Shabnur & Ferdous | Monir Khan & Kanak | Jomela Shundori");
		addVideoItem("AFNsdZxiAXc", "Shokha Aishogo | সখা আইসোগো  ", "Shabnur & Ferdous | Rizia Parvin & Polash | Bondhok ");
		addVideoItem("QMuvQt8lljA", "Sonar Boron Holud Amar | সোনার বরণ হলুদ আমার", "Shabnur & Ferdous | Kanak Chapa | Fuler Moto Bou");
		addVideoItem("T47lGVpDOJc", "Biyar Dhum | Ferdous | Mousumi | Sujun Raja", "Mousumi | Sujun Raja | Reba | Khairun Sundori | Bangla Movie Song");
		addVideoItem("rbA9fVQ6Cx4", "Biday Den Nanigo | বিদায় দেন নানীগো", "| Moushumi & Ferdous | Jhuma Khandakar | Khairun Sundori");
		addVideoItem("F1rAGnZ7tVg", "Anche Debor Bou | আনছে দেবর বউ বানাইয়া", " Shabnur, Ferdous & Shahnaz | Momtaz | Jomela Shundori");
		addVideoItem("AFNsdZxiAXc", "Shokha Aishogo | সখা আইসোগো ", " Shabnur & Ferdous | Rizia Parvin & Polash | Bondhok");
		addVideoItem("q_evwlYW43w", "Jibone Eshecho | জীবনে এসেছো তুমি", "Shabnur & Ferdous | Andrew & Kanak | Dilto Pagol | Anupam");
		addVideoItem("QuBIl_gDvH4", "Tomar Amar Eina | তোমার আমার এইনা", "Shabnur & Ferdous | Andrew & Kanak Chapa | Dilto Pagol");
		addVideoItem("XSdoj5rTFRg", "Kar Kasete Mon Bikaw | কার কাছেতে মন বিকাও", " Ferdous & Modhumita | Churiwala | Anupam");
		addVideoItem("BiiEnF4r5AE", "Tumi Bajale | তুমি বাজালে ও বাঁশিগো", "| Ferdous & Modhumita | Anuradha Paudowal | Churiwala");
		//================Fedous and purnima===================
		addVideoItem("9m3zwZHPJ8Y", "Tomar Preme Porechi ", "Ferdous & Purnima | Bolo Na Bhalobasi | Anupam | HD");
		addVideoItem("nTXKJILzvj0", "Emon Mishti Ekta Bou", "Purnima & Ferdous | Shontan Jokhn Sottru | Anupam");
		addVideoItem("0-gXStoQaYc", "Bhaia Tomar | ভাইয়া তোমার", "Ferdous, Purnima, Kazol & Nasrin | Shontan Jokhon Sottru ");
		addVideoItem("D-lG7xMMkzY", "Ami Prem Chara", "Purnima & Ferdous | Sabina & Andrew | Biplobi Janota");
		addVideoItem("BE2vebDzMnU", "Bhalobashi E Kothati | ভালোবাসি এ কথাটি", "Manna | Shabnur | Purnima | Shami Strir Juddho");
		addVideoItem("Kx8CVadLN60", "Jole Janme Emon Sahos | Janam Janamer Saathi", " Bengali Movie Song | Ferdous, Rituparna");
		addVideoItem("u0I411tuQ-Q", "Akbar Duibar | Janam Janamer Sathi", "Bengali Movie Song | Md. Aziz, Sadhna Sargam");
		addVideoItem("PLK0_CFBe60", "Ami Chilam Aka Aka", " Akritagya | Ferdous | Sreelekha");
		addVideoItem("Zlw6-KZv_cY", "Nithur Bondishala", "Ferdous & Modhumita | Abhijeet & Anupama | Churiwala");
		addVideoItem("DtnuII5JpSI", "Bikeler Shes | বিকেলের শেষ আলো", "Ferdous & Priyanka | Kumar Sanu & Kabita | Chupi Chupi");
		addVideoItem("cc9XVqrHfYI", "Bhalobasha E Jibon | ভালোবাসা এ জীবন", " Shabnur & Ferdous | Andrew & Sabina | Biyen Shab");
		addVideoItem("lgwDGpAnwu0", "Somoy Hoyeche Fire Jawor | সময় হয়েছে ফিরে ", "Moushumi & Ilias Kanchan | Sabina Yasmin | Adorer Santan");
		addVideoItem("_zLnzvWTlxc", "তুমি না থাকলে কাছে না আসলে | Mousumi ", "| Mousumi | Shakil Khan | Bangla Movie Song | Moger Mulluk");
		addVideoItem("3_8NQh3TWVY", "Ame Kabbo Kore Buke Rekhechi Tomay", " Bangla Movie Song | Riaz | Moushumi | Channel i TV");
		addVideoItem( "DgSRAOssML4", "Major Shaheb | মেজর সাহেব ভালোবাসো আমায় ", "Manna & Moushumi | Major Shaheb | Anupam ");
		addVideoItem("u5lE23SSd0g", "Tomar Premer Jonno || Manna Moushomi ", "Manna & Moushumi | Kumar Bishwajit & Kanak Chapa | Kosto ");
		addVideoItem("TfvVN2bh7aE", "Jane Januk Jogotbashi ", "Manna & Moushumi | Bortoman ");
		addVideoItem("W-TZjelsZ2g", "Mon Tomake | মন তোমাকে ভালোবেসেছে", "Manna & Moushumi | Aghat Palta Aghat ");
		addVideoItem("qDoZP4f2h8s", "O Priyo O Priyojon", "Manna | Moushumi | Voyanok Shonghorsho | Movie Song");
		addVideoItem("Qcd1L3IAokI", "Koto Bhalobashi Ami | কতো ভালোবাসি আমি ", " Manna & Moushumi | Swami Chintai");
		addVideoItem("eiN6QUB2R9I", "Bhalobaste Giye Ami | ভালোবাসতে গিয়ে আমি", "Manna, Shabnur & Mousumi | Dui Bodhu Ek Shami");
		addVideoItem("wXSDPu-Jv_E", "নিশা লাগিলো রে | Nesha Lagilo Re", "Manna | Moushumi | Runa Laila | Kumar Raju | Vondo Baba");
		addVideoItem("dgnCHUJjyHg", "Moner Majhe Tumi | মনের মাঝে তুমি ", "Manna & Moushumi | Andrew & Kanak | Chitar Number One");
		addVideoItem("5QGkxAPUYxQ", "Ei Hridoyer Sada Kagoje | এই হৃদয়ের সাদা কাগজে", "Manna & Moushumi | Kukhato Khuni");
		addVideoItem("-CjP4YYheFc", "Ei Dunia Premer Dunia", "Manna & Moushumi |Andrew & Kanak | Dhakaia Mastan");
		addVideoItem("iZHqlJ5rIGI", "Tubhi Tal Mai Bhi Tal", "Manna & Moushumi | Kanak Chapa | Bortoman");
		addVideoItem("svIu6_Q7yWc", "Duti Monete Holo Jora | দুটি মনেতে হলো জোড়া", "Manna & Moushumi | Dui Bodhu Ek Shami");
		addVideoItem("oT_q6yqKIKI", "Ei Duniate | এই দুনিয়াতে", "Monir Akhonda | Manna | Mousumi | Minister | Bangla Movie Song");
		addVideoItem("VqSKjt0b-7I", "Ononto Prem Tumi daw amake", " Manna & Moushumi | Loottoraj");
		addVideoItem("JhXrmTOrS1I", "Ronger Manushre | রঙের মানুষরে ", "Sabina Yesmin | Manna | Mousumi | Shabnur | Bangla Movie Song");
		addVideoItem("xwuaSm8XaIA", "Chiro Sathi | Bangla Movie Song ", " Manna | Moushumi | Love Song");
		addVideoItem("Tf07sBNqL_o", "Tumi Chara Duniyate | তুমি ছাড়া দুনিয়াতে কে আমার", " Manna&Moushumi | Monir Khan | Konok Chapa");
		addVideoItem("fbqSBwwwYZY", "Tomay Dekhlei Amar | তোমায় দেখলেই আমার", "Manna & Moushumi | Kanak Chapa | Kosto");
		addVideoItem("6ecGOHQfFhg", "Tumi Chara Nei Bhabna | Bangla Movie Song", " Manna | Moushumi | Love Song");
		addVideoItem("DgSRAOssML4", "Major Shaheb | মেজর সাহেব ভালোবাসো আমায় ", " Manna & Moushumi | Major Shaheb | Anupam");
		addVideoItem("Qcd1L3IAokI", "Koto Bhalobashi Ami | কতো ভালোবাসি আমি", "Manna & Moushumi | Swami Chintai");
		addVideoItem("dgnCHUJjyHg", "Moner Majhe Tumi | মনের মাঝে তুমি", "Manna & Moushumi | Andrew & Kanak | Chitar Number One");
		addVideoItem("O6fOlsRxZWI", "O Tor Antore", "Riaz & Shimla | Kanak Chapa & Khalid Hasan Milu | Dhawa");
		addVideoItem("OrcU4ZoY43Q", "Cholte Cholte | চলতে চলতে পথ", "Moushumi & Iliash Kanchan | Runa & Andrew | Golaguli | Anupam");
		addVideoItem("FcSDcCgzvy8", "O Amar Bondhu Go | Salman Shah, Moushumi", "Salman Shah, Moushumi | Agun & Runa Laila ");
		//===============popy and ferdous=============================
		addVideoItem("HFm4xdDWOn8", "Jonmota Ekbar", " Popy & Ferdous | Asif & Doly | Karagar | Anupam Movie Songs");
		addVideoItem("8EUz2QUX6k8", "Tomay Peye Shob Peyechi", "Bangla Movie Song | Popy | Ferdous | Monir Khan | Full Video Song");
		addVideoItem("bDMNbahLbLE", "Tui Jodi Hoiti Golar Mala", "Movie Song | Opare Akash, Ferdous, Popy");
		addVideoItem("UYfIvUvex0A", "Shorger Prem Eshe ", " Monir Khan | Kanak | Ferdous | Popy | Bangla Movie Song");
		addVideoItem("d0T6BY8hMpQ", "Prothom Premer porosh dile tumi", "Shabnur & Ferdous | Sabina & Monir |Tumi Boro Bhaggoboti");
		addVideoItem("3b-yHNGGveM", "Tomar Bouke Tumi | তোমার বউকে তুমি", "Shabnur & Ferdous | Sabina Yasmin | Tumi Boro Bhaggoboti");
		addVideoItem("45R8Irma8UI", "Sohorote Jaia Bondhu", "Shabnur & Ferdous | Momtaz & Polash | Jomela Shundori");
		createPlayList("Ferdous", R.drawable.vedio_icon);
		//=============================End Of Fardous Album=============================================

		//=====================Start Popy movie song album=====================================================
		//=====================================================================================================
		//=====================================================================================================
		addVideoItem("-TiuPIBCacw", "Bhalobese Antore , Antore chirotore", "Shakil Khan & Popy | Ei Mon Tomake Dilam");
		addVideoItem("rMPb0ohNXMg", "Tui Bine Mon | তুই বিনে মন মানেনা  ", "Shakib Khan & Popy | Monir Khan & Anima | Jomoj ");
		addVideoItem("2IMbMqT-tas", "Bhalobeshe Faguner Shukh | ভালোবেসে ফাগুনের সুখ  ", "  Shakib Khan & Popy | Andrew & Kanak | Dosshu");
		addVideoItem("oaIQ7VuMg7c", " Sundori O Sundori | সুন্দরী ও সুন্দরী ", " Shakib Khan & Popy | Kanak & Shahin | Gono Dushmon ");
		addVideoItem("SSc1oUwIjrQ", "Mon Bojhona | মন বোঝনা | HD | Shakib Khan, Popy & Nodi  ", "Shakib Khan, Popy & Nodi | Baby Naznin & Anima D Costa  ");
		addVideoItem("Kico5bDQ4Y0", " Tumi Jodi Prithibite Na Aste | তুমি যদি পৃথিবীতে না আসতে", "Shakib Khan & Popy | Hira Chuni Panna ");
		addVideoItem("9SzRwiANqR0", "Amra Shudhu Dujon Dujonar | আমরা শুধু দু'জন দু'জনার ", "Shakib Khan & Popy | Dujon Dujonar ");
		addVideoItem("KtX0M0rP9Ew", "আমার মাঝে নেই তো আমি | Amar Majhe Nei To Ami | ", "Amar Majhe Nei To Ami | Shakib Khan | Popy | Uma Khan, Juari, Movie Song  ");
		addVideoItem("8cVBRFGRxTw", "Roshik Dilwala | রসিক দিলওয়ালা | Shakil Khan & Popy ", "Shakil Khan & Popy | Rizia Parvin | Milon Malar Prem ");
		addVideoItem("a20oaRVTUMA", "Dam Diye Prem Jayna | দাম দিয়ে প্রেম যায়না কেনা ", "Shakil Khan & Popy | Ei Mon Tomake Dilam ");
		addVideoItem("RUYc37GhdjU", "Mon Manena | মন মানেনা কথা শোনেনা ", "Shakib Khan & Poppy | Daku Rani | SB Entertainment ");
		addVideoItem("qw0IY4zio5E", "Jibon Furiye Jabe | জীবন ফুরিয়ে যাবে | Riaz & Popy ", " Riaz & Popy | Andrew & kanak | Bidroho Charidike ");
		addVideoItem("EMdETbRpPJs", "Tui Bine Mon Manena | তুই বিনে মন মানেনা বন্ধু ", " Shakib Khan&Popy | Jomoj Movie Song ");
		addVideoItem("HiZNndW_YQE", "Se ki Asbe | সে কি আসবে  ", "Shakib Khan & Popy | Runa Laila | Dujon Dujonar ");
		addVideoItem("vve1NfLE5zQ", "Tomar Name Likhe Dilem | তোমার নামে লিখে দিলেম ", "Shakil Khan & Popy | Borsha Badol ");
		addVideoItem("j9IZ4AZJKtQ", "Dau Dau Tumi Dau | দাও দাও তুমি দাও |  ", "Shakib Khan & Popy | Milu & Baby Naznin | Dujon Dujonar ");
		addVideoItem("_nSy4za9fNY", "O Amar Sathire | ও আমার সাথীরে | Shakib Khan & Popy ", "Andrew Kishore | Hira Chuni Panna ");
		addVideoItem("OVZ-tGGzPGQ", "Premer Kajol | Bangla Movie Song | Shakib Khan  ", "Bangla Movie Song | Shakib Khan | Popy | Cute Love Song ");
		addVideoItem("gQN7AQ2-Qtw", "Ekta Prithibi Amra Dujon | Bangla Movie Song | Shakib Khan ", " Shakib Khan | Popy | Cute Romantic Song ");
		addVideoItem("Ij1sp9j5WAk", "মন দেব কি দেব না | Mon Debo Ki Debo Na ", "Shakib Khan | Popy | Bap Betir Juddho | Bangla Movie Song ");
		addVideoItem("ThYzKBDe5SY", "Tomar Bukeri Vitore | তোমার বুকেরই ভিতরে  ", "Shakil Khan & Popy | Ma Jokhon Bicharok | ");
		addVideoItem("4sC-n25M2OU", "Ruper Jale Porte Hobe | রূপের জালে পরতে হবে ", "| Shakil Khan & Popy | Ei Mon Tomake Dilam ");
		addVideoItem("KOoKz3Rx_RY", "Tumi Dekecho | তুমি ডেকেছো তাই এসেছি", "Manna & Popy | Monir Khan & Kanak Chapa | Gono");
		addVideoItem("IjhSJDLj1Gs", "Amar Buker | আমার বুকের সিংহাসনে ", "Manna & Popy | Kumar Bishwajit & Ankhi | Gono Dushmon");
		addVideoItem("a5CZp5DdeFo", "Ami Tomar Bodhu Tumi Amar ", " Manna , Popy | by Monir Khan & Kanak Chapa | Kothin Simar");
		addVideoItem("ZIa7x4vaoDI", "Aro Agey Keno Tumi | আরো আগে কেন তুমি ", " Manna & Popy | Ayub Bacchu & Kanak | Lal Badsha");
		addVideoItem("y9JnTH6_zBg", "Ashe Pashe Ache | আশে পাশে আছে", "Manna, Popy & Shakib Khan | Anima & Komol | City Terror");
		addVideoItem("DcS0cPk8aWA", "Ontore Lekha Jar Nam | অন্তরে লেখা যার নাম", " Manna & Popy | Lal Badsha");
		addVideoItem("iLvSlXL18CQ", "Tomake Bhalobese Bachbo | তোমাকে ভালবেসে বাঁচবো", "Manna & Popy | Lal Badsha");
		addVideoItem("0UJpXELDGJ0", "Ogo Ma | ওগো মা আমার জন্মভূমি মা", "Manna & Popy | Monir Khan | Gono Dushmon");
		addVideoItem("yKJHdJtfI60", "Ei Balobashar Jelkhanate | এই ভালোবাসার জেলখানাতে", "Manna & Popy | Ke Amar Baba");
		addVideoItem("vpaw5OW487k", "Ei Shite Amar | এই শীতে আমার", "Manna & Popy | Momtaz & Monir Khan | Goriber Dada | Anupam");
		addVideoItem("Bq-25OeUGEY", "Moner Bhitore Mon | মনের ভিতরে তুমি", "Manna & Popy | Ayub Bacchu & Kanak | Lal Badsha");
		addVideoItem("wowFWx5kZjE", "Tomake Chai | তোমাকে চাই ", "Bangla Movie Song | Manna | Popy");
		addVideoItem("fhZ6dR6fcPg", "Jibon Bole Peyechi Ami | জীবন বলে পেয়েছি আমি", " Manna & Popy | Kanak Chapa & Agun | City Terror");
		addVideoItem("r_u3gZKICdY", "এতদিন একা ছিলো মনটা | Manna", "Popy | Khalid Hasan Milu | Kanak Chapa | Teji Sontan");
		addVideoItem("jhYSyGo7e7k", "Rat Nirala- রাত নিরালা | মান্ন-পপি Bangla Movies", "Kibria Films | Full HD");
		addVideoItem("Xe7U9HmE6x0", "Amar Mone Tumi | Bangla Movie Song", "Bangla Movie Song | Manna | Popy | Love Song");
		addVideoItem("vPrK_CIZiEU", "Kono Din Hoio Nako Por | কোনদিন হইয়ো নাকো পর", "Manna & Champa | Moha Sommelon | Anupam");
		addVideoItem("o5wUIUf1m6U", "Tumi Amar Chiroshathi | তুমি আমার চিরসাথী", "Manna & Champa | Kashem Malar Prem | Anupam");
		addVideoItem("noQm2j2qZXM", "Bhalobasha Etota Dami | Bangla Movie Song", "Manna | Rituparna Sengupta");
		addVideoItem("9TddESVbycI", "Asha Bhalobasha | আশা ভালবাসা", "Manna & Rituparna | Shesh Bongshodhor");
		addVideoItem("klRxXoov6zc", "Tomake Chai (তোমাকে চাই) | Manna | Popy", "Manna | Popy | City Terror Movie Song | Manna Bangla Movie Song's");

		//=======================Popy Nad Shakil Khan movie song=================================================
		addVideoItem("-TiuPIBCacw", "Bhalobese Antore , Antore chirotore", "Shakil Khan & Popy | Ei Mon Tomake Dilam");
		addVideoItem("7GgtI-uGsjo", "E Modhur Borshate | Bangla Movie Song", "Bangla Movie Song | Shakil Khan & Popy | Praner Priyotoma");
		addVideoItem("Gy6VSBgEAMA", "Bhalobeshe Beche Achi | ভালবেসে বেঁচে আছি", "Shakil Khan, Popy & Others | Ei Mon Tomake Dilam");
		addVideoItem("x3BNpi4D_hs", "O Bristir Pani Re", "Bangla Movie Song | Shakil Khan & Popy ");
		addVideoItem("g3VLNiayraU", "Bhalobese Antore | Sad Song ", "Shakil Khan & Popy | Ei Mon Tomake Dilam");
		addVideoItem("Kn3i7_AHBSc", "Ei Sohore Ekta Meye | এই শহরে একটা মেয়ে", "Popy & Shakil Khan | Andrew Kishore | Zor | Anupam");
		addVideoItem("a20oaRVTUMA", "Dam Diye Prem Jayna", "Shakil Khan & Popy | Ei Mon Tomake Dilam");
		addVideoItem("1oxeDLEI0bU", "Ek Ekke Ek", " Popy & Shakil Khan | Kanak Chapa & Andrew Kishore | Zor | Anupam");
		addVideoItem("ea1t5BN5Xag", "Priyo Tomay Valobeshechi", "Shakil Khan | Popy | Bangla Movie Song");
		addVideoItem("i94qOTQrwYQ", "Ami Sei Meye | আমি সেই মেয়ে", " Popy & Shakil Khan | Rizia Parvin | Zor | Anupam");
		addVideoItem("FJ1MIOAjjoE", "Tomar Premeri Borshi", "Bangla Song | Shakil Khan & Popy");
		addVideoItem("4sC-n25M2OU", "Ruper Jale Porte Hobe", "Shakil Khan & Popy | Ei Mon Tomake Dilam");
		addVideoItem("N56S4mZpHGs", "Oporupa Rup Tomar (ওপরুপা রুপ তোমার) ", "Shakil Khan & Popy | Obuj Moner Valobasha");
		addVideoItem("ThYzKBDe5SY", "Tomar Bukeri Vitore", "Shakil Khan & Popy | Ma Jokhon Bicharok | Anupam");
		addVideoItem("gxvPPTn_YCI", "Tomar Bukeri Vitor (তোমার বুকেরি ভিতরে)", " Bangla Movie Song | Shakil Khan & Popy");
		addVideoItem("vve1NfLE5zQ", "Tomar Name Likhe Dilem", " Shakil Khan & Popy | Borsha Badol");
		addVideoItem("YOAWcUksdME", "Tomar Premer | তোমার প্রেমের বড়শি", "Shakil Khan & Popy | Andrew & Rizia | Ma Jokhon Bicharok");
		addVideoItem("4DYyG31xhhY", "Ei Duniyar Eito(এই দুনিয়ার এই তো)Bangla Song ", "Shakil Khan & Popy |Praner Priyotoma");
		addVideoItem("XM-8gvfOuvg", "Ami Bhebechilam | আমি ভেবেছিলাম", "Shakil Khan & Popy | Rizia Parvin | Milon Malar Prem");
		addVideoItem("hiBtnQuhfsE", "Raat Hoyese Nijhum (রাত হয়েছে নিঝুম) Shakil Khan & Popy", "Shakil Khan & Popy | Obuj Moner Valobasha");
		addVideoItem("a56QVz-tiEs", "O Bristir Panire", " Shakil Khan & Popy | Runa & Andrew | Ma Jokhon Bicharok");
		addVideoItem("yhvg1wYqT3U", "Bangla Movie Hot Song | Shakil Khan & Popy", "Shakil Khan & Popy | Shaheen collection");
		addVideoItem("2IMbMqT-tas", "Bhalobeshe Faguner Shukh ", " Shakib Khan & Popy | Andrew & Kanak");

		//============================popy and riaz======================
		addVideoItem("s4az8E3Ob60", "Tomar Majhe Peyechi | তোমার মাঝে পেয়েছি", "Popy & Riaz | Andrew & Kanak | Khepabasu");
		addVideoItem("3fcs-OR2XdU", "Chokhu Duita Kajol Kalo | HD Movie Song", " Movie Song | Riaz & Popy | CD Vision");
		addVideoItem("1BgJlFlJIjk", "Tomake Vulte Giye| তোমাকে ভুলতে গিয়ে", " Riaz & Popy | Milu & Kanak | Bidroho Charidike | Anupam");
		addVideoItem("2WtptoLp2Uw", "Jala Boro Jala", " Bipasha & Asif | Khepabasu | Anupam");
		addVideoItem("2jm0kUSzrpk", "আমি শুধু তোমার হলাম", "Riaz, Popy | Bangla Movie Songs");
		addVideoItem("crZOL1t1ihY", "Ghumiye Thako Go Shojoni | ঘুমিয়ে থাকো গো সজনী", "Shabnur | Riaz | Shakil Khan | 3 Star Entertainmen");
		addVideoItem("HXRmQF54uZ8", "Bolona keno oi Akash Name Ase Sagorer Buke ", "HD Movie Song | Riaj, Popy & Tany Dais | CD Vision");

		addVideoItem("4nzyWtgyYZk", "Premeri Chadore Adore Adore | Amin Khan | Popy ", "Amin Khan | Popy | Mon Deewana Movie Song | Bangla New Song 2017");
		addVideoItem("FhUKABo2Keo", "Ami Koto Beshi | আমি কত বেশি ভালবাসি ", "Amin Khan & Popy | Andrew & Kanak | Mon Diwana");
		addVideoItem("BvBoep15eSE", "Tui O Matal | তুই ও মাতাল | Amin Khan & Popy ", "Amin Khan & Popy | Andrew Kishore & Doly Sayantoni | Hira Chuni Panna");
		addVideoItem("KdfdflMtlnk", "Sojoni | Bangla Movie Song | Amit Hasan | Popy", "Amit Hasan | Popy | Romantic Song");
		addVideoItem("W1r39DBBYAA", "Jani Na Koto Jol | Amin Khan | Popy ", "Amin Khan | Popy | Konok Chapa | Monir Khan | Dui Bhaiyer Juddho");
		addVideoItem("yxtCDr1d3xE", "Valobashi Tomay | Amin Khan", "Popy | Asif | Bipasha | Noya Kosai | Bangla Movie Song");
		addVideoItem("oQWaTDeHh4w", "Mon Tomare Chay Chay (মন তোমারে) Bangla Song ", "Bangla Song | Amin Khan & Popy | Robi Mastan");
		addVideoItem("Ed1Vea19wSM", "Tomake Vebe | তোমাকে ভেবে | Andrew Kishore", "Andrew Kishore | Kanak Chapa | Amin Khan | Popy | Bangla Movie Song");
		addVideoItem("-2V7orBkhEc", "Premeri Cadore Adore | প্রেমেরই চাদরে আদরে", "| Amin Khan & Popy | Andrew & Kanak | Mon Diwana");
		addVideoItem("2FHRTgdygtc", "Ei mon Shudhu | এই মন শুধু | Garam Masala Song ", "পপির গান | Popy | Amin Khan | Monir Khan | Rosemary");
		addVideoItem("4SXUiLIe-tk", "Hater Kakone | হাতের কাঁকনে ঠোঁটের কাঁপনে", "Popy & Amin Khan | Asif & Bipasha | Noya Kosai");
		addVideoItem("LEmypQNhe50", "Dhak Dhak | ধাক ধাক | Baby Naznin ", "Amin Khan | Popy | Shami Amar Behest | Bangla Movie Song");
		addVideoItem("M4PnFVXq2Cw", "Tomake Cheyechi | তোমাকে চেয়েছি | Amin Khan & Purnima", " Amin Khan & Purnima | Bipodjonok");
		addVideoItem("HFm4xdDWOn8", "Jonmota Ekbar", " Popy & Ferdous | Asif & Doly | Karagar | Anupam Movie Songs");
		addVideoItem("KDw_gLpN5VM", "Tomar Valobasate | Bangla Movie Song", "Bangla Movie Song | Nirab | Popy | Full Video Song");
		addVideoItem("nrXoLjSiNIo", "Maiya Maiya | মাইয়া মাইয়া | Garam Masala Song", "Maiya Maiya | মাইয়া মাইয়া | Garam Masala Song");
		addVideoItem("JEsqroeyYYk", "Bhalo Na Bashle | ভালো না বাসলে", " Popy & Iliash Kanchan | Andrew & Kanak | Ijjoter Lorai");
		addVideoItem("cpNu4JTcM00", "Chupi Chupi Ektu Shono | Rubel | Popy ", "Rubel | Popy | Baby Naznin | Andrew Kishore | Khuner Porinam | Movie Song");
		addVideoItem("bXaBUW1QDaA", "Akashete Lokkho Tara", "Popy & Omar Sani | Andrew & Riziya | Kuli | Anupam");
		addVideoItem("FwwO9Cu05-s", "Chotto Akta Dip", " Popy & Ilias Kanchan | Kanak & Andrew | Moner Milon");
		addVideoItem("HzC5CEu5w8w", "Hai Hai Dui Chokh (হাই হাই দুই চোখ) Bengali Songs", " Bengali Songs | Chunky Pandey & Popy |");
		addVideoItem("WzAwYx3sRUs", "Chupi Chupi Ektu Shono ( খুনের পরিনাম ) ", "Rubel | Popy | Khuner Porinaam Bangla Movie Song");
		addVideoItem("MAKrXaE9hZY", "Ganger Vitor Vora Joar", " Bangla Movie Song| Popy | Daradi Santan ");
		addVideoItem("04XFDzczGuo", "Tomake Niye Ami | তোমাকে নিয়ে আমি", "Amit Hassan & Popy | Milu & Doly | Bhalobasar Ghor | Anupam");
		addVideoItem("LJ_6cymRCIs", "Shojoni Bhalo Je Beshechi | সজনী ভালো যে বেসেছি", " Popy & Amit Hassan | Milu & Doly | Ziddi");
		addVideoItem("Fa9BSaxG0os", "Sojoni | Bangla Movie Song ", "Bangla Movie Song | Amit Hasan | Popy | Love Song");
		addVideoItem("C3pPekzv2do", "Diyechi Ei Ontor | Bangla Movie Song |", "Bangla Movie Song | Amit Hasan | Popy | Love Song");
		addVideoItem("IjhSJDLj1Gs", "Amar Buker | আমার বুকের সিংহাসনে", "Manna & Popy | Kumar Bishwajit & Ankhi | Gono Dushmon");
		addVideoItem("vpaw5OW487k", "Ei Shite Amar | এই শীতে আমার |", "Manna & Popy | Momtaz & Monir Khan | Goriber Dada | Anupam");
		addVideoItem("TEnfcHWivfQ", "Se ki Asbe | সে কি আসবে", "Shakib Khan | Popy | Runa Laila | Dujon Dujonar | Bangla Movie Song");
		createPlayList("Popy", R.drawable.vedio_icon);
		//==========================================================================


		//===============================AlamGir Movie Song======================
		//=======================================================================
		//======================================================================
		addVideoItem("VJPLZs9pPxk", "Aguner Din Shesh Hobe | আগুনের দিন শেষ হবে ", "Alamgir & Jaya Prada | Ami Sei Meye | Anupam");
		addVideoItem("-FSjLzS8x64", "Tumi Amar Koto Chena | তুমি আমার কত চেনা", "Alamgir & Rozina | Sabina & Andrew | Dolna");

		addVideoItem("pYzW6tv3yfg", "Bhalobasha Juge Juge | ভালোবাসা যুগে যুগে", "Shabana & Alamgir | Hadi & Sabina | Mayer Doa");
		addVideoItem("9wLwfJh8j5Q", "Ki Dia Mon Karila | কি দিয়া মন কাড়িলা", "Shabana & Alamgir | Andrew & Sabina | Ashanti | Anupam");
		addVideoItem("MpQOyQqydww", "Ekbar Jodi Jantam | একবার যদি জানতাম", "Andrew | Sabina Yasmin | Sabana | Alamgir | Bangla Movie Song");
		addVideoItem("yOIBx4Udnxk", "Tui Je Amar | তুই যে আমার মিলন মালারে ", "Alamgir | Andrew Kishore | Nishpap | Anupam");
		addVideoItem("I9z4nE1fyCs", "Amar Kacha Pirit | আমার কাঁচা পিরিত", "Shabana, Alamgir & Aruna | Andrew Kishore | Mayer Doa");
		addVideoItem("tyIw40eFc94", "Ei Buke Tomakei Rakhbo | এ বুকে তোমাকেই রাখবো |", "Shabana & Alamgir | Hadi & Sabina | Banglar Bou | SB");
		addVideoItem("hMbs9sXYdtc", "Bhalobasha Tumi Amar | ভালোবাসা তুমি আমার ", "Shabana & Alamgir | Ondho Bishwas | Anupam");
		addVideoItem("Rf_V2zR8td8", "Kothay Shorgo kuthai|", "Shabana & Alamgir | Andrew & Sabina | Ochena | Anupam");
		addVideoItem("vZotT9H4q_k", "Jedikei Tumi | যেদিকেই তুমি দেখবে", "Alamgir & Shabana | Shami Stree | Hadi & Sabina | Anupam | HD");
		addVideoItem("KooogrWTXus", "তুমি আশা ভালোবাসা - আলমগীর ও শাবানা - ঘর দোয়ার ", "Shabana And Alamgir movie song");
		addVideoItem("phsXoHWdyWw", "Chader Moto Mukh | চাঁদের মত মুখ", "Alamgir & Shabana | Runa & Andrew | Shashon | Anupam");
		addVideoItem("CoZpVboBhv4", "Tumi Asha Bhalobasha | তুমি আশা ভালোবাসা", " Alamgir & Shabana | Sabina & Andrew | Ghor Duwar | SB");
		addVideoItem("MpQOyQqydww", "Ekbar Jodi Jantam | একবার যদি জানতাম", "Andrew | Sabina Yasmin | Sabana | Alamgir | Bangla Movie Song");
		addVideoItem("Ot703X-uW9g", "Amar Jouboner Moubone", "Shabana & Alamgir | Sabina Yasmin | Atithi | Anupam");
		addVideoItem("WcsQYOESEfk", "Sukhe Dukhe | সুখে দুখে জনম জনম", "Shabana & Alamgir | Hadi & Sabina Yasmin | Mayer Doa | Anupam");
		addVideoItem("P-P46_p9A10", "Ore Shampanwala", "Shabana & Alamgir | Shefali Ghosh | Monihar | Anupam");
		addVideoItem("qBsaQko6PtQ", "Bolo Na Ekbar | বলো না একবার ", "Bangla Movie Song | Alamgir | Shabana | Dhon Dowlat");
		addVideoItem("MIyW12QMUqY", "Amar Ja Kichu | আমার যা কিছু ", " Shabana & Alamgir | Sabina & Subir | Ranga Bhabi | Anupam");
		addVideoItem("QUbDfb7frOo", "Tumi Je Chondromukhi ", "Shabana & Alamgir | Andrew & Sabina | Durjoy");

		addVideoItem("bXnlvM7_Dr4", "Tumi Amar Koto Chena | তুমি আমার কত চেনা", "Alamgir | Runa & Andrew | Dolna | Anupam");
		addVideoItem("LNqzl5mRhI0", "Tumi Amar Koto Chena | তুমি আমার কত চেনা", "Runa Laila | Dolna | Anupam Movie Songs");
		addVideoItem("IibDFsV_uHc", "Tumi Amar Moner | তুমি আমার মনের আয়না ", "Bobita & Alamgir | Runa & Andrew | Buker Dhon");
		createPlayList("Alamgir", R.drawable.vedio_icon);
		//============================End Alamgir==============================================



		//======================Shabana Movie song==========================================
		//==================================================================================
		//==================================================================================
		addVideoItem("pYzW6tv3yfg", "Bhalobasha Juge Juge | ভালোবাসা যুগে যুগে", "Shabana & Alamgir | Hadi & Sabina | Mayer Doa");
		addVideoItem("9wLwfJh8j5Q", "Ki Dia Mon Karila | কি দিয়া মন কাড়িলা", "Shabana & Alamgir | Andrew & Sabina | Ashanti | Anupam");
		addVideoItem("MpQOyQqydww", "Ekbar Jodi Jantam | একবার যদি জানতাম", "Andrew | Sabina Yasmin | Sabana | Alamgir | Bangla Movie Song");
		addVideoItem("yOIBx4Udnxk", "Tui Je Amar | তুই যে আমার মিলন মালারে ", "Alamgir | Andrew Kishore | Nishpap | Anupam");
		addVideoItem("I9z4nE1fyCs", "Amar Kacha Pirit | আমার কাঁচা পিরিত", "Shabana, Alamgir & Aruna | Andrew Kishore | Mayer Doa");
		addVideoItem("tyIw40eFc94", "Ei Buke Tomakei Rakhbo | এ বুকে তোমাকেই রাখবো |", "Shabana & Alamgir | Hadi & Sabina | Banglar Bou | SB");
		addVideoItem("hMbs9sXYdtc", "Bhalobasha Tumi Amar | ভালোবাসা তুমি আমার ", "Shabana & Alamgir | Ondho Bishwas | Anupam");
		addVideoItem("Rf_V2zR8td8", "Kothay Shorgo kuthai|", "Shabana & Alamgir | Andrew & Sabina | Ochena | Anupam");
		addVideoItem("vZotT9H4q_k", "Jedikei Tumi | যেদিকেই তুমি দেখবে", "Alamgir & Shabana | Shami Stree | Hadi & Sabina | Anupam | HD");
		addVideoItem("KooogrWTXus", "তুমি আশা ভালোবাসা - আলমগীর ও শাবানা - ঘর দোয়ার ", "Shabana And Alamgir movie song");
		addVideoItem("phsXoHWdyWw", "Chader Moto Mukh | চাঁদের মত মুখ", "Alamgir & Shabana | Runa & Andrew | Shashon | Anupam");
		addVideoItem("CoZpVboBhv4", "Tumi Asha Bhalobasha | তুমি আশা ভালোবাসা", " Alamgir & Shabana | Sabina & Andrew | Ghor Duwar | SB");
		addVideoItem("MpQOyQqydww", "Ekbar Jodi Jantam | একবার যদি জানতাম", "Andrew | Sabina Yasmin | Sabana | Alamgir | Bangla Movie Song");
		addVideoItem("Ot703X-uW9g", "Amar Jouboner Moubone", "Shabana & Alamgir | Sabina Yasmin | Atithi | Anupam");
		addVideoItem("WcsQYOESEfk", "Sukhe Dukhe | সুখে দুখে জনম জনম", "Shabana & Alamgir | Hadi & Sabina Yasmin | Mayer Doa | Anupam");
		addVideoItem("P-P46_p9A10", "Ore Shampanwala", "Shabana & Alamgir | Shefali Ghosh | Monihar | Anupam");
		addVideoItem("qBsaQko6PtQ", "Bolo Na Ekbar | বলো না একবার ", "Bangla Movie Song | Alamgir | Shabana | Dhon Dowlat");
		addVideoItem("MIyW12QMUqY", "Amar Ja Kichu | আমার যা কিছু ", " Shabana & Alamgir | Sabina & Subir | Ranga Bhabi | Anupam");
		addVideoItem("QUbDfb7frOo", "Tumi Je Chondromukhi ", "Shabana & Alamgir | Andrew & Sabina | Durjoy");
		addVideoItem("nXMclrMv9qQ", "Keuto Janena | কেউতো জানেনা ", "Shabana | Sabina Yasmin | Sneher Badhon | Anupam Movie Songs");
		addVideoItem("Ycp2mPIqPto", "Shotojonomer  shopno", "Shabana & Bulbul Ahmed | Sabina Yasmin | Rajlokkhi Srikanto");
		addVideoItem("_vF7QvoP0zk", "Tumi Chara | তুমি ছাড়া কাটেনা ", "Shabana, Jasim, Amit Hassan & Popy | Bhalobasar Ghor | Anupam");
		addVideoItem("QfQRckUzRuY", "O Pakhi tor jotrona", "Shabana & Alamgir | Sabina Yasmin | Atithi | Anupam Movie Songs");
		addVideoItem("I2HdrhiD784", "Jokhon Ami Thakbo Na | যখন আমি থাকবো না", "Shabana & Jasim | Sabina Yasmin | Stree Hotta | Anupam");
		addVideoItem("hyavoJRiEfU", "Songi Chara bondhu chara", "Shabana & Jasim | Andrew & Sabina | Hingsha | Anupam");
		addVideoItem("W7ikH9k6r3k", "Premero Chotto Ekti Ghor", " Razzak & Shabana | Runa Laila & Bashir | Jhumur");
		addVideoItem("0NlFav0bDZA", "Tor Achole Momotari | তোর আঁচলে মমতারই ছায়া", "Shabana & Tapu | Sabina Yasmin | Birodh | Anupam");
		addVideoItem("Ga04G1ofiyA", "O Konna Biyar Sajhon Shajo | HD Movie Song", "Movie Song | Shabana & Rubel | CD Vision");
		addVideoItem("4pbwSAWfRvQ", "Ami Rojonigondha Fuler Moto", "Razzak & Shabana | Rojonogondha");
		addVideoItem("nXL3SK9XdkM", "Jibon Adhare | জীবন আঁধারে পেয়েছি ", "Razzak & Shabana | Sabina & Abdul Jabbar | Putrobodhu");
		addVideoItem("WcsQYOESEfk", "Sukhe Dukhe | সুখে দুখে জনম জনম", " Shabana & Alamgir | Hadi & Sabina Yasmin | Mayer Doa | Anupam");
		addVideoItem("mQNFcKKEets", "E Sukher Nei Kono | এ সুখের নেই কোন সীমানা", "Shabana & Diti | Sabina Yasmin | Shami Stri");
		addVideoItem("R6KaLqMPadE", "Jete Debo Nare | যেতে দেবো নারে", "Shabana & Aruna | Runa Laila | Obujh Shontan | Anupam");
		addVideoItem("cRUuRGvdi_w", "Bikrompure Baper Bari", " Shabana | Anjuman Ara Begum | Monihar | Anupam");
		addVideoItem("iCqqk-hAgKY", "Rupar Lago Aso Kase | Jhumur", "Movie Song | Shabana | CD Vision");
		addVideoItem("bBvk0L2WmIw", "Bhabte Amar Lojja lage", "Shabana & Razzak | Sabina Yasmin | Prayeschitto");
		addVideoItem("5CXjdD3PT90", "Enecho Tumi Bondhu", "Razzak & Shabana | Runa Laila | Prayeschitto | Anupam");
		addVideoItem("bTqzvJUQlKg", "Amra To Banjaran | আমরা তো বানজারান", "Shabana & Wasim | Runa Laila & Abida | Banjaran");
		createPlayList("Shabana", R.drawable.vedio_icon);
		//==========================================================================



		//=====================Razzak Album====================================
		//====================================================================
		//====================================================================
		addVideoItem("L4z0jjJ163A", "Amar Moto Eto Sukhi | আমার মতো এত সুখী", "Razzak | Milu | Baba Keno Chakor | Anupam");
		addVideoItem("bKs3AV8rwlg", "Nil Akasher Niche | নীল আকাশের নীচে ", "Khandokar Faruk Ahmed | Nil Akasher Niche");
		addVideoItem("-z5w5loAi1Y", "Kache Esho Jodi Bolo | কাছে এসো যদি বলো", "Razzak & Kobori | Abirvab | Anupam");
		addVideoItem("W7ikH9k6r3k", "Premero Chotto Ekti Ghor ", "Razzak & Shabana | Runa Laila & Bashir | Jhumur");
		addVideoItem("fr2N__YQ7Vc", "Ashru Diye Lekha", "Razzak & Sujata | Sabina Yasmin | Ashru Diye Lekha | Anupam");
		addVideoItem("vGAQBADeGeQ", "Aynate Oi Mukh Dekbe Jokhn | আয়নাতে ঐ মুখ দেখবে যখন ", "Razzak & Shabnam | Nacher Putul | Anupam");
		addVideoItem("5A9vh5nHfPM", "Ami Dhonno Hoyechi | আমি ধন্য হয়েছি", "Razzak & Babita | Sabina Yasmin | Sona Bou | Anupam");
		addVideoItem("a_KjCiL0ySs", "Phuler kane Bhromor ", "Razzak & Babita | Shanaz | Peech Dhala Poth");
		addVideoItem("DTsB91JhkbQ", "Ek Gherhoshter Ghore ", "Razzak, Jasim & Iliash Kanchan | Andrew Kishore | Avijan");
		addVideoItem("mPxl90VicnU", "Premer Nam Bedona", "Razzak & Kobori | Mahamudunnabi | Nil Akasher Niche");
		addVideoItem("yXJTqo4OdFY", "Kotha Dao Amake", " Razzak & Shabana | Sabina & Andrew | Awara | Anupam");
		addVideoItem("r2k00QZ8SYI", "Janina Ke Tumi | জানিনা কে তুমি", "Razzak & Shabnam | Sabina Yasmin | Nacher Putul | Anupam");
		addVideoItem("z3a6x7uaBTQ", "Hoi Hoi Rongila ", "Razzak & Kabori |Sabina Yasmin & Md. Ali Siddiki | Rongbaz |Anupam");
		addVideoItem("ZYqv7SxPNoM", "Jibonta Hoy | জীবনটা হয় যদি", "Razzak & Suchonda | Md. Ali Siddiki & Ferdousi Rahman |Jibon Songeet");
		addVideoItem("13-6tYnYJ8A", "Ami Rojoni Gondha | Rojini Gondha", "Full HD Movie Song | Razzak | Shabana | CD Vision");
		addVideoItem("ONT9uzCB7i4", "Ore O Pordeshi | ওরে ও পরদেশী", "Razzak, Shabana | by Sabina Yasmin | Ashami");
		addVideoItem("13oa094cB_Q", "Ami Nijer Mone Nijei | আমি নিজের মনে নিজেই", "Razzak & Kabori | Abirvab");
		addVideoItem("5f2045-fwA0", "Slamalekum Keno Eto | সালামালেকুম কেন এত", "Razzak & Sujata | Khurshid Alam & Shanaz | Aponjon");
		addVideoItem("AAw1QzEUZL0", "Akash Ke Sakkhi Rekhe (Male) | Khurshid Alam | Razzak", "Khurshid Alam | Razzak | Bobita | Shohag | Bangla New Song 2016");
		addVideoItem("wsqcTeNOGDs", "Joubonta Ek Prempotro ", "Sujata & Razzak | Sabina & Khurshid | Protinidhi");
		addVideoItem("zA2mO2e1tKg", "Premer O Choto Itihash | Jhumur (2016) ", " Movie Song | Shabana | Razzak | CD Vision");
		addVideoItem("A1MNomNfZ-o", "Nupurer Jhongkare Ami Mon Je Dilam", "Razzak and Bobita Movie Song| Laili Mojnu| Moon's Song| ");
		createPlayList("Razzak", R.drawable.vedio_icon);
		//==========================================================================


		//==================Bobita Movie Song Album====================================
		//============================================================================
		//============================================================================
		addVideoItem("1CBPZvW09Xk", "Tumi Amar Jibon | তুমি আমার জীবন", "Bobita & Zafar Iqbal | Runa & Andrew | Abujh Hridoy");
		addVideoItem("ewXSiJL8Y_I", "Ki Ache Jibone Amar | কি আছে জীবনে আমার ", "Faruk & Bobita | Jibon Songsar");
		addVideoItem("hcmaqVXklLI", "Tali Fune Kicho-Ashami Bodhu Alamgir, Babita", "Tali Fune Kicho-Ashami Bodhu Alamgir, Babita");
		addVideoItem("kQ7ps8TjSuY", "O Dokhin Haware | ও দখিন হাওয়ারে", " Babita | Doly Sayontoni | Gherao | Anupam Movie Songs");
		addVideoItem("AAw1QzEUZL0", "Akash Ke Sakkhi Rekhe (Male) ", "Khurshid Alam | Razzak | Bobita | Shohag | Bangla New Song");
		addVideoItem("XnvvepI8nWQ", "Shakkhi Thaiko", "Faruk & Babita | Andrew & Sabina | Laila Amar Laila");
		addVideoItem("gnj3D8NxvqE", "Tumi Ei Chokhe | তুমি এই চোখে", "Shohel Rana & Bobita | Andrew & Doly | Gherao | Anupam");
		addVideoItem("ewXSiJL8Y_I", "Ki Ache Jibone Amar | কি আছে জীবনে আমার", "Faruk & Bobita | Jibon Songsar");
		addVideoItem("zktPnDd02To", "Amar Antor Poraila ", "Faruk & Babita | Andrew & Sabina | Laila Amar Laila");
		addVideoItem("emp9IaLpNnU", "Je Jon Bhalobashe | যে জন ভালোবাসে ", "Babita, Alamgir & Mithun | Sabina Yasmin | Kheya Ghater Majhi");
		addVideoItem("Kp3J68RyZ1A", "Esharay Sish Diye | ইশারায় শিস দিয়ে ", " Bobita & Wahid | Sabina Yasmin | Bondini | Anupam Movie Songs");
		addVideoItem("Lc8mtnizD7M", "তোমারে কাছে পেলে | Etim | Faruk, Bobita", "Etim | Faruk, Bobita | Bangla Full Movie | Bangla Movie Song | Maasranga Movies");
		addVideoItem("2suNaitUfnU", "Ei Deho Pinjira | এই দেহ পিঞ্জিরা ", "Babita & Hassan Imam | Syed Abdul Hadi & Baby Naznin | Gherao");
		addVideoItem("5gbd_k5Crho", "Doushmon Doushmon | দুশমন দুশমন", " Babita & Ahmed Sharif | Runa Laila | Karon | Anupam Movies");
		addVideoItem("v3Dmdqg_6q4", "Jiboner Ei Pothe Jete | ft Faruk , Bobita", "Abdul Hadi n Sabina Yasmin | A Jibon Tomar Amar");
		addVideoItem("bf7HZWnCCYM", "Valobashar Chithi | ভালোবাসার চিঠি", "Sabina Yasmin | Jafor Iqbal | Bobita | Doshi |Bangla Movie Song");
		addVideoItem("6avkDXHq9i4", "Chirodin Tomake Bhalobeshe | Bangla song", "Bobita & Ilias Kanchan | Sabina Yasmin | SB Entertainment");
		addVideoItem("UyehfQQGwY0", "Classic Hit Movie Song | Jodi Bou Sajo Go", "Bulbul , Bobita | by Runa Laila & Khurshid Alam| Wada");
		addVideoItem("inkN-OsXzNw", "তুমি আমি দুজনে জনমে জনমে| ", "Razzak and Bobita Movie Song| Laili Mojnu| Moon's Song| 4K");
		addVideoItem("gvdeSye5few", "Ami Achi Thakbo | আমি আছি থাকবো ", "Bangla Old Movie Song | Babita-ববিতা | Elias ");
		addVideoItem("VU0A_dYqqMY", "E Jibonto Ar Kisu Noy | এ জীবনতো আর কিছু নয় ", "Bobita & M: Real | Runa & Andrew | Karon");
		addVideoItem("_v88YINZZr0", "Gan Noy Jibon Kahini | গান নয় জীবন কাহিনী ", "Bobita & Wahid | Runa Laila | Bondini | Anupam");
		addVideoItem("_V4QG3iq980", "CHURI KORECHO AMAR MONTA MD KHURSID ALAM", "CHURI KORECHO AMAR MONTA MD KHURSID ALAM");
		addVideoItem("g4Mcx9DACzU", "Sob Kaj Elomelo | সব কাজ এলোমেলো", "Shohel Rana & Babita | Doly Syaontony | Gherao | Anupam");
		addVideoItem("5TxhH5k2sX8", "Premer Agune Jole gelam", "Bobita & Zafor Iqbal | Runa & Zafor | Fokir Mojnu Shah");
		addVideoItem("Awvz6CoESqM", "De Aro De | দে আরো দে", "Dipjol & Babita | Runa Laila | Dhor");
		createPlayList("Bobita", R.drawable.vedio_icon);
		//==========================================================================





		//=====================Illias kanchon movie song list=====================
		//=======================================================================
		//=======================================================================
		addVideoItem("Hu33dx0e6jM", "Sobar jibone Prem | সবার জীবনে প্রেম আসে", "Andrew & Rizia | Moushumi & Ilias Kanchan | Vangchur");
		addVideoItem("v_KvGegak6s", "E Jibon Tomake | এ জীবন তোমাকে দিলাম ", "Moushumi & Iliash Kanchan | Kumar Shanu & Mitali | Attotyag");
		addVideoItem("5-KySZ3F1Uc", "Prithibir Joto Sukh | পৃথিবীর যত সুখ", " Iliash Kanchan & Champa | Andrew & Sabina | Sohozatri");
		addVideoItem("Jjv1KmTEJJc", "Amar Moner Akashe | আমার মনের আকাশে ", "Iliash Kanchan & Diti | Kumar Sanu | Premer Protidan");
		addVideoItem("1wQoD9y9tBs", "Piriti Koria Ami | পিরিতি করিয়া আমি ", "Ilias Kanchan & Sucharita | Subir Nandi | Kushumkoli");
		addVideoItem("H7EaKUIyq3o", "Ami Bhalobashar Sukhe | আমি ভালোবাসার সুখে", "Ilias Kanchan & Diti | Andrew & Kanak | Beimani");
		addVideoItem("H79oDqN0Wbk", "Boro Loker Beti Go | বড়লোকের বেটি গো", "| Ilias Kanchan & Diti | Andrew Kishore | Chakor");
		addVideoItem("gmOFr0EJ9b0", "Biyer Phool | Bangla Movie Song", "Ilias Kanchan | Anju Ghosh | Love Song");
		addVideoItem("tp1tWDrYBsQ", "Shawoner Ei Modhu Rate | Ilias Kanchan", " Champa | Atongko | Bangla Movie Song");
		addVideoItem("LQCKxwkcO5w", "Amar Eto Dine | আমার এত দিনে | Ilias Kanchan & Diti ", "Sabina Yasmin & Andrew kishore | Chakor");
		addVideoItem("KPXv6WP5c7U", "Ei Mone Amar | এই মনে আমার", "Ilias Kanchan & Diti | Andrew & Sabina | Benam Badsha | Anupam");
		addVideoItem("2KdJ-Adz2oM", "Sukher Dineo Ami || সুখের দিনেও আমি", "Ilias Kanchan || Diti || Runa Laila | Sahadharmini | G Series");
		addVideoItem("bTlKOWXWPv0", "Beder Meye Josna | বেদের মেয়ে জোসনা", " Ilias Kanchan | Anju Ghosh | Runa Laila | Andrew Kishore");
		addVideoItem("nxyfXkH60oY", "Amaro Lagiya Bondhu | আমারও লাগিয়া বন্ধু", " Beder Meye Josna | Ilias Kanchan | Anju | Sabina | Andrew");
		addVideoItem("lbl_EyJOnLU", "Mayay Ghera Ei Shongshare", "Ilias Kanchan , Anju | by Rothindronath Roy | Beder Meye Josna");
		addVideoItem("bGQ4qN4Ivl0", "Pahariya Saper Khela | by Sabina Yasmin", "Anju Ghosh | Beder Meye Josna");
		addVideoItem("JEbOsBzCyIU", "Merona Merona Jollad", "Anju Ghosh || Ilias Kanchan || Beder Meye Josna");
		addVideoItem("ackUhSSm4Nc", "O Tui Daakle Jare || ও তুই ডাকলি যারে |", "Ilias Kanchan | Anju | Rathindranath Roy | Beder Meye Josna");
		addVideoItem("843HS2Shajc", "Tumi Amar | তুমি আমার প্রাণ সজনী ", "Ilias Kanchan & Anju | Andrew & Sabina | Rajar Meye Bedeni");
		addVideoItem("j8hsDddE4Aw", "Mairona Mairona | মাইরোনা মাইরোনা আমারে", "Ilias Kanchan & Anju | Andrew | Rajar Meye Bedeni");
		addVideoItem("_o8NEB1rBMI", "Shonen Shonen Jahapana | Rajar Meye Parul", "| Bengali Movie Song | Sabina Yasmin");
		addVideoItem("JEsqroeyYYk", "Bhalo Na Bashle | ভালো না বাসলে", "Popy & Iliash Kanchan | Andrew & Kanak | Ijjoter Lorai");
		addVideoItem("hkdh4WHC5Yw", "E Modhu Josonay | এ মধু জোসনায় ", "Rozina & Ilias Kanchan | Abida Sultana | Radha Krishno | Anupam");
		addVideoItem("OrcU4ZoY43Q", "Cholte Cholte | চলতে চলতে পথ", " Moushumi & Iliash Kanchan | Runa & Andrew | Golaguli | Anupam");
		addVideoItem("gJdqOw7DbHM", "Mone Rekho Prithibi | ft Ilias Kanchan , Moushumi ", "Ilias Kanchan , Moushumi | by Khalid Hassan Milu , Kanak Chapa");
		addVideoItem("IpcpP0X7830", "Chupi Chupi Tomar Kache Asbo", "Ilias Kanchon | Anju Ghosh | Mohan Bundhu");
		addVideoItem("qExstxyg4Rk", "Amar Tui Chara Ke | আমার তুই ছাড়া কে", "Ilias kanchan & Munmun | Jobor Dokhol");
		//==================Diti and illias
		addVideoItem("s2aZzlLZTuk", "Aj Boro Sukhe | আজ বড় সুখে", "Ilias Kanchan & Diti | Andrew & Kanak | Beimani | Anupam");
		addVideoItem("LjO5i9N_B_U", "Ekti Kothai Boli (একটি কথাই বলি) ", "Bangla Song | Diti & Ilias Kanchan | SB Entertainment");
		addVideoItem("8fDMDzD9vjw", "Chirodin Ei Duniyay | চিরদিন এই দুনিয়ায়", " Iliyas Kanchon&Diti | Full Song | Atmo Biswash");
		addVideoItem("bpzKzCf_ioY", "Bhalobasa Joto Boro | ভালবাসা যত বড়", "Iliash Kanchan & Diti | Kumar Sanu & Mitali |Chorom Aghat");
		addVideoItem("eNKqJ-WZ5Ug", "Amar E Gan | আমার এ গান", " Ilias Kanchan & Diti | Andrew Kishore & Sabina Yasmin | Ashami Greftar");
		addVideoItem("SSngPoRIyo8", "Bhalobashar Shadh | ভালোবাসার সাধ", "| Diti & Iliash Kanchan | Kumar Shanu & Mitali | Bachar Lorai");
		addVideoItem("3AJihQzE-b8", "Aj Boro Shukhe | আজ বড় সুখে |", "Ilias Kanchan & Diti | Sabina Yasmin | Beimani | Anupam");
		addVideoItem("hVYAuLB7txM", "Aj Ki Je Holo | আজ কি যে হলো", "Iliash Kanchan & Diti | Milu & Kanak | Ochol Poysha | Anupam");
		addVideoItem("rxpwN9ymSK8", "উঠবেন না কি এখানেই শুয়ে থাকবেন ?", " Ilias Kanchan | Diti | Bachar Lorai | Movie Scene");
		addVideoItem("o20jfbkHYzE", "O Memshab | ও মেমসাব | HD | Iliash Kanchan & Diti ", "Iliash Kanchan & Diti | Andrew & Sabina | Shoth Manush | Anupam");
		addVideoItem("RG1Xq6rgyy8", "Shobar Kache | সবার কাছে প্রিয়", "Iliash Kanchan & DIti | Mitali Mukharjee & Milu | Ochol Poysha");
		addVideoItem("w_GXqtT5GR4", "", "Iliash Kanchan & Diti | Runa & Andrew | Shoth Manush");
		addVideoItem("Swyuezp4nJg", "Tomake Ami | তোমাকে আমি আজ |", "Moushumi & Iliash Kanchan | Kanak Chapa | Ondho Bhalobasha");
		addVideoItem("tKRMTadglgY", "Tumi Amar Emon | তুমি আমার এমন ", " Ilias Kanchan & Moushumi | Shahin Khan & Nazu | Bhalobasar Shotru");
		addVideoItem("8bAoj609TY4", "Nachore Churi Nachore Buri | নাচরে চুড়ি নাচরে বুড়ী", "Moushumi & Iliash Kanchan | Shesh Rokkha");
		addVideoItem("6bDndVkfJio", "Chholke Chholke Dheu Vange | ছলকে ছলকে ঢেউ ভাঙ্গে", "Ilias Kanchan , Mousumi | Kanak Chapa & Rizia");
		addVideoItem("93LM0iN_Cts", "তুমি ছাড়া এ জীবন মূল্যহীন | Bangla Movie Clip", "Bangla Movie Clip | Moushumi & Ilias Kanchan | SB Cinema Hall");
		addVideoItem("6E_DTiBB2t0", "Titing Titing Biyer | টিটিং টিটিং বিয়ের", "Moushumi & Ilias Kanchan | Runa & Andrew | Adorer Santan");
		addVideoItem("cok005_1HCQ", "Kotha Bolbo Na | কথা বলবো না বলেছি |", "Ilias Kanchan & Sucharita | Hadi & Sabina | Akhi Milon");
		addVideoItem("NSoASVSiWxo", "Bhengeche Pinjor", "Iliash Kanchan & Zafor Iqbal | Andrew Kishore | Bhai Bondhu");
		addVideoItem("59qF68eEXaE", "Bonomali Tumi | বনমালী তুমি পরজনমে হইয়ো রাধা", "Rozina & Ilias Kanchan | Sabina Yasmin| Radha Krishno");
		createPlayList("Iliyas Kanchan", R.drawable.vedio_icon);
		//==========================================================================



		//==================diti Movie song album======================================
		//=============================================================================
		//=============================================================================
		addVideoItem("A8RJIaZBkT0", "Chithi Keno Ashena | চিঠি কেন আসেনা ", "Diti & Prosenjit | Runa Laila | Priyo Shotru | Anupam");
		addVideoItem("mQNFcKKEets", "E Sukher Nei Kono | এ সুখের নেই কোন সীমানা", "Shabana & Diti | Sabina Yasmin | Shami Stri");
		addVideoItem("w3pgylJj72M", "Ami Ekdin Tomay | আমি একদিন তোমায় না দেখিলে", "Diti & Afzal Hossain | Dui Jibon");
		addVideoItem("cv-_HnOnv8E", "Tumi Nai Kichu Nai | তুমি নাই কিছু নাই ", "Manna & Diti | Khalid Hasan Milu & Kanak Chapa | Loottoraj");
		addVideoItem("7fJN4nvCaF8", "Ami Nolok Hobo | আমি নোলক হবো", "| Manna & Diti | Kanak Chapa & Agun | Loottoraj");
		addVideoItem("bK--IvSRxwU", "Amar Shami Ghor Kore | Shabnur | Babita | Diti| ", "Shabnur | Babita | Diti| Char Shotiner Ghor Movie Song");
		addVideoItem("o_Q2qnRi85g", "Tomake Amar | তোমাকে আমার কিছু ", "Prosenjit & Diti | Andrew & Jhumu | Priyo Shotru | Anupam");
		addVideoItem("qaoXZEFz-S8", "Etodin Khujechi | এতদিন খুজেছি যারে ", "Shohel Chowdhury & Diti | Agun | Priyo Shotru | Anupam");
		addVideoItem("oG8Xt7I8r_M", "Tumi Ekta Dhokabaj | তুমি একটা ধোকাবাজ", "| Iliash Kanchan & Diti | Agun & Lipi Nasrin | Gunda Police");
		addVideoItem("SSRMvf08J64", "Dhire Dhire | ধীরে ধীরে | Rubel, Diti ", "Rubel, Diti | Haramkhor | Movie Song");
		addVideoItem("EB4ygZ370Kc", "Bondhu Amar London", " Prosenjit & Diti | Runa Laila | Priyo Shotru | Anupam");
		addVideoItem("s2aZzlLZTuk", "Aj Boro Sukhe | আজ বড় সুখে", "Ilias Kanchan & Diti | Andrew & Kanak | Beimani | Anupam");
		addVideoItem("LjO5i9N_B_U", "Ekti Kothai Boli (একটি কথাই বলি) ", "Bangla Song | Diti & Ilias Kanchan | SB Entertainment");
		addVideoItem("8fDMDzD9vjw", "Chirodin Ei Duniyay | চিরদিন এই দুনিয়ায়", " Iliyas Kanchon&Diti | Full Song | Atmo Biswash");
		addVideoItem("bpzKzCf_ioY", "Bhalobasa Joto Boro | ভালবাসা যত বড়", "Iliash Kanchan & Diti | Kumar Sanu & Mitali |Chorom Aghat");
		addVideoItem("eNKqJ-WZ5Ug", "Amar E Gan | আমার এ গান", " Ilias Kanchan & Diti | Andrew Kishore & Sabina Yasmin | Ashami Greftar");
		addVideoItem("SSngPoRIyo8", "Bhalobashar Shadh | ভালোবাসার সাধ", "| Diti & Iliash Kanchan | Kumar Shanu & Mitali | Bachar Lorai");
		addVideoItem("3AJihQzE-b8", "Aj Boro Shukhe | আজ বড় সুখে |", "Ilias Kanchan & Diti | Sabina Yasmin | Beimani | Anupam");
		addVideoItem("hVYAuLB7txM", "Aj Ki Je Holo | আজ কি যে হলো", "Iliash Kanchan & Diti | Milu & Kanak | Ochol Poysha | Anupam");
		addVideoItem("rxpwN9ymSK8", "উঠবেন না কি এখানেই শুয়ে থাকবেন ?", " Ilias Kanchan | Diti | Bachar Lorai | Movie Scene");
		addVideoItem("o20jfbkHYzE", "O Memshab | ও মেমসাব | HD | Iliash Kanchan & Diti ", "Iliash Kanchan & Diti | Andrew & Sabina | Shoth Manush | Anupam");
		addVideoItem("RG1Xq6rgyy8", "Shobar Kache | সবার কাছে প্রিয়", "Iliash Kanchan & DIti | Mitali Mukharjee & Milu | Ochol Poysha");
		addVideoItem("w_GXqtT5GR4", "", "Iliash Kanchan & Diti | Runa & Andrew | Shoth Manush");

		addVideoItem("dDPPapOoU6E", "Kow Bole Boluk Pagol | Dithi | Sohel Chowdhury", " Dithi | Sohel Chowdhury | Mohan Bondhu | Bangla Movie Song");
		createPlayList("Diti", R.drawable.vedio_icon);
		//==========================================================================



		//==========Porimoni Movie song=============================================================
		//==========================================================================================
		//==========================================================================================
		addVideoItem("ChX_Z9nxayY", "Tui Ki Amar Hobi ReIতুই কি আমার হবি রে| Pori Moni | Siam", "Pori Moni | Siam | Kona | Imran | Bishwoshundori Movie Song");
		addVideoItem("9AewtFA7dwU", "Prithibite Sukh Bole | Imran & Kheya", " Imran & Kheya | Arju | Pori Moni | Amar Prem Amar Priya Bengali Movie");
		addVideoItem("4bzRmKra5cs", "Jante Jodi Chao | Roshan | Pori Moni ", "Roshan | Pori Moni | Mohammed Irfan | Akassh | Rokto Bengali Movie");
		addVideoItem("4r0kJMDpPYs", "Bujhina - বুঝিনা | Pori Moni & Shamol ", " Pori Moni & Shamol | New Bangla Movie Song 2021 | Sphulingo ");
		addVideoItem("44meDUkpy68", "Ghumta Khule Bodon Tule ( Full Video )| GUNIN | PoriMoni", "GUNIN | PoriMoni | Sariful Razz | Gias Uddin Selim | Chorki");
		addVideoItem("V6va_-orMzw", "Tumi Chara Ekdin | তুমি ছাড়া একদিন ", "Kheya | Asif | Porimoni | Bappy | Lover Number One");
		addVideoItem("Uccvf3peELQ", "Ami Dana Kata Pori", "Roshan| Pori Moni | Kanika Kapoor | Akassh | Rokto Bengali Movie");
		addVideoItem("_IToKdopd5c", "O Mon | Mukhosh Bangla Movie Song", "Pori Moni | Ziaul Roshan | Imran | Kona | Efthakhar Suvo");
		addVideoItem("SnVHy1saraw", "Pori Moni (Hot Item Song) | Pori Moni ", " Pori Moni | Live Technologies | Nogor Mastan Bengali Movie");
		addVideoItem("CYICfUfD_TA", "Bhalobasha Simahin | ভালোবাসা সীমাহীন", "| Porimoni | Monir Khan | Nancy | Bangla Movie Song");
		addVideoItem("MOiTD_jwYvE", "Dhim Tana | Full Video Song | Roshan | Pori Moni", "Roshan | Pori Moni | Akriti Kakar | Savvy | Rokto Bengali Movie");
		addVideoItem("2G3CRu6dSTc", "Chupi Chupi Aay | চুপি চুপি আয়", "| Porimoni | Roma | Ali Akram Shuvo | Bangla movie song");
		addVideoItem("u_7qaitv6YQ", "Moumachi Moumachi | ft Porimoni | by Andrew Kishor & Konok Chapa", " Porimoni | by Andrew Kishor & Konok Chapa | HD1080p | Bhalobasha Simahin");
		addVideoItem("1klY5pPmEk0", "I Love You Jaan | Pori Moni ", "Pori Moni | S I Tutul | Porshi | Innocent Love Bengali Movie");
		addVideoItem("nb28etVbF70", "Bou Didi Go Amar Ai Buro Nam Ar Guslo Na", "Bou Didi Go Amar Ai Buro Nam Ar Guslo Na");
		addVideoItem("k4lNcjs5Bqc", "Itorpona song Pori Moni Mohua Sundori", "Itorpona song Pori Moni Mohua Sundori");
		addVideoItem("yviV30FOIzk", "Fuler o ason | Mohuya Sundhori | Porimoni", "Fuler o ason | Mohuya Sundhori | Porimoni");
		addVideoItem("Y-q6bvFp1-c", "Cheyechi Chotto Nodi -Porimoni movie song", "");
		addVideoItem("dMC_Ld1CBkg", "O Jaan By Arif & Kornia | Movie Song", " Movie Song | Pori Moni | Ziauddin Alam");
		addVideoItem("Ohwp5vMtyAc", "Rimjhim Brishti - রিমঝিম বৃষ্টি | Mon Janena Moner Thikana Movie Song", "Mon Janena Moner Thikana Movie Song | Tanvir, Pori Moni, Kona");
		addVideoItem("J7Q54ITS4CM", "Ektai Jibon Ekbaree Moron | Zayed Khan | Pori Moni ", "Zayed Khan | Pori Moni | Nogor Mastan Bengali Movie ");
		addVideoItem("dKggIxZ6Q9I", "Teram Teram | Pori Moni | Kayes Arju | Ahmmed Humayun", "Pori Moni | Kayes Arju | Ahmmed Humayun | Moon | Bengali Movie");
		addVideoItem("ohjNdxHjYIo", "Tui Soddo Fota Ful | Pori Moni | Jef | Rupom & Ruma ", "Pori Moni | Jef | Rupom & Ruma | Apurba Rana | Innocent Love Bengali Movie");
		addVideoItem("qP3OdtSh0FE", "Chandra Bole Surjo Bole | Pori Moni ", "Pori Moni | Live Technologies | Nogor Mastan Bengali Movie");
		addVideoItem("KnnWeItr-0g", "Dekhe Oi Figure (Video Song) | Bappy | Pori Moni |", " Bappy | Pori Moni | Apon Manush Bengali Movie");
		addVideoItem("wugRQESs66g", "Premer Majhe Uki Mare | ft Porimoni || by Rupom & Kheya", "Porimoni || by Rupom & Kheya | HD1080p | Bhalobasha Simahin");
		addVideoItem("aRPwiXKmzh0", "Tui Je Amar Sei Laila | Full Video Song | Porimoni", " Full Video Song | Porimoni | Shahriaz | Pagla Deewana");
		addVideoItem("cocpeOXQ_2o", "Bhalobasha Hoye Gele | Pori Moni | Baby Naznin | Nogor Mastan Bengali Movie", " Pori Moni | Baby Naznin | Nogor Mastan Bengali Movie");
		addVideoItem("CYICfUfD_TA", "Bhalobasha Simahin | ভালোবাসা সীমাহীন | Porimoni | Monir Khan", "Porimoni | Monir Khan | Nancy | Bangla Movie Song");
		createPlayList("Porimoni", R.drawable.vedio_icon);
		//==========================================================================





		//==========Mahiya Mahi=============================================================
		//==========================================================================================
		//==========================================================================================
		addVideoItem("X9TGFNoygkQ", "Mahiya Mahi (Full Song) | Romeo vs Juliet", " Romeo vs Juliet | Bengali Movie | Ankush | Mahiya Mahi | Savvy");
		addVideoItem("Fmi_26IbHPo", "Rongila Baby | Mahiya Mahi | Oyshee", "Mahiya Mahi | Oyshee | Song Of The Year | Abotar");
		addVideoItem("ogYK4EYTk-U", "BAANJAARA | Mahiya Mahi | Om | Akassh", " Mahiya Mahi | Om | Akassh | Mohammed Irfan | Agnee 2 Bengali Film");
		addVideoItem("SfED84gBNpA", "Romeor Khuje Juliyet | Mahiya Mahi | D A Tayeb", " Mahiya Mahi | D A Tayeb | Bodiul Alam Khokon");
		addVideoItem("SYurRBGRL0s", "Amar E Pran Boleche | Full Song | Mahiya Mahi |", "Mahiya Mahi | Bappy | Onek Shadher Moyna | New Bangla Movie Song");
		addVideoItem("LSYFAqzm1DI", "Allah Jaane | Mahiya Mahi | Om | Akassh | Nakash Aziz", "Mahiya Mahi | Om | Akassh | Nakash Aziz | Lemis | Agnee 2 Bengali ");
		addVideoItem("xm6KWO-9bdk", "Bekheyali Mone (Full Song) | Romeo vs Juliet", "Romeo vs Juliet | Ankush | Mahiya Mahi");
		addVideoItem("SpK7hbVEH30", "Saiyaan Full Song | Romeo Vs Juliet | Mahiya Mahi | Ankush", "Romeo Vs Juliet | Mahiya Mahi | Ankush | Bengali Movie");
		addVideoItem("swdyzNR6PSI", "Sohag Chand | Romeo Vs Juliet | Ankush | Mahiya Mahi ", "Romeo Vs Juliet | Ankush | Mahiya Mahi | Akassh | Latest Bengali song ");
		addVideoItem("_Oo645aSwu0", "Romeo vS Juliet Romantic Funny Clip", " Mahiya Mahi | Ankush | Jaaz Multimedia");
		addVideoItem("emYKH5GSpg4", "Poramon Poramon Video Song | Mahiya Mahi |", "Mahiya Mahi | Symon | Kheya | Poramon Bengali Film");
		addVideoItem("_TJxHY--jNI", "Jole Jole Jonaki | Mahiya Mahi | Symon | Nancy | Shafiq Tuhin", "Mahiya Mahi | Symon | Nancy | Shafiq Tuhin | Poramon Bengali Film");
		addVideoItem("4k67qnZCVMI", "Premero Kolshi | Mahiya Mahi | Symon", "Mahiya Mahi | Symon | Poramon Bengali Film");
		addVideoItem("N7Il0aZKG_4", "Facebook | Video Song | Warning (2015) | Bengali Movie", "Warning (2015) | Bengali Movie | Arifin Shuvoo | Mahiya Mahi");
		addVideoItem("b5X9632lTOA", "Sonali Kabin | Mahiya Mahi | Bappy | Kishore | Kona ", "Mahiya Mahi | Bappy | Kishore | Kona | Tobuo Bhalobashi Bengali ");
		addVideoItem("Z6o3Knher_E", "Eto Kosto - James | Audio Track | Warning (2015)", "Bengali Movie | Arifin Shuvoo | Mahiya Mahi");
		addVideoItem("OYom_upFGX4", "Moner Kotha Bol | Tui Sudhu Amar | Soham | Mahiya Mahi | Shaan", "Tui Sudhu Amar | Soham | Mahiya Mahi | Shaan | Romantic Song | Eskay Movies");
		addVideoItem("7jdyXV_GhMM", "Mon Amar Kemon Kemon Kore | Tui Sudhu Amar | Mahiya Mahi ", "Tui Sudhu Amar | Mahiya Mahi | Om | Dance Song | Eskay Movies");
		addVideoItem("ujcy9MOr8-w", "Aite Dekhi Jaite Dekhi | Bappy | Mahi | Asif Imrose", " Bappy | Mahi | Asif Imrose | Shafiq Tuhin | Dobir Shaheber Songshar");
		addVideoItem("1-6zZ6-R49g", "Title Track (Full Song) | Romeo vs Juliet | Ankush | Mahiya Mahi", "Romeo vs Juliet | Ankush | Mahiya Mahi | Akassh");
		addVideoItem("TzZZRaf-CHU", "Believe Me | NABAB LLB | iTheatre | Shakib Khan | Mahiya Mahi ", "NABAB LLB | iTheatre | Shakib Khan | Mahiya Mahi | Anonno Mamun | Imran | Konal");
		addVideoItem("wdeiuTBQkjg", "Tumi Acho Nojore Nojore | Mahiya Mahi | Bappy | Nancy ", "Mahiya Mahi | Bappy | Nancy | Tobuo Bhalobashi Bengali Film");
		addVideoItem("NHVuQTI8g4Y", "Biyer Sanayee | Mahiya Mahi | Bappy ", "Mahiya Mahi | Bappy | Tobuo Bhalobashi Bengali Film");
		addVideoItem("WxPvp2g6t3s", "Mone Rekho | Title Song | Mahiya Mahi | Boni Sengupta ", " Mahiya Mahi | Boni Sengupta | Hridoy Khan & Mila | Movie Song");
		addVideoItem("0-qMqdpmx9E", "Surjo Dube Gele Video Song | Mahiya Mahi | Bappy", "Mahiya Mahi | Bappy | Onek Dame Kena Bengali Film");
		createPlayList("Mahiya Mahi", R.drawable.vedio_icon);
		//==========================================================================




		//==========Siam Ahmed=============================================================
		//==========================================================================================
		//==========================================================================================
		addVideoItem("ChX_Z9nxayY", "Tui Ki Amar Hobi ReIতুই কি আমার হবি রে| Pori Moni | Siam | Kona", "Pori Moni | Siam | Kona | Imran | Bishwoshundori Movie Song");
		addVideoItem("Kb2S8nlIi3o", "Tor Moto Amake | Siam | Pujja", "Siam | Pujja | Imran Mahmudul | Kona | Ahmmed Humayun | Shaan Movie Song ");
		addVideoItem("HSdaG25ii50", "Cholo Pakhi Hoi (Full Video) | Shaan | Siam | Pujja ", "Shaan | Siam | Pujja | Arman Malik | Palak | M Raahim");
		addVideoItem("kLSZ9ocA7pU", "Premer Baksho Video Song - Siam ahmed and puja chery", "Siam | Pujja | Imran, Kona | Rafi | Abdul Aziz");
		addVideoItem("K7PJZv5Johg", "O Hey Shyam tumare ami - Full Video Song ", " Siam | Pujja | Imran | Kona | Rafi | Jaaz multimedia");
		addVideoItem("foXnG1Ww7Ss", "Suto Kata Ghuri (সুতো কাঁটা ঘুড়ি) l Video Song l Siam l Pujja", "Video Song l Siam l Pujja l Nodi, Akassh l Rafi l Poramon2 Movie");
		addVideoItem("CLgMzYuepvI", "Number One Hero Song | Siam Ahmed | Pujja Cherry", "Siam Ahmed | Pujja Cherry | Akassh | Raihan Rafi | Jaaz Multimedia Film");
		addVideoItem("HzCkf74PkoQ", "Poramon 2 Title Song | Siam | Pujja | Nancy", "Siam | Pujja | Nancy | Emon Shaha | Raihan Rafi | Jaaz Multimedia");
		addVideoItem("rpKvhWfAOO8", "Keno Piriti Baraila (কেনো পিরিতি বাড়াইলা)", "Video Song | Siam | Pujja | Jaaz Multimedia");
		addVideoItem("WVfi88ziaUQ", "Tumi Chaile | তুমি চাইলে | Zia Raj | Siam | Sabila Nur | ", " Siam | Sabila Nur | OST of Telefilm Happy Ending | Bangla song");
		addVideoItem("ZU_cbx_1Oxg", "Hajir Biriyani (হাজীর বিরিয়ানী ) New Version ", "Siam | Pujja | Akassh | Rafi | Jaaz Multimedia");
		addVideoItem("WTpEQNgHNR4", "Tomake Chai - Shukonna & Pintu Ghosh | Bengali Movie Song", "Shukonna & Pintu Ghosh | Bengali Movie Song | Fagun Haway (2019) | Siam | Tisha");
		addVideoItem("Stfjpm4Y1yk", "Bondhurey | Muza | Adib | Ridy Sheikh", "Muza | Adib | Ridy Sheikh | Siam Ahmed (Official Music Video)");
		addVideoItem("7fVDbAaPPh4", "Ki Kori (Full Video) : Taan | Siam | Bubly | Imran | Kona", "Taan | Siam | Bubly | Imran | Kona | J Nirob | R Rafi | Chorki Original Film");
		addVideoItem("dlLJA4tsVRg", "Gentleman (জেন্টেলমেন) l Siam Ahmed l Luipa l Akassh Sen", "Siam Ahmed l Luipa l Akassh Sen l Music Video 2020 l Max Bag Entertainment");
		addVideoItem("S1Q9T1BgPDE", "Cholo Pakhi Hoi~Shaan | Song | Siam_Pujja | Arman Malik | Palak Muchhal", "Siam_Pujja | Arman Malik | Palak Muchhal | Ahmmed Humayun | M Raahim");
		addVideoItem("W56dCDS9qxs", "Shokal Hashe (সকাল হাসে) Video Song ", "Siam | Pujja | Imran | Bushra | Rafi | Abdul Aziz ");
		addVideoItem("i9XdD9O5vXY", "Shundor Manush - সুন্দর মানুষ | Pritom Hasan | Siam | Porimoni | ", "Pritom Hasan | Siam | Porimoni | Bishwoshundori | Bangla Movie Song");
		addVideoItem("DOk8XctGswM", "Cholna Sujon | Official Music Video | Bokhate (2016 Short Film) ", "Bokhate (2016 Short Film) | Siam & Toya | Ahmmed Humayun");
		addVideoItem("Bwx2QSG9tYQ", "Vallage Na - Sonia Nusrat | Video Song | ARAAL (2017 Short Film) ", "ARAAL (2017 Short Film) | Siam & Urmila | Ahmmed Humayun");
		addVideoItem("QrqCBXVgQ4M", "Mitthe Golpo | Naheed Mehedi | Setu Chowdhury | Siam Ahmed | Safa Kabir", "Mitthe Golpo | Naheed Mehedi | Setu Chowdhury | Siam Ahmed | Safa Kabir");
		addVideoItem("QUzxetOPmiA", "Jhorer Pore | ঝড়ের পরে | Siam Ahmed | Peya Bipasha ", "Siam Ahmed | Peya Bipasha | Sanjoy Somadder | Bangla New Short Film");
		addVideoItem("nhy6vXsPb9c", "Khoka (feat Ferdous Wahid) Pritom | Safa Kabir | Siam |", "Pritom | Safa Kabir | Siam | Nuhash Humayun | New Bangla Song");
		addVideoItem("P08XjRkOmpU", "Bolo Valobashi (বল ভালোবাসি) | Siam | Sabnam Faria ", "Siam | Sabnam Faria | Bangla Short film | PRAN Frooto Love Express 2");
		addVideoItem("QUzxetOPmiA", "Jhorer Pore | ঝড়ের পরে | Siam Ahmed | Peya Bipasha ", "Siam Ahmed | Peya Bipasha | Sanjoy Somadder | Bangla New Short Film");
		addVideoItem("oXlqFcDKwqk", "Sudhu Tomar Jonno | শুধু তোমার জন্য | Dhruba |", " Dhruba | Siam | Shahtaj | Shuvabrata | Official Music Video");
		addVideoItem("XChdfPIvoIo", "Deyale Deyale | Minar | Tomar Amar Prem | Siam | Ognila ", " Tomar Amar Prem | Siam | Ognila | Mizanur Rahman Aryan | Bangla Song");
		addVideoItem("BIQq2s1jhyk", "O DOYAL ~ O DOYAL ( ও দয়াল ) | Full Video Song | Oyshee || Siam", "Full Video Song | Oyshee || Siam || Pujja || M Raahim || Movie SHAAN");
		createPlayList("Siam Ahmed", R.drawable.vedio_icon);
		//==========================================================================





		//==========puja cherry=============================================================
		//==========================================================================================
		//==========================================================================================
		addVideoItem("BIQq2s1jhyk", "O DOYAL ~ O DOYAL ( ও দয়াল ) | Full Video Song | Oyshee || Siam || Pujja", "Full Video Song | Oyshee || Siam || Pujja || M Raahim || Movie SHAAN");
		addVideoItem("K7PJZv5Johg", "O Hey Shyam ( ও হে শ্যাম ) Full Video Song | Siam | Pujja | Imran ", "Full Video Song | Siam | Pujja | Imran | Kona | Rafi | Jaaz multimedia");
		addVideoItem("foXnG1Ww7Ss", "Suto Kata Ghuri (সুতো কাঁটা ঘুড়ি) l Video Song", " Video Song l Siam l Pujja l Nodi, Akassh l Rafi l Poramon2 Movie");
		addVideoItem("kgpcTtVbteI", "Tor Moto Amake | Siam | Pujja | Imran Mahmudul | Kona", "mran Mahmudul | Kona | Ahmmed Humayun | Shaan Movie Song");
		addVideoItem("kgpcTtVbteI", "Cholo Pakhi Hoi~Shaan | Song | Siam_Pujja | Arman Malik ", "Song | Siam_Pujja | Arman Malik | Palak Muchhal | Ahmmed Humayun | M Raahim");
		addVideoItem("kgpcTtVbteI", "Cholo Pakhi Hoi (Full Video) | Shaan | Siam | Pujja", " Shaan | Siam | Pujja | Arman Malik | Palak | M Raahim");
		addVideoItem("kgpcTtVbteI", "Shona Bondhu - Video Song ", " Noor Jahan | Adrit | Puja | New Song 2017");
		addVideoItem("kgpcTtVbteI", "Mon Boleche | Noor Jahaan | Video Song | Adrit | Puja", "Video Song | Adrit | Puja | Imran | Kona | Savvy | Raj Chakraborty | SVF");
		addVideoItem("kgpcTtVbteI", "Amar Valobasha | আমার ভালোবাসা", "Zarin | Shakib Khan | Puja Chery | Golui");
		addVideoItem("kgpcTtVbteI", "Prem Amar 2 (প্রেম আমার 2) | Title Track | Adrit | Puja | Kunal Ganjawala ", "Title Track | Adrit | Puja | Kunal Ganjawala | Savvy | RCP | SVF");
		addVideoItem("CLgMzYuepvI", "Number One Hero Song | Siam Ahmed | Pujja Cherry ", "Siam Ahmed | Pujja Cherry | Akassh | Raihan Rafi | Jaaz Multimedia Film ");
		addVideoItem("rpKvhWfAOO8", "Keno Piriti Baraila (কেনো পিরিতি বাড়াইলা)", " Video Song | Siam | Pujja | Jaaz Multimedia");
		addVideoItem("kLSZ9ocA7pU", "Premer Baksho", "Video Song | Siam | Pujja | Imran, Kona | Rafi | Abdul Aziz | Jaaz");
		addVideoItem("kgpcTtVbteI", "Bojhe Na Bojhe Na Ei Poramon (বোঝেনা বোঝেনা এই পোড়ামন ) ", "Video Song | Siam Pujja | Ahmmed Humayun");
		addVideoItem("kgpcTtVbteI", "Jombe Mela | Shakib Khan | Puja Chery", " Zarin | Golui Movie Song");
		addVideoItem("kgpcTtVbteI", "Shokal Hashe (সকাল হাসে) Video Song", " Siam | Pujja | Imran | Bushra | Rafi | Abdul Aziz | Jaaz ");
		addVideoItem("kgpcTtVbteI", "Hajir Biriyani (হাজীর বিরিয়ানী ) New Version ", " Siam | Pujja | Akassh | Rafi | Jaaz Multimedia");
		addVideoItem("kgpcTtVbteI", "Parate Majhraate | Prem Amar 2 | Adrit | Puja", "Prem Amar 2 | Adrit | Puja | Tushar | Kona | Saptarshi | Savvy | RCP | SVF");
		addVideoItem("kgpcTtVbteI", "Noor Jahaan (নূর জাহান) | Title Track | Adrit | Puja", "Title Track | Adrit | Puja | Raj | Lagnajita | Savvy | Raj Chakraborty|SVF");
		addVideoItem("kgpcTtVbteI", "তোর জন্য কত মায়ারে | Psycho | Roshan | Pujja Cherry |", "Psycho | Roshan | Pujja Cherry | Imran | Kona | Anonno Mamun");
		createPlayList("puja cherry", R.drawable.vedio_icon);
		//==========================================================================




		//==========Tahsan All Song=============================================================
		//==========================================================================================
		//==========================================================================================
		addVideoItem("F9DstkJDyXw", "Prem Tumi by Tahsan", "Tahsan Best song ever");
		addVideoItem("C-0vOChcjHo", "Alo | আলো | Tahsan | Album Ecche | Tahsan Art Track", "Album Ecche | Tahsan Art Track | Tahsan Lyrical Video ");
		addVideoItem("qb1HTyRAVV4", "Tahsan, Kona - Chhuye Dile Mon", "Tahsan, Kona - Chhuye Dile Mon Tahsan song");
		addVideoItem("kHfGcbonRuM", "Ami Sei Shuto || আমি সেই সুতো || Tahsan || Uddeshsho Nei", "Tahsan || Uddeshsho Nei || New Bangla Song | Official Lyrical Video");
		addVideoItem("uNNyyhJbw5c", "Joto Bhul | যত ভুল | Tahsan Khan | Piran Khan | Jovan | Mehazabien", "Tahsan Khan | Piran Khan | Jovan | Mehazabien | Love vs Crush 2 Drama Song");
		addVideoItem("2xzQPHMw2YQ", "Irsha || Tahsan Khan || Kothopokothon", "Tahsan Khan || Kothopokothon || Bangla New Song || Official Lyrical Video");
		addVideoItem("24GngnukIFY", "Ke Tumi || কে তুমি || Tahsan | MD. Kanak", "Tahsan | MD. Kanak || Bangla New Music Video || G Series Bangla Song");
		addVideoItem("a1f8EHiA1_U", "Ektai Tumi | একটাই তুমি | Tahsan | Puja | Sharlina | ", "Tahsan | Puja | Sharlina | Sajid Sarker | Bangla new song ");
		addVideoItem("Z0SjkBGmtc0", "Alo | আলো || Tahsan Khan || Apurba || Sabila Nur", "|| Tahsan Khan || Apurba || Sabila Nur || Bangla New Song || Exclusive Music Video");
		addVideoItem("8t7mTY7x2wM", "Tumi Moy | Tahsan Ft Tisha | Official Full Video Song", "Tahsan Ft Tisha | Official Full Video Song 1080ᴴᴰ | To Airport");
		addVideoItem("P5tCWgW5iyU", "Hothat eshechile by Tahsan | Monsuba Junction", "Monsuba Junction | Tahsan's Song | Music Video");
		addVideoItem("gK7nKuzmlWU", "Prematal  || Tahsan || Kritodasher Nirban |", "Tahsan || Kritodasher Nirban || Bangla New Song || Official Lyrical Video");
		addVideoItem("aPw1M_Ehg94", "Keu Na Januk | কেউ না জানুক | Imran Ft Tahsan", "| Imran Ft Tahsan | Suzena | Abm Sumon | Mizanur Aryan | Bangla Song");
		addVideoItem("oNqj3-jrBic", "Tahsan - Bhalobashar Maane (Tai Tomake OST)", "Tahsan - Bhalobashar Maane (Tai Tomake OST)");
		addVideoItem("iss_85SWLYA", "Prem Tumi | Tahsan | Tisha | Sajid Sarkar ", "Tahsan | Tisha | Sajid Sarkar | Angry Bird | Mizanur Rahman Aryan");
		addVideoItem("4tpHzAMKJhg", "Momer Deyal | Durbeen (Short Film) | Rumman ft. Tahsan | Nadia ", " Durbeen (Short Film) | Rumman ft. Tahsan | Nadia | Vicky Zahed | Tahsin Rakib");
		addVideoItem("frcdMeF9E2s", "Lokkhishona adoro kore dicchi tumai | Jodi Ekdin Movie Song", "Jodi Ekdin Movie Song | Tahsan | Raisa | Hridoy Khan | Raz");
		addVideoItem("M5soWd1Uy34", "Amar Golpe Tumi |", "Tahsan | Mithila | Urmila | Official Drama Video | Bangla Song");
		addVideoItem("V8K2RR21mOU", "Bhalobashi Tai | TAHSAN | PAYEL | Emon Chowdhury", " TAHSAN | PAYEL | Emon Chowdhury | New EID Song");
		addVideoItem("uB1bfE-Zx3E", "Chile Amar | ছিলে আমার | Tahsan | Mithila | Kathapokathon", "Tahsan | Mithila | Kathapokathon | Official Drama Video | Bangla Song");
		addVideoItem("gXxYPU2dsnQ", "Keno Hothat Tumi Ele || কেনো হঠাৎ তুমি এলে", "Tahsan || Sajid Sarker || Jovan || Sabnam Faria");
		addVideoItem("IADNLugD6nE", "Valobashar Pongktimala ", "Tahsan | Official Drama Video | Bangla Song");
		addVideoItem("uPmV4ONl3kI", "Ami Parbona Tomar Hote l Tahsan & Konal", "Tahsan & Konal l Srabanti Chatterjee l Rtv Music l Movie - Jodi Akdin");
		addVideoItem("LAGZDdZ7sWs", "PROTHOM BHALOBESHE | TAHSAN | MIM ", "TAHSAN | MIM | PRITOM HASAN | Tahsan Music Video ");
		addVideoItem("Ae6SS1h7Pl8", "Tumimoy Lage | তুমিময় লাগে | Tahsan | Kornia | Sadiya Suchita ", "Tahsan | Kornia | Sadiya Suchita | Bangla New Song 2019");
		addVideoItem("VdTSv6u6iP0", "Tomar Amar | তোমার আমার | Tahsan | MIthila", " Tahsan | MIthila | Sajid Sarkar | Official Drama Video | Bangla Song");
		addVideoItem("JMEbE609WOY", "Bindu Ami by Tahsan Khan", "Bindu Ami by Tahsan Khan");
		addVideoItem("PZjGlFiFE_4", "Priyo Oshukh | Full Music Video | Tahsan ", "Tahsan | Bangla New Song | eTunes Entertainment");
		addVideoItem("NrYuH5bp1xY", "Cholona Harai | Tahsan | Shawon Gaanwala", "Shawon Gaanwala | Apeiruss | Bangla new song");
		addVideoItem("MwpZp8BSc_U", "Ki Hoto Bole Gele | কি হতো বলে গেলে | Tahsan | Menon", "Tahsan | Menon | Sabi | Bannah | OST of MKTG");
		addVideoItem("8IE6uIKQVb8", "Drubotara | Tahsan | Thikana | Apurba | Mithila", "Tahsan | Thikana | Apurba | Mithila | Official Drama Video");
		addVideoItem("pK13Kokvj2E", "Chip Nouko | ছিপ নৌকো | Prince Mahmud feat Tahsan & Kona", "Prince Mahmud feat Tahsan & Kona | Official Music Video");
		addVideoItem("V2Ch7wN381w", "Bristy Chuye | Tahsan | Moutushi ", "Tahsan | Moutushi | Apurba | Official Drama Video | Bangla Song");
		addVideoItem("Oxpw5I9fvXM", "Tumi Moy | তুমিময় | Tahsan | Sajid Sarkar", "Tahsan | Sajid Sarkar | Official Lyrical Video | Bangla Song");
		addVideoItem("yOQ13j5_Jag", "Shei Meyeta | সেই মেয়েটা | Tahsan | Bidda Sinha Mim", "Tahsan | Bidda Sinha Mim | Sajid | Official Drama Video ");
		addVideoItem("qCqpBfCRWw0", "Kotodur ( কতদূর ) - Tahsan Khan || Minar ", "Tahsan Khan || Minar || Sajid Sarkar || Bangla Lyrics Song");
		addVideoItem("fn0oVARCSFs", "Onuvobe Tumi by Tahsan feat Puja", "Onuvobe Tumi by Tahsan feat Puja");
		addVideoItem("l-BjVbugMNs", "Sheser Gaan | Tahsan | Mithila", "Tahsan | Mithila | New Bangla Song | ☢ EXCLUSIVE ☢");
		addVideoItem("m5S0p3BezCA", "Jaccho Hariye | Tahsan | Apurba | Zakia Momo", "Tahsan | Apurba | Zakia Momo | Official Drama Video | Bangla Song");
		addVideoItem("elDNYNkPOJk", "Protibadi Gaan | Tahsan Khan | Yamaha Studio", "Protibadi Gaan | Tahsan Khan | Yamaha Studio");
		addVideoItem("dMXvuGy-gmc", "Tomake Chai | তোমাকে চাই | Tahsan | Kuhu | Tisha", "Tahsan | Kuhu | Tisha | Official Drama Video | Bangla Song");
		addVideoItem("kRvn-T7wmpw", "Oprapti | TAHSAN | ASHA | TOWFIQUE | EID EXCLUSIVE", "TAHSAN | ASHA | TOWFIQUE | EID EXCLUSIVE | MUSICAL FILM BY VICKY ZAHED");
		addVideoItem("G48zDu4sk64", "Durotto | Tahsan | Mithila", "Tahsan | Mithila | Bangla Song 2022 | New Bngla Song");
		addVideoItem("p13UJnDI43Y", "Bela Boye Jay | Shusmita Anis | Sajid Sarker | Tahsan", " Shusmita Anis | Sajid Sarker | Tahsan | Sabila Nur | Bangla Music Video");
		addVideoItem("dwOdU2Yl1Rc", "খোলা জানালা ( Khola janala) bangla song lyrics (swat)", "খোলা জানালা ( Khola janala) bangla song lyrics (swat)");
		createPlayList("Tahsan", R.drawable.vedio_icon);
		//==========================================================================



		//==========Minnner All Song=============================================================
		//==========================================================================================
		//==========================================================================================
		addVideoItem("RWnFowWtT78", "MINAR RAHMAN | JHOOM | Official Music Video", "JHOOM | Official Music Video | New Bangla Song");
		addVideoItem("gviAd_TlhIQ", "Minar Rahman - Keu Kotha Rakheni ", "Minar Rahman - Keu Kotha Rakheni ");
		addVideoItem("e8eSfqaaGXQ", "Karone Okarone | Minar Rahman ", " Official Music Video | Eagle Music");
		addVideoItem("XChdfPIvoIo", "Deyale Deyale | Minar | Tomar Amar Prem", "Minar | Tomar Amar Prem | Siam | Ognila | Mizanur Rahman Aryan ");
		addVideoItem("Pm3KHU-edJo", "Minar Rahman - Shagorer Tirey", "Minar Rahman - Shagorer Tirey");
		addVideoItem("nJT--MlnCBk", "Aha Re || আহারে || Minar Rahman | Taneem Rahman Angshu ", "Minar Rahman | Taneem Rahman Angshu | Superhit Bangla Song");
		addVideoItem("dhSz7MoEpYk", "Ki Tomar Naam - Minar Rahman | Angshu | Asif Iqbal", "Minar Rahman | Angshu | Asif Iqbal | Sajid | New Bangla Song");
		addVideoItem("F9Dl-1V4NYc", "Shada || সাদা || Minar || Tahsan || Danpite ", "Tahsan || Danpite || Bangla New Song || Official Lyrical video");
		addVideoItem("3fcs8SncEDs", "CHOKH | Minar | Mehedi Hasan Limon | Mabrur Rashid Bannah", "Mehedi Hasan Limon | Mabrur Rashid Bannah | Minar Eid Song");
		addVideoItem("13wqHPe3O1Y", "Minar Rahman - Ta Jani Na ", "Minar Rahman - Ta Jani Na ");
		addVideoItem("aski3l0Vwic", "Ektukhani | Minar Rahman | Tawsif | Mehazabien | Asif Iqbal | Sajid Sarker", "Minar Rahman | Tawsif | Mehazabien | Asif Iqbal | Sajid Sarker | Hime |");
		addVideoItem("UIyRzMvn5Cs", "Miche Mayar Shohore | Minar Rahman | মিছে মায়ার শহরে", "মিছে মায়ার শহরে | মিনার | Romantic Song | Soundtek");
		addVideoItem("vn6gLuenecw", "Tumi Tomar Moto - Minar Rahman", "Tumi Tomar Moto - Minar Rahman");
		addVideoItem("HnMVFshDSok", "Jodi Tumi Jante (Full Song) | MINAR | Mehazabien | apurba", " MINAR | Mehazabien | Apurba | Jakaria Showkhin | Official Video Song");
		addVideoItem("hdQbmcpLTdg", "Barabari - Minar Rahman | Mamo | Rajdeep | Angshu | Asif Iqbal", " Minar Rahman | Mamo | Rajdeep | Angshu | Asif Iqbal | Sajid Sarker | New Bangla Song");
		addVideoItem("ZsZ5aKVSQas", "Minar Rahman - Ami To Amoni | আমিতো এমনই ", "| Official Music Video | Valentine's Day");
		addVideoItem("UcsoejxOJ9w", "MINAR - NEI (নেই) | Nazir Mahamud | Mehedi Hasan Limon", "Nazir Mahamud | Mehedi Hasan Limon | With Lyrics | Minar Song");
		addVideoItem("qBtvVY_znaY", "Deyale Deyale | দেয়ালে দেয়ালে | Minar Rahman ", "Minar Rahman | Emon Chowdhury | Official Lyrical Video");
		addVideoItem("-VcGNuf_EVw", "Ami Tomar Kache Jabo - Minar Rahman (Official Music Video) ", " Minar Rahman (Official Music Video) | New Bangla Song");
		addVideoItem("UNOov8EADBA", "Tuito Amar Shob (তুই তো আমার সব) | Minar | Apurba", " Minar | Apurba | Tanjin Tisha | Ost of 'Shunte Ki Pao");
		addVideoItem("sVYzRuWSKs0", "Niruddesh | Minar | Bangla New Song ", "Niruddesh | Minar | Bangla New Song");
		addVideoItem("GEnVvB51Lqw", "Keno Dishehara | Minar Rahman | Sajid Sarker", "Minar Rahman | Sajid Sarker | Lyrical Video | New Bangla");
		addVideoItem("CwfbD1t5ie0", "Dure Hariye | Sajid Feat Minar | Batch 27 |", " Minar | Batch 27 | Mithila | Apurba | Bangla New Song |Mizanur Rahman Aryan");
		addVideoItem("lTx5Kx50Wb0", "Minar Rahman | Akhon | এখন | মিনার রহমান", "Apurba, Samia Othoi | Valentine Day Song | Sangeeta Music");
		addVideoItem("E2ML0M0ucNs", "Minar - Alo Nei Alote (আলো নেই আলোতে -মিনার)", ") Lyrics Video | Bangla Song | Soundtek");
		addVideoItem("MAvWVqrikxI", "Ghum | ঘুম | Tahsan | Minar | Bangla New Song", "Ghum | ঘুম | Tahsan | Minar | Bangla New Song");
		addVideoItem("scxowhxbj-w", "Minar Rahman | Ektu Ghor Chara | একটু ঘর ছাড়া ", "Minar Rahman | Ektu Ghor Chara | একটু ঘর ছাড়া ");
		addVideoItem("vmedGW707yc", "Nei | নেই | MINAR | Official Music Video | Zaher Alvi", "Zaher Alvi | Loren Mendes | Bangla Song");
		addVideoItem("d8T-z4Xkb6w", "Hridoyer Daak - Minar Rahman | Sajid | Apurba | Tisha | Aryan", "Sajid | Apurba | Tisha | Aryan | Dekha Hobe Ki | New Bangla Song");
		addVideoItem("xWooVNFIE90", "Tumi Thako Kotodure | তুমি থাকো কতদূরে ", "MINAR | Afran Nisho | Mehazabien | Protidin ");
		addVideoItem("VGIydylesYA", "KHOJ | খোঁজ | Minar | Official Music Video", "KHOJ | খোঁজ | Minar | Official Music Video");
		addVideoItem("dMSv4xb2rgs", "Duur Theke | Minar Rahman | Afran Nisho | Sharlin", "Minar Rahman | Afran Nisho | Sharlin | Drama - Jokhon Boshonto");
		addVideoItem("-TmJptWDtgo", "Tomar Valo Hok | MINAR | Apurba | Mehazabien ", "MINAR | Apurba | Mehazabien | MH Limon | Mr & Ms Chapabaz");
		addVideoItem("9_x5POf5nuQ", "MINAR - Nei (নেই) | Mishu Sabbir | Tasnia Farin", " Mishu Sabbir | Tasnia Farin | Tamim Mridha | Video Song | Bangla Song");
		createPlayList("Minar", R.drawable.vedio_icon);
		//==========================================================================



		//==========Shironamhin All Song=============================================================
		//==========================================================================================
		//==========================================================================================
		addVideoItem("agYzgxruck0", "Ei Obelai Tumari Akashe", "Shironamhin | Ei Obelay | Official Music Video");
		addVideoItem("p19rIhIKZs4", "Perfume Song By Shironamhin ", "Shironamhin - Perfume Music Video");
		addVideoItem("Cptlr__Fwx4", "Abar Hashimukh - Song By Shironamhin ", "Shironamhin - Abar Hashimukh [Official Music Video]");
		addVideoItem("kd-ZPYxTFUQ", "Shironamhin - JADUKOR Official Music Video", "Shironamhin - JADUKOR Official Music Video");
		addVideoItem("GPJ6WxtUuBQ", "Pakhi Song By ShironamHin", "Shironamhin - Pakhi [Official Music Video]");
		addVideoItem("8OpMq5tnIzs", "Cafeteria Periye  Song By ShironamHin", "Cafeteria Periye  Song By ShironamHin");
		addVideoItem("OoMJ55MIC0E", "Bondho Janala | by Shironamhin | Album Bondho Janala", "Album Bondho Janala | Official Lyrical Video");
		addVideoItem("bOFutRM3F1w", "Shironamhin - Ei Obelay (এই অবেলায়) Lyrical Video", "Lyrical Video | Bengali Lyrics");
		addVideoItem("TKPQ47FDuf0", "Onek Asha Niye- Shironamhin (Lyrics)", "Onek Asha Niye- Shironamhin (Lyrics)");
		addVideoItem("xl688wSxKRo", "Bohemian - Song By Shironamhin", "Shironamhin - Bohemian Official Music Video");
		addVideoItem("MUIShVLMiMA", "Shironamhin | Kashfuler Shohor Dekha ", "Kashfuler Shohor Dekha | Official Music Video");
		createPlayList("Shironamhin", R.drawable.vedio_icon);
		//==========================================================================


		//==========ArtCell All Song=============================================================
		//==========================================================================================
		//==========================================================================================
		addVideoItem("qw1CVt43VKw", "Oniket Prantor || Artcell || Bangla New Band Song ", "Artcell || Bangla New Band Song || Official Lyrical Video");
		addVideoItem("ECh1rS2ipJw", "Dukkho Bilash | Artcell | Anushilon | Bangla New Song ", " Artcell | Anushilon | Bangla New Song | Official Lyrical Video");
		addVideoItem("CKfhGvUPXkY", "Poth Chola | পথ চলা | Artcell Band | Album Onnosomoy ", " Artcell Band | Album Onnosomoy | Bangla New Song | Official Lyrical Video");
		addVideoItem("s8Qk0eMxsLA", "Dhushor Shomoy || ধূসর সময় || Artcell || Oniket Prantor ", "Artcell || Oniket Prantor || Bangla Band Song || ");
		addVideoItem("DV4AUG4XMhc", "Ei Bidaye || এই বিদায়ে || Artcell", "Artcell || Live Now || Original Track ");
		addVideoItem("ye-9Cqa_SC8", "Dukho Bilash | Artcell | Banglalink presents's Legends of Rock", "Dukho Bilash | Artcell | Banglalink presents's Legends of Rock");
		addVideoItem("a4zZYrKQPLI", "Ei Brishti Bheja Raate tumi nei bole", "Artcell Song");
		addVideoItem("AwLUf-xVk8s", "Kandari Hushiar || Artcell || Rock 303 (2009)", "Artcell || Rock 303 (2009) || Bangla Band Song || G Series");
		addVideoItem("ZZvKjEV0N6k", "Onnosomoy | Artcell | Full Album | Audio Jukebox ", "Onnosomoy | Artcell | Full Album | Audio Jukebox ");
		createPlayList("ArtCell", R.drawable.vedio_icon);
		//==========================================================================


		//==========Warfezz All Song=============================================================
		//==========================================================================================
		//==========================================================================================
		addVideoItem("uB2rhjulY4Q", "Purnota song By WaFaze", "Warfaze Song");
		addVideoItem("CLUL2eO9o9w", "Rupkotha song By WaFaze", "Warfaze Song");
		addVideoItem("lOLo2WokugA", "Boshe Achi song By WaFaze", "Warfaze Song");
		addVideoItem("Qh_sxMN9UH8", "Obak Bhalobasha song By WaFaze", "Warfaze Song");
		addVideoItem("WntnEzmkQy4", "Joto Dure song By WaFaze", "Warfaze Song");
		addVideoItem("MljXVaZ68z8", "Tomake - তোমাকে song By WaFaze", "Warfaze Song");
		addVideoItem("OK7ztslIQTE", "Oshamajik song By WaFaze", "Warfaze Song");
		addVideoItem("JDKoEBWF8tE", "Arshi Nogor - song by Warfeze", "Warfaze Song");
		addVideoItem("vVlqUWfZWro", "Warfaze- Moharaj ", "Warfaze Song");
		addVideoItem("O1HWqZJA2UU", "Warfaze- Ekti Chele ", "Warfaze Song");
		addVideoItem("V6dzVSc6I2A", "Warfaze- Nirbashon ", "Warfaze Song");
		addVideoItem("YNiGeRqjurk", "Oporup Bishmoy ", "Warfaze Song");
		addVideoItem("rVY2A3pWYfc", "Boshey achi eka | Warfaze | ", "Warfaze Song");
		addVideoItem("qNxzdavmbBg", "Asha- Warfaze", "Warfaze Song");
		addVideoItem("Bx9shXiV-3g", "Tomake - Song By Wafaze", "Warfaze Song");
		addVideoItem("", "", "");

		createPlayList("Warfaze", R.drawable.vedio_icon);
		//==========================================================================





		//==========Aurthohin All Song=============================================================
		//==========================================================================================
		//==========================================================================================
		addVideoItem("ezAtfMxqUWQ", "Aurthohin - Epitaph Lyrics", "Aurthohin - Epitaph Lyrics");
		addVideoItem("rImHVpqWjzo", "Aushomapto 1 || Aurthohin | Bangla Band Song", "Aushomapto 1 || Aurthohin | Bangla Band Song");
		addVideoItem("Fj_zM3rzKZs", "AMAR PROTICCHOBI - TAPOSH FEAT. SUMON ", "AMAR PROTICCHOBI - TAPOSH FEAT. SUMON [ AURTHOHIN ] : OMZ WIND OF CHANGE");
		addVideoItem("3I3l-x93kOY", "Aurthohin - Anmone 2", "Aurthohin - Anmone 2");
		addVideoItem("yRJfK82Zzkg", "Chera Shopno(Aurthohin)", "Chera Shopno(Aurthohin)");
		addVideoItem("gko3TvH4SJU", "Aushomapto ft. Aurthohin | Aushomapto-1", "Aushomapto ft. Aurthohin | Aushomapto-1");
		addVideoItem("rIF_wLXOyP0", "Chaitei Paro by Aurthohin Lyrics", "");
		addVideoItem("UWyx6W8pS24", "Aurthohin - Karon Tumi Omanush (Nikkrishto Revisited)", "Aurthohin - Karon Tumi Omanush (Nikkrishto Revisited)");
		addVideoItem("UeLBp-9W9Ps", "odvut sei cheleti lyric by Aurthohin", "odvut sei cheleti lyric by Aurthohin");
		addVideoItem("fMy9AKlrKJI", "Jodi Kono Din || Aurthohin || Sumon || Lyrics Video.", "Jodi Kono Din || Aurthohin || Sumon || Lyrics Video.");
		addVideoItem("BhWwacWlrzs", "Nikrishto 3 by Aurthohin lyrics", "Nikrishto 3 by Aurthohin lyrics");
		createPlayList("Aurthohin", R.drawable.vedio_icon);
		//==========================================================================


		//==========Music Vedio=============================================================
		//==========================================================================================
		//==========================================================================================
		addVideoItem("2Z_drR59mcg", "Emon Ekta Tumi Chai | IMRAN | SAFA KABIR", "IMRAN | SAFA KABIR | Bangla Song");
		addVideoItem("Dufi0ojEWRY", "Valo Achi Valo Beshe | Imran | Nancy | Mahmud Mahin | Music Video | DAAG", "Imran | Nancy | Jim | Mahmud Mahin | Music Video | DAAG");
		addVideoItem("Fx0-JhRGpgs", "Ekla Amar Mon | Kazi Shuvo | Official Music Video | Bangla New Song", " Kazi Shuvo | Official Music Video | Bangla New Song");
		addVideoItem("ddNa2TN9R9k", "Kanba Niralate | কানবা নিরালাতে | Akash Mahmud | Sheikh Sakib |Jim", " Akash Mahmud | Sheikh Sakib |Jim | Sad Song | Bangla New Song ");
		addVideoItem("N5bLrSzVCtA", "Facebook Password | Suzon Ahmed | Anan Khan | Jim", "Suzon Ahmed | Anan Khan | Jim | Bangla New Song");
		addVideoItem("8P7qUS__Ypk", "Ek Jibon | Shahid and Subhamita Banerjee", " Shahid and Subhamita Banerjee | Original HD Music Video | Bangla Song");
		addVideoItem("rf0SZoCyzPs", "Ek Dekhay | এক দেখায় | IMRAN | PORSHI | Official Music Video", "IMRAN | PORSHI | Official Music Video | Bangla Song");
		addVideoItem("WJBViwf9L8Q", "Tomari Achi | তোমারই আছি | Official Music Video ", "Music Video | IMRAN | Sabila Nur | Labiba | Bangla Song");
		addVideoItem("WJBViwf9L8Q", "Tomari Achi | তোমারই আছি | Official Music Video", " Music Video | IMRAN | Sabila Nur | Labiba | Bangla Song");
		addVideoItem("cnEjFb6uv_o", "Ovinoy | Noble Man | Bangla Rock Song | অভিনয়", "Ovinoy | Noble Man | Bangla Rock Song | অভিনয়- Nobel");
		addVideoItem("t0JnViJ6FZM", "Dekhna O Rosiya | দেখনা ও রসিয়া | Hitman", "Hitman | Tanjina Ruma | Bangla Movie item Song");
		addVideoItem("dWUqE0JwunQ", "Kalo Shari | Ankur Mahamud Feat Jisan Khan Shuvo", "Ankur Mahamud Feat Jisan Khan Shuvo | Bangla Song 2021 | Official Video");
		addVideoItem("o4558ILxroA", "Jani Pabona | IMRAN | SHITHEE | Official Music Video", " IMRAN | SHITHEE | Official Music Video | Nadia Mim | Bangla Song");
		addVideoItem("FAt1d11UOg8", "Tor Mon Paray | Pammi Multimedia | Ayon Chaklader ft Mahdi Sultan", "Pammi Multimedia | Ayon Chaklader ft Mahdi Sultan | Rasel and Shakila |");
		addVideoItem("5f1O74GwWJM", "KOMOLA - Ankita Bhattacharyya | Bengali Folk Song", "Ankita Bhattacharyya | Bengali Folk Song | Music Video ");
		addVideoItem("YHj-Gk92fvs", "Poran Bondhure | IMRAN | Payel | Official Music Video", " IMRAN | Payel | Official Music Video | Bangla Song ");
		addVideoItem("sqQ9Ot0UyPs", "Shoroter Shesh Thekey (Official Music Video)", "Shesh Thekey (Official Music Video) | Pritom Hasan | Israt Sabrin | ");
		addVideoItem("k-8wibqPyMQ", "Keno Eto Chai Toke | IMRAN | LABIBA | Official Music Video", "IMRAN | LABIBA | Official Music Video | Asif | Payel | Bangla Song ");
		addVideoItem("vbynQxzWM6E", "Kichu Kotha | Imran & Bristy | কিছু কথা ", "Official Music Video | Sangeeta");
		addVideoItem("sjAK-JkPVaw", "Panjabiwala | Tribute to Legend | Abdul Gafur Hali", " Abdul Gafur Hali | Bangla Music Video 2017 | Sarika | Redoan Rony");
		addVideoItem("zS3FOSLE2Co", "Dure Dure - Imran ft Puja Directed by Shimul Hawladar", " Puja Directed by Shimul Hawladar | Bangladeshi New Music Video");
		addVideoItem("_NcIxBFEL6k", "Ruper Jadu | রুপের জাদু | Alvee | Shima | Anamika Oyshe", "Alvee | Shima | Anamika Oyshe | Rizan | Bangla New Song");
		addVideoItem("qf1y_ADlOsk", "Aula Jhaula | আউলা-ঝাউলা | Dighi | Shouquat Ali Imon feat Labony Shahriar", "Dighi | Shouquat Ali Imon feat Labony Shahriar");
		addVideoItem("qbN7DtPAKQo", "Oporadhi | Ankur Mahamud Feat Arman Alif ", " Ankur Mahamud Feat Arman Alif | Bangla Song");
		addVideoItem("5f1O74GwWJM", "KOMOLA - Ankita Bhattacharyya | Bengali Folk Song", "Ankita Bhattacharyya | Bengali Folk Song | Music Video");
		addVideoItem("dyt0Nv3xpl8", "Jonom Jonom | জনম জনম | New Bangla Song ", " New Bangla Song | Imran | Porshi | Robiul Islam Jibon");
		addVideoItem("dYS33y7mMlI", "কাগজের নোট | GxP | Bangla Rap Song ", "Official Music Video");
		addVideoItem("296Gi_nnbho", "Bolte Bolte Cholte Cholte | বলতে বলতে চলতে চলতে", "|Imran mahmudul|Tanjin Tisha |Official HD music video");
		addVideoItem("0k9I8lKqoBE", "Depression Title Song | Musfiq R. Farhan, Parsa Evana ", "Musfiq R. Farhan, Parsa Evana | GR Tanmoy | Bangla New Music Video ");
		addVideoItem("qggx-7o5cqU", "Babu Khaicho | বাবু খাইছো ? ", "বাবু খাইছো ? | DJ Maruf | Bangla Song ");
		addVideoItem("MnPLgyvPw9M", "Tomay Chowar Icche | তোমায় ছোঁয়ার ইচ্ছে |Shiekh Sadi", "Tomay Chowar Icche | তোমায় ছোঁয়ার ইচ্ছে |Shiekh Sadi");
		addVideoItem("zlrqUp7oI3U", "Moner Ghor | মনের ঘর | IMRAN MAHMUDUL | Nadia Afrin Mim", "IMRAN MAHMUDUL | Nadia Afrin Mim | Official Music Video | Bangla Song ");
		addVideoItem("StzXBNIKQYI", "Eto Bhalobashi | এতো ভালোবাসি | IMRAN MAHMUDUL | Payel ", "IMRAN MAHMUDUL | Payel | Music Video | Jamal Hossain");
		addVideoItem("rf0SZoCyzPs", "Ek Dekhay | এক দেখায় | IMRAN | PORSHI", "IMRAN | PORSHI | Official Music Video | Bangla Song");
		addVideoItem("DWC0iN3wXOQ", "কে রাখে আমারে | Ke Rakhe Amare | Imran Mahmudul", "Imran Mahmudul | Jisan Khan Shuvo | Bangla Song");
		addVideoItem("3rSUsMCO9o4", "A Badhon Jabena Chire | Nusraat Faria & Imran Mahmudul", "| Nusraat Faria & Imran Mahmudul | Bangla New Song ");
		addVideoItem("s0kMj92nAuM", "Hoyto Tomar Shathe | হয়তো তোমার সাথে | Official Music Video", "Music Video | IMRAN | Shakila | Bangla Song ");
		addVideoItem("o4558ILxroA", "Jani Pabona | IMRAN | SHITHEE | Official Music Video", "Music Video | Nadia Mim | Bangla Song ");
		addVideoItem("ZAEcrESkzk0", "Fire Asho Na | IMRAN | Peya Bipasha | Bangla new song", " IMRAN | Peya Bipasha | Bangla new song |");
		addVideoItem("c5PQVYuAUas", "Ami Nei Amate | Imran & Bristy | আমি নেই আমাতে", "আমি নেই আমাতে | ইমরান ও বৃষ্টি | Official Music Video | Sangeeta");
		addVideoItem("yZcuaNRPGHc", "Amar Kache Tumi Onnorokom | IMRAN | SAFA KABIR ", "IMRAN | SAFA KABIR | Official Music Video | Bangla Song");
		addVideoItem("XjeXL_nzT20", "Imran | Borsha Chokhe | বর্ষা চোখে | ইমরান ", "বর্ষা চোখে | ইমরান | Eid-ul-Adha Exclusive | Official Music Video");
		addVideoItem("5bSzF1z1yNo", "Jodi Hatta Dhoro | Imran & Bristy | New Music Video", " Imran & Bristy | New Music Video ");
		addVideoItem("ydld2UICePg", "Amar Moner Akashe | আমার মনের আকাশে", " Imran Mahmudul | Mariya Nooni | Anupam");
		addVideoItem("MvPdt4tbh40", "HateKhori | হাতেখড়ি | IMRAN | KONAL | Apurba | Mehazabien", "IMRAN | KONAL | Apurba | Mehazabien | Uro Prem | Natok Song |Bangla Song");
		addVideoItem("dlL5wGyhIlA", "Alo | আলো | IMRAN | PONI CHAKMA | Keya Payel", "PONI CHAKMA | Keya Payel | Official Music Video ");
		addVideoItem("1Du0anP0Ztk", "Imran, Shuvomita - Khoy | ক্ষয় | Official Music Video", " Official Music Video | Eid Exclusive ");
		addVideoItem("dVjVeGOFZl8", "Tor Ek Isharay | IMRAN | Official Music Video | Imran Eid Song", "Tor Ek Isharay | IMRAN | Official Music Video | Imran Eid Song");
		addVideoItem("kNthZg3czGs", "Priyo Obhiman | প্রিয় অভিমান | IMRAN | Apurba | Zakia Momo ", "IMRAN | Apurba | Zakia Momo | Official Music Video | Bangla Song");

		addVideoItem("n77vUQkVDv8", "Tumi Chokh Mele Takale By Imran & Oyshee | HD Music Video", "Tumi Chokh Mele Takale By Imran & Oyshee | HD Music Video");
		addVideoItem("J-lnCsmY14s", "Aradhona | আরাধনা | IMRAN | NIRJHOR | Sabnam Faria | Shipan", "IMRAN | NIRJHOR | Sabnam Faria | Shipan | Official Music Video");
		addVideoItem("LFw2WPMLSF4", "Keno Bare Bare | Imran & Puja | কেন বারে বারে | ইমরান ও পূজা ", "কেন বারে বারে | ইমরান ও পূজা | Official Music Video | Sangeeta");
		addVideoItem("GnWehAFliRo", "Amar E Mon | আমার এ মন । Imran | Tanjin Tisha | Romantic Song of the Year", " Imran | Tanjin Tisha | Romantic Song of the Year | New Bangla Song");
		addVideoItem("WybdcmM8m7Q", "Jodi Ekdin - যদি একদিন - Imran Mahmudul & Anisha - Robiul Islam Jibon", "Jodi Ekdin - যদি একদিন - Imran Mahmudul & Anisha - Robiul Islam Jibon");
		addVideoItem("dgn3-eYNuk4", "Manena Mon | মানেনা মন | IMRAN | PUJA | Suzena Zafar | Raunaq", " IMRAN | PUJA | Suzena Zafar | Raunaq | Official Music Video | Bangla Song");
		addVideoItem("P-HzSNV0Mqc", "Amar Moner Akashe | আমার মনের আকাশে | HD | Imran Mahmudul | Mariya Nooni", " Imran Mahmudul | Mariya Nooni | Anupam | New Music");
		addVideoItem("-uINOhvyeSY", "Sobai Chole Jabe | Imran & Palak Muchhal | সবাই চলে যাবে ", "Imran & Palak Muchhal | সবাই চলে যাবে | Saira | Official Music Video | Soundtek");
		addVideoItem("eB1I5yeYl6g", "Bolo Sathiya | IMRAN and BRISTY | Bangla new song", "IMRAN and BRISTY | Bangla new song 2016 | Official Video");
		addVideoItem("gYV1Xvwr0lg", "Dhoa | ধোঁয়া | Fuad feat Imran | Bangla new song 2017", "Dhoa | ধোঁয়া | Fuad feat Imran | Bangla new song 2017");
		addVideoItem("7izt614wtgI", "BAHUDORE | Imran | Brishty | Official Music Video", "BAHUDORE | Imran | Brishty | Official Music Video");
		addVideoItem("L5Tn-zL0xa8", "ANMONA | আনমনা | IMRAN I NAUMI | Ripon | Samia ", "IMRAN I NAUMI | Ripon | Samia | Rudra Mahfuz | Official Music Video | Bangla Song");
		addVideoItem("MplYhE0aOUc", "Issh | ইশ্ | Imran | Koushani | Bangla new song", " Imran | Koushani | Bangla new song");
		addVideoItem("bfpHRZkYTIw", "Abdar | আবদার | IMRAN | PORSHI| ", " IMRAN | PORSHI | Chandan Roy Chowdhury | Official Music Video | Bangla Song");
		addVideoItem("VyfapFr2fl8", "Hridoyer Shimana-IMRAN ft NAUMI -official MUSIC VIDEO HD", "Hridoyer Shimana-IMRAN ft NAUMI -official MUSIC VIDEO HD");
		addVideoItem("b9_ERAmYDFQ", "Mon Kharaper Deshe | মন খারাপের দেশে | IMRAN | Rothshi", " IMRAN | Rothshi | Official Music Video | Bangla Song");
		addVideoItem("7sgyKvIxzOE", "SHOPNO MAJHE | স্বপ্ন মাঝে | IMRAN | NAUMI", " IMRAN | NAUMI | OFFICIAL LYRICAL VIDEO | HRIDOY JURE | BANGLA SONG");
		addVideoItem("-cxdPjAaV1I", "Sokhi Valobasha Kare Koy | Imran feat Milon | Lvy", "Imran feat Milon | Lvy | Dure Dure | Official Music Video | Bangla Song");
		addVideoItem("HsNQ9fhN1L4", "Hridoy Amar || হৃদয় আমার || Porshi || Imran", "Porshi || Imran || Bangla Super Hit Song || Exclusive Lyrical Video");
		addVideoItem("ChX_Z9nxayY", "Tui Ki Amar Hobi ReIতুই কি আমার হবি রে| Pori Moni | Siam ", "Pori Moni | Siam | Kona | Imran | Bishwoshundori Movie Song");
		addVideoItem("L_k8LC33d5M", "ইমরান ও পুর্নিমার কন্ঠে গান । Imran। Purnima। Channel i", " Imran। Purnima। Channel i Music Award 2017 | Vuna Khichuri");
		addVideoItem("", "", "");
		createPlayList("Music Vedio", R.drawable.vedio_icon);


		//=================My Favourite Song========================================
		addVideoItem("pA2D5H4ufYo", "Aankhon Mein Teri Ajab Si Full HD | K.K | Om Shanti Om ", "Om Shanti Om | Shahrukh Khan | Deepika Padukone");
		addVideoItem("4P4Oa0pbZNQ", "Beete Lamhein Lyrics | KK | The Train | Mithoon", "The Train | Mithoon | Sayeed Qadri | Emraan Hashmi");
		addVideoItem("ztPa6vkM-yY", "Full Video: Guzarish | Ghajini | Aamir Khan, Asin | A.R. Rahman", "Aamir Khan, Asin | A.R. Rahman | Javed Ali, Sonu Nigam");
		addVideoItem("MVpAAJzPEds", "Chal Wahan Jaate Hain Full Song with LYRICS - Arijit Singh ", "Arijit Singh | Tiger Shroff, Kriti Sanon | T-Series");
		addVideoItem("Rid5Mj2J8xk", "Kya mujhe pyar hai (Tum Kyu Chale Aate Ho) ", "Kya mujhe pyar hai (Tum Kyu Chale Aate Ho) ");
		addVideoItem("vqJRytxAjog", "CHEF: Tere Mere With Lyrics | Saif Ali Khan", " Saif Ali Khan | Amaal Mallik feat. Armaan Malik | T-Series");
		addVideoItem("_eCiMG4MvfE", "Tere Mere Song | T-Series Acoustics | NEETI MOHAN ", "T-Series Acoustics | NEETI MOHAN | Chef | Bollywood Songs");
		addVideoItem("oJcfdIJ36xE", "Dube Dube | ডুবে ডুবে | Tanjib Sarowar | Samonty Shoumi ", "Tanjib Sarowar | Samonty Shoumi | Sajid Sarker | Bangla New Song");
		addVideoItem("RWnFowWtT78", "MINAR RAHMAN | JHOOM | Official Music Video", "MINAR RAHMAN | JHOOM | Official Music Video");
		addVideoItem("gviAd_TlhIQ", "Minar Rahman - Keu Kotha Rakheni ", " Keu Kotha Rakheni (Official Music Video");
		addVideoItem("A6sd_KN59FE", "Deulia | Tanjib Sarowar | Asha | New Bangla Song", "Deulia | Tanjib Sarowar | Asha | New Bangla Song");
		addVideoItem("HvH-DXHvnrM", " 60's LOVE", " 60's LOVE");
		addVideoItem("l2BooJEP8aM", "Mittha Shikhali | মিথ্যা শিখাইলি | Tanjib Sarowar | Sajid Sarker", "Tanjib Sarowar | Sajid Sarker | Official Music Video |Bangla Song ");
		addVideoItem("lX3vT_Gm_HE", "Dil Ko Karaar Aaya - Sidharth Shukla & Neha Sharma |", "Sidharth Shukla & Neha Sharma | Neha Kakkar & YasserDesai | Rajat Nagpal | Rana");
		addVideoItem("-FP2Cmc7zj4", "Lyrical: Labon Ko | Bhool Bhulaiyaa | Pritam | K.K.|", "Bhool Bhulaiyaa | Pritam | K.K.| Akshay Kumar, Shiney Ahuja, Vidya Balan");
		addVideoItem("ITyHqStTDeg", "Zindagi Kuch Toh Bata (Reprise) Full Song with LYRICS Pritam", "Song with LYRICS Pritam | Salman Khan | Bajrangi Bhaijaan");
		addVideoItem("EpEraRui1pc", "BOL DO NA ZARA Full Video Song | AZHAR", "AZHAR | Emraan Hashmi, Nargis Fakhri | Armaan Malik, Amaal Mallik");
		addVideoItem("c7POv4qiZLM", "Rabba Mein Toh Mar Gaya Oye Lyrical Video | Mausam", "Rabba Mein Toh Mar Gaya Oye Lyrical Video | Mausam | Shahid kapoor ,Sonam Kapoor");
		addVideoItem("XNexw0InY7U", "Dil Dooba (Neeli Ankhon Mein) I Karan Nawani", "Karan Nawani I Urvashi Kiran Sharma I Khakee");
		addVideoItem("NeXbmEnpSz0", "Zara Zara Bahekta Hai | JalRaj | RHTDM | Male Version ", "Zara Zara Bahekta Hai | JalRaj | RHTDM | Male Version ");
		addVideoItem("8kxufj_snhI", "Mera Mann Kehne Laga Full Song with Lyrics | Nautanki Saala", "Full Song with Lyrics | Nautanki Saala | Ayushmann Khurrana,Kunaal Roy Kapur");
		addVideoItem("f1qz8vn3XbY", "Ghar Se Nikalte Hi Song | Amaal Mallik Feat. Armaan Malik | Bhushan Kumar | Angel", "Ghar Se Nikalte Hi Song | Amaal Mallik Feat. Armaan Malik | Bhushan Kumar | Angel");
		addVideoItem("enHqt97v3ig", "ARO KOTO DIN AMI KHUJECHI TOMAKE ", "NANDITA II SEYLON MUSIC LOUNGE");
		addVideoItem("OUu19JIk-_k", "Amar Dehokhan - Odd Signature (Official)", "Amar Dehokhan - Odd Signature (Official)");
		addVideoItem("e52Ysc_bl_s", "Amar Bhindeshi Tara - Chondrobindu", "Amar Bhindeshi Tara - Chondrobindu");
		createPlayList("Favourite", R.drawable.vedio_icon);














	}

	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>




}

