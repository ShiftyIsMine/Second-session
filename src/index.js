import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import './chap060919/styles.css'
// import './chap04/Button.css';
// import './chap05/Clock.css';
import App from './App';
import ConfirmDialog from './chap04/ConfirmDialog';
import reportWebVitals from "./reportWebVitals";
import Notification from "./chap060919/Notification";
import Comment from './chap060912/Comment';
import CommentList from "./chap060912/CommentList";
import NotificationList from "./chap060919/NotificationList";
import Accommodate from "./chap060926/Accommodate";
// import Toggle from "./chap081010/Toggle"
// import Toggle2 from "./chap081010/Toggle2"
import ClickButton from "./chap081010/ClickButton";
// import Counter from "./chap081010/Counter";
import InputTest from "./chap081010/InputTest";
import ConfirmButton from "./chap081010/ConfirmButton";
import ConfirmButton2 from "./chap081010/ConfirmButton2";
import ConfirmButton3 from "./chap081010/ConfirmButton3";
// import Greeting from "./chp09/Greeting";
import LoginControl from "./chp09/LoginControl";
import Greeting from "./testtest/Greeting";
import MailBox from "./chp09/MailBox";
import LoginControl2 from "./chp09/LoginControl2";
// import MyButton from "./justpracprac/MyButton";
// import Counter from "./justpracprac/Counter";
import Toolbar from "./chp09/Toolbar";
import LandingPage from "./chp09/LandingPage";
import NameForm from "./chap11/NameForm";
import RequestForm from "./chap11/RequestForm";
import NameRequestForm from "./chap11/NameRequestForm";
import SignUp from "./chap11/SignUp"


const root = ReactDOM.createRoot(document.getElementById('root'));

    root.render(
        <React.StrictMode>
            <SignUp/>
        </React.StrictMode>
    );
// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
