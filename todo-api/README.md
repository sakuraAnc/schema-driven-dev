## SpringBoot ＋　Open API スキーマ駆動開発
1. `build.gradle` に依存関係を記述
2. `build.gradle` に**Gradleタスク**を定義する
3. `.yml` ファイルにAPI仕様を定義する
4. ./gradlewコマンドを実行し、2で定義したタスクを実行する
5. 4の結果をインターフェースをするRestControllerを実装する(メソッドは@Overrideする)