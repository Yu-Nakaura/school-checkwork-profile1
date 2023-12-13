# プロフィールアプリのチェックワーク

## Lv.1 好きな写真を表示させよう
自分のプロフィールを作成しよう!

### ・完成後アプリのキャプチャ画像

<img src="https://user-images.githubusercontent.com/112265560/215035633-f31ca356-6ee5-4522-a1cf-39ba85b563c5.png" width="320px">


### ・手順
0. viewBindingの設定をして、自分の好きな画像を`profile_image`という名前で`res`の中の`drawable`にコピーしよう。

##### エレメントの配置
1. `ImageView`を配置して、`profile_image`と設定しよう。画像は`profile_image`を設定してね。
2. `TextView`を配置して、`profile_label_text`と設定しよう。textには "名前"といれてね。
3. `TextView`を配置して、`profile_comment_text`と設定しよう。textには 自己紹介を書いてね。

##### レイアウトの設定
4. `ConstraintLayout`に変更しよう。
5. キャプチャ画像を見て並べよう。
6. `profile_image`が中央ぞろえになるように設定しよう。

		（ヒント）"scaleType"で調べてみよう
7. `profile_image`の`layout_width`を`0dp`に、`layout_height`を`wrap_content`に設定しよう。
8. 制約を付けよう。左右は`parent`と結びつけて、上下は対象の上下に位置するエレメントに結び付けよう。
9. マージンを付けてきれいに並べよう。
